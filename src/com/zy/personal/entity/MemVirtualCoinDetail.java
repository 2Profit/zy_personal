package com.zy.personal.entity;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.zy.common.entity.BaseEntity;
import com.zy.member.entity.Member;

/**
 * 用户虚拟币记录
 * @author Jeff Xu
 *
 */
@Entity
@Table(name = "mem_virtual_coin_detail")
public class MemVirtualCoinDetail extends BaseEntity{

	private static final long serialVersionUID = -7468025135755691289L;
	
	private Member member;

	@ManyToOne
	@JoinColumn(name="member_id")
	public Member getMember() {
		return member;
	}

	public void setMember(Member member) {
		this.member = member;
	}

}
