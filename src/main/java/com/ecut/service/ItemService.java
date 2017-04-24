package com.ecut.service;

import com.ecut.common.pojo.EasyUIDataGridResult;
import com.ecut.common.pojo.TaotaoResult;
import com.ecut.pojo.TbItem;
import com.ecut.pojo.TbItemDesc;

public interface ItemService {

	TbItem getItemById(long itemId);
	EasyUIDataGridResult getItemList(int page, int rows);
	TaotaoResult addItem(TbItem item, String desc);
	TbItemDesc getItemDescById(long itemId);
}
