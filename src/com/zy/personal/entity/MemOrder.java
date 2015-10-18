package com.zy.personal.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.zy.common.entity.BaseEntity;
import com.zy.member.entity.Member;

/**
 * 用户订单
 * @author Jeff Xu
 *
 */
@Entity
@Table(name = "mem_order")
public class MemOrder extends BaseEntity{

	public static final Integer statusNoPay = 0;
	public static final Integer statusPaySuccess = 1;
	public static final Integer statusPayFail = 2;
	
	private static final long serialVersionUID = 5147576410248508819L;

	private String orderId;			//订单号
	
	private Member member;

	private double amount;			//金额
	
	private Integer payType;		//支付方式	0支付宝 、1微信、2银行
	
	private Integer status;			//状态 0未支付、1支付成功、2支付失败

	private String msg;				//备注

	@Column(name="order_id")
	public String getOrderId() {
		return orderId;
	}

	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}

	@ManyToOne
	@JoinColumn(name="member_id")
	public Member getMember() {
		return member;
	}

	public void setMember(Member member) {
		this.member = member;
	}
	
	@Column(name="amount")
	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}

	@Column(name="pay_type", precision=1)
	public Integer getPayType() {
		return payType;
	}

	public void setPayType(Integer payType) {
		this.payType = payType;
	}

	@Column(name="status", precision=1)
	public Integer getStatus() {
		return status;
	}

	public void setStatus(Integer status) {
		this.status = status;
	}

	@Column(name="msg", length=512)
	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}

}
