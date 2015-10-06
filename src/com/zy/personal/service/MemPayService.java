package com.zy.personal.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zy.common.service.CommonService;
import com.zy.personal.dao.MemPayDao;
import com.zy.personal.entity.MemPay;

@Service
public class MemPayService extends CommonService<MemPay, String> {

	@Autowired
	private MemPayDao memPayDao;
	
	@Autowired
	public void setMemPayDao(MemPayDao memPayDao){
		super.setCommonDao(memPayDao);
	}
	
}
