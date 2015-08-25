package com.zy.personal.entity;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.zy.common.entity.BaseEntity;
import com.zy.member.entity.Member;

/**
 * 用户点赞表
 * 
 * @author Jeff Xu
 *
 */
@Entity
@Table(name = "mem_prasie")
public class MemPrasie extends BaseEntity {

	private static final long serialVersionUID = -4947281583522135756L;

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
