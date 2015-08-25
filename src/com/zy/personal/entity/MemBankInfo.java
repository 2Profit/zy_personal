package com.zy.personal.entity;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.zy.common.entity.BaseEntity;
import com.zy.member.entity.Member;
/**
 * �û�������Ϣ��
 * 
 * @author Jeff Xu
 *
 */
@Entity
@Table(name = "mem_bank_info")
public class MemBankInfo extends BaseEntity{

	private static final long serialVersionUID = -5912885273347712648L;

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
