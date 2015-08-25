package com.zy.personal.entity;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.zy.common.entity.BaseEntity;
import com.zy.member.entity.Member;
/**
 * 用户积分信息表
 * 
 * @author Jeff Xu
 *
 */
@Entity
@Table(name = "mem_integral")
public class MemIntegral extends BaseEntity{

	private static final long serialVersionUID = 1031106851703761858L;

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
