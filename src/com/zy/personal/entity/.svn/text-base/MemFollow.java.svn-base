package com.zy.personal.entity;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.zy.common.entity.BaseEntity;
import com.zy.member.entity.Member;
/**
 * 用户关注表
 * 
 * @author Jeff Xu
 *
 */
@Entity
@Table(name = "mem_follow")
public class MemFollow extends BaseEntity{

	private static final long serialVersionUID = 2124538602613731461L;

    private Member member;
	
	//粉丝
	private Member follow;

	@ManyToOne
	@JoinColumn(name="member_id")
	public Member getMember() {
		return member;
	}

	public void setMember(Member member) {
		this.member = member;
	}

	@ManyToOne
	@JoinColumn(name="follow_id")
	public Member getFollow() {
		return follow;
	}

	public void setFollow(Member follow) {
		this.follow = follow;
	}
	
}
