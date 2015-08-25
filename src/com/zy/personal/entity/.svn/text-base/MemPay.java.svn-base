package com.zy.personal.entity;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.zy.common.entity.BaseEntity;
import com.zy.member.entity.Member;
/**
 * 用户支付信息
 * @author Jeff Xu
 *
 */
@Entity
@Table(name = "mem_pay")
public class MemPay extends BaseEntity{

	private static final long serialVersionUID = 6199311598304621981L;

	private Member member;
	
	private MemOrder memOrder;

	@ManyToOne
	@JoinColumn(name="member_id")
	public Member getMember() {
		return member;
	}

	public void setMember(Member member) {
		this.member = member;
	}

	@ManyToOne
	@JoinColumn(name="order_id")
	public MemOrder getMemOrder() {
		return memOrder;
	}

	public void setMemOrder(MemOrder memOrder) {
		this.memOrder = memOrder;
	}
	
}
