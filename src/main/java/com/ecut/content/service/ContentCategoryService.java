package com.ecut.content.service;

import com.ecut.common.pojo.EasyUITreeNode;
import com.ecut.common.pojo.TaotaoResult;

import java.util.List;

public interface ContentCategoryService {

	List<EasyUITreeNode> getContentCategoryList(long parentId);
	TaotaoResult addContentCategory(Long parentId, String name);
}
