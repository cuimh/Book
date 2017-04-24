package com.ecut.service;

import com.ecut.common.pojo.EasyUITreeNode;

import java.util.List;

public interface ItemCatService {

	List<EasyUITreeNode> getItemCatList(long parentId);
}
