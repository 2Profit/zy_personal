package com.zy.personal.dao;

import java.util.Map;

import com.zy.common.entity.PageModel;
import com.zy.personal.entity.MemOrder;

public interface MemOrderDaoCustom {

	public PageModel<MemOrder> queryMemOrderPage(Map<String, Object> params, Integer currentPage, Integer pageSize);
	
}
