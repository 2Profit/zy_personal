package com.zy.personal.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.zy.common.entity.BaseEntity;
import com.zy.member.entity.Member;

/**
 * 虚拟币变化记录
 * @author Administrator
 *
 */
@Entity
@Table(name="mem_coin_log")
public class MemCoinLog extends BaseEntity {

	public static final Integer TYPE_PAY = 0;		//充值
	public static final Integer TYPE_EXPEND = 1;	//消费
	
	public static final Integer CHANGE_TYPE_ZXCZ = 0;	//前台用户在线充值
	public static final Integer CHANGE_TYPE_HTCZ = 1;	//后台充值提案
	public static final Integer CHANGE_TYPE_EDTZ = 2;	//额度直接调整
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 4742864611796180509L;

	private Member member;				//
	
	private Integer beforeCoin;			//变化前
	
	private Integer coin;				//变化额度
	
	private Integer afterCoin;			//变化后
	
	private Integer type;				//类型   充值、消费
	
	private Integer changeType;			//改变方式
	
	private String changeId;			//改变操作实体ID

	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="member_id")
	public Member getMember() {
		return member;
	}

	public void setMember(Member member) {
		this.member = member;
	}

	@Column(name="before_coin")
	public Integer getBeforeCoin() {
		return beforeCoin;
	}

	public void setBeforeCoin(Integer beforeCoin) {
		this.beforeCoin = beforeCoin;
	}

	@Column(name="coin")
	public Integer getCoin() {
		return coin;
	}

	public void setCoin(Integer coin) {
		this.coin = coin;
	}

	@Column(name="after_coin")
	public Integer getAfterCoin() {
		return afterCoin;
	}

	public void setAfterCoin(Integer afterCoin) {
		this.afterCoin = afterCoin;
	}

	@Column(name="type", precision=1)
	public Integer getType() {
		return type;
	}

	public void setType(Integer type) {
		this.type = type;
	}

	@Column(name="change_type", precision = 1)
	public Integer getChangeType() {
		return changeType;
	}

	public void setChangeType(Integer changeType) {
		this.changeType = changeType;
	}

	@Column(name="change_id")
	public String getChangeId() {
		return changeId;
	}

	public void setChangeId(String changeId) {
		this.changeId = changeId;
	}
	
}
