package com.zy.personal.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.zy.common.entity.BaseEntity;
import com.zy.member.entity.Member;
/**
 * 用户银行信息表
 * 
 * @author Jeff Xu
 *
 */
@Entity
@Table(name = "mem_bank_info")
public class MemBankInfo extends BaseEntity{

	private static final long serialVersionUID = -5912885273347712648L;

	private String bankAccount;//银行账户  改成  银行名称
	private String bankCardNum;//银行账号
	private String bankAddress;//银行地址		改成 账户持有人姓名
	private String bankPhotoUrl;//银行卡照片
	
	@Column(name = "bank_account", length=64)
	public String getBankAccount() {
		return bankAccount;
	}
	public void setBankAccount(String bankAccount) {
		this.bankAccount = bankAccount;
	}
	@Column(name = "bank_card_num", length=64)
	public String getBankCardNum() {
		return bankCardNum;
	}
	public void setBankCardNum(String bankCardNum) {
		this.bankCardNum = bankCardNum;
	}
	@Column(name="bank_address", length=512)
	public String getBankAddress() {
		return bankAddress;
	}
	public void setBankAddress(String bankAddress) {
		this.bankAddress = bankAddress;
	}

	@Column(length=64)
	public String getBankPhotoUrl() {
		return bankPhotoUrl;
	}
	public void setBankPhotoUrl(String bankPhotoUrl) {
		this.bankPhotoUrl = bankPhotoUrl;
	}

	
}
