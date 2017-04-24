package com.ecut.search.mapper;

import com.ecut.common.pojo.SearchItem;

import java.util.List;

public interface SearchItemMapper {

	List<SearchItem> getItemList();
	SearchItem getItemById(long itemId);
}
