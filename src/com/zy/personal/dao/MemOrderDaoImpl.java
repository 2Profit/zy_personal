package com.zy.personal.dao;

import java.util.Map;

import com.zy.common.dao.CustomBaseSqlDaoImpl;
import com.zy.common.entity.PageModel;
import com.zy.personal.entity.MemOrder;

public class MemOrderDaoImpl extends CustomBaseSqlDaoImpl implements MemOrderDaoCustom{
	
	public PageModel<MemOrder> queryMemOrderPage(Map<String, Object> params, Integer currentPage, Integer pageSize){
		StringBuilder sb = new StringBuilder();
		sb.append("select t from MemOrder t where t.deleteFlag = 0 ");
		sb.append(" order by t.createDate desc ");
		
		return this.queryForPageWithParams(sb.toString(), params, currentPage, pageSize);
	}
}
