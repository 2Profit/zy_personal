package com.zy.personal.dao;

import java.util.Map;

import com.zy.common.dao.CustomBaseSqlDaoImpl;
import com.zy.common.entity.PageModel;
import com.zy.personal.entity.MemOrder;

public class MemOrderDaoImpl extends CustomBaseSqlDaoImpl implements MemOrderDaoCustom{
	
	public PageModel<MemOrder> queryMemOrderPage(Map<String, Object> params, Integer currentPage, Integer pageSize){
		StringBuilder sb = new StringBuilder();
		sb.append("select t from MemOrder t where t.deleteFlag = 0 ");
		
		Object orderId = params.get("orderId");
		if(orderId != null){
			sb.append(" and t.orderId = :orderId ");
		}
		
		Object memberNo = params.get("memberNo");
		if(memberNo != null){
			sb.append(" and t.member.no = :memberNo ");
		}
		
		Object mobile = params.get("mobile");
		if(mobile != null){
			sb.append(" and t.member.mobile = :mobile ");
		}
		
		Object name = params.get("name");
		if(name != null){
			sb.append(" and t.member.name like :name ");
		}
		
		Object startDate = params.get("startDate");
		if(startDate != null){
			sb.append(" and t.createDate >= :startDate ");
		}
		
		Object endDate = params.get("endDate");
		if(endDate != null){
			sb.append(" and t.createDate <= :endDate ");
		}
		
		sb.append(" order by t.createDate desc ");
		
		return this.queryForPageWithParams(sb.toString(), params, currentPage, pageSize);
	}
}
