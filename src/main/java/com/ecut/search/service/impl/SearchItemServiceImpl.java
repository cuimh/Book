package com.ecut.search.service.impl;

import com.ecut.common.pojo.SearchItem;
import com.ecut.common.pojo.TaotaoResult;
import com.ecut.search.mapper.SearchItemMapper;
import com.ecut.search.service.SearchItemService;
import org.apache.solr.client.solrj.SolrServer;
import org.apache.solr.common.SolrInputDocument;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 商品数据导入索引库
 * <p>Title: SearchItemServiceImpl</p>
 * <p>Description: </p>
 * <p>Company: www.itcast.cn</p> 
 * @version 1.0
 */
@Service
public class SearchItemServiceImpl implements SearchItemService {

	@Autowired
	private SearchItemMapper searchItemMapper;
	@Autowired
	private SolrServer solrServer;
	
	@Override
	public TaotaoResult importItemsToIndex() {
		try {
			//1、先查询所有商品数据
			List<SearchItem> itemList = searchItemMapper.getItemList();
			//2、遍历商品数据添加到索引库
			for (SearchItem searchItem : itemList) {
				//创建文档对象
				SolrInputDocument document = new SolrInputDocument();
				//向文档中添加域
				document.addField("id", searchItem.getId());
				document.addField("item_title", searchItem.getTitle());
				document.addField("item_sell_point", searchItem.getSell_point());
				document.addField("item_price", searchItem.getPrice());
				document.addField("item_image", searchItem.getImage());
				document.addField("item_category_name", searchItem.getCategory_name());
				document.addField("item_desc", searchItem.getItem_desc());
				//把文档写入索引库
				solrServer.add(document);
			}
			//3、提交
			solrServer.commit();
		} catch (Exception e) {
			e.printStackTrace();
			return TaotaoResult.build(500, "数据导入失败");
		}
		//4、返回添加成功
		return TaotaoResult.ok();
	}

}
