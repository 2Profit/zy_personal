package com.zy.personal.service;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zy.common.service.CommonService;
import com.zy.personal.dao.MemCoinLogDao;
import com.zy.personal.entity.MemCoinLog;

@Service
public class MemCoinLogService extends CommonService<MemCoinLog, String> {

	@Autowired
	private MemCoinLogDao memCoinLogDao;
	
	@Autowired
	public void setMemCoinLogDao(MemCoinLogDao memCoinLogDao){
		super.setCommonDao(memCoinLogDao);
	}
	
	public List<MemCoinLog> findMemCoinLogs(Map<String, Object> params){
		return memCoinLogDao.findMemCoinLogs(params);
	}
	
}
