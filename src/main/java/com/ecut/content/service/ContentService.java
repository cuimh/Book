package com.ecut.content.service;

import com.ecut.common.pojo.TaotaoResult;
import com.ecut.pojo.TbContent;

import java.util.List;

public interface ContentService {

	TaotaoResult addContent(TbContent content);
	List<TbContent> getContentByCid(long cid);
}
