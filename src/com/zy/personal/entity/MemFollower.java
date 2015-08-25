package com.zy.personal.entity;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.zy.common.entity.BaseEntity;
import com.zy.member.entity.Member;

/**
 * ”√ªß∑€Àø±Ì
 * 
 * @author Jeff Xu
 *
 */
@Entity
@Table(name = "mem_follower")
public class MemFollower extends BaseEntity{

	private static final long serialVersionUID = 8459268380050827355L;

	private Member member;
	
	//∑€Àø
	private Member follower;

	@ManyToOne
	@JoinColumn(name="member_id")
	public Member getMember() {
		return member;
	}

	public void setMember(Member member) {
		this.member = member;
	}

	@ManyToOne
	@JoinColumn(name="follower_id")
	public Member getFollower() {
		return follower;
	}

	public void setFollower(Member follower) {
		this.follower = follower;
	}
	
}
