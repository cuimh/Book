package com.ecut.search.service;

import com.ecut.common.pojo.SearchResult;

public interface SearchService {

	SearchResult search(String queryString, int page, int rows) throws Exception;
}
