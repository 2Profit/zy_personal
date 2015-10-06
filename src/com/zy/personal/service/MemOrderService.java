package com.zy.personal.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zy.common.service.CommonService;
import com.zy.personal.dao.MemOrderDao;
import com.zy.personal.entity.MemOrder;

@Service
public class MemOrderService extends CommonService<MemOrder, String> {

	@Autowired
	private MemOrderDao memOrderDao;
	
	@Autowired
	public void setMemOrderDao(MemOrderDao memOrderDao){
		super.setCommonDao(memOrderDao);
	}
	
}
