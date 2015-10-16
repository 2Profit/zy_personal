package com.zy.personal.service;

import java.math.BigDecimal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zy.base.entity.ExchangeRate;
import com.zy.base.service.ExchangeRateService;
import com.zy.common.service.CommonService;
import com.zy.member.entity.Member;
import com.zy.member.service.MemberService;
import com.zy.personal.dao.MemPayDao;
import com.zy.personal.entity.MemCoinLog;
import com.zy.personal.entity.MemOrder;
import com.zy.personal.entity.MemPay;

@Service
public class MemPayService extends CommonService<MemPay, String> {

	@Autowired
	private MemPayDao memPayDao;
	
	@Autowired
	private MemOrderService memOrderService;
	
	@Autowired
	private ExchangeRateService exchangeRateService;
	
	@Autowired
	private MemCoinLogService memCoinLogService;
	
	@Autowired
	private MemberService memberService;
	
	@Autowired
	public void setMemPayDao(MemPayDao memPayDao){
		super.setCommonDao(memPayDao);
	}
	
	/**
	 * 订单支付成功
	 * @param orderId
	 */
	public Member savePay(String orderId, Member member){
		MemOrder memOrder = memOrderService.find(orderId);
		memOrder.setStatus(MemOrder.statusPaySuccess);
		memOrderService.update(memOrder);
		
		MemPay memPay = new MemPay();
		memPay.setCreateId(member.getId());
		memPay.setMember(member);
		memPay.setMemOrder(memOrder);
		memPay.setStatus(MemOrder.statusPaySuccess);
		//支付宝返回的订单号
		memPay.setPayId("");
		memPayDao.save(memPay);
		
		double amount = memOrder.getAmount();
		ExchangeRate exchangeRate = exchangeRateService.findCurrentExchangeRate();
		int coin = 0;
		if(exchangeRate != null){
			coin = new BigDecimal(amount * exchangeRate.getCoin() / exchangeRate.getRmb()).intValue();
		}else{
			coin = (int) (amount * 1);
		}
		
		MemCoinLog memCoinLog = new MemCoinLog();
		memCoinLog.setBeforeCoin(member.getCoin() == null ? 0 : member.getCoin());
		memCoinLog.setCoin(coin);
		memCoinLog.setAfterCoin(memCoinLog.getBeforeCoin() + coin);
		memCoinLog.setChangeId(orderId);
		memCoinLog.setChangeType(MemCoinLog.CHANGE_TYPE_ZXCZ);
		memCoinLog.setCreateId(member.getId());
		memCoinLog.setMember(member);
		memCoinLog.setType(MemCoinLog.TYPE_PAY);
		memCoinLogService.save(memCoinLog);
		
		member.setCoin(memCoinLog.getAfterCoin());
		return memberService.update(member);
	}
	
}
