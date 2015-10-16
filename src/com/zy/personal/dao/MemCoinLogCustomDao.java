package com.zy.personal.dao;

import java.util.List;
import java.util.Map;

import com.zy.personal.entity.MemCoinLog;

public interface MemCoinLogCustomDao {

	public List<MemCoinLog> findMemCoinLogs(Map<String, Object> params);
	
}
