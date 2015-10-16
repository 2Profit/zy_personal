package com.zy.personal.dao;

import java.util.List;
import java.util.Map;

import com.zy.common.dao.CustomBaseSqlDaoImpl;
import com.zy.personal.entity.MemCoinLog;

public class MemCoinLogDaoImpl extends CustomBaseSqlDaoImpl implements MemCoinLogCustomDao {

	@SuppressWarnings("unchecked")
	@Override
	public List<MemCoinLog> findMemCoinLogs(Map<String, Object> params) {
		
		StringBuilder sb = new StringBuilder();
		sb.append("select l from MemCoinLog l where l.deleteFlag = 0 ");
		
		Object memberId = params.get("memberId");
		if(memberId != null){
			sb.append(" and l.member.id = :memberId ");
		}
		
		Object startDate = params.get("startDate");
		if(startDate != null){
			sb.append(" and l.createDate >= :startDate ");
		}
		
		Object endDate = params.get("endDate");
		if(endDate != null){
			sb.append(" and l.createDate <= :endDate ");
		}
		
		sb.append(" order by l.createDate desc ");
		
		return this.queryByMapParams(sb.toString(), params);
	}

}
