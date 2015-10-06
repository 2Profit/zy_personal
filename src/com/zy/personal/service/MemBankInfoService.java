package com.zy.personal.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zy.common.service.CommonService;
import com.zy.personal.dao.MemBankInfoDao;
import com.zy.personal.entity.MemBankInfo;

@Service
public class MemBankInfoService extends CommonService<MemBankInfo,String>{

	@Autowired
	private MemBankInfoDao memBankInfoDao;
}
