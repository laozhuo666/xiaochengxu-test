package com.cod.mapper;

import java.util.List;

import com.cod.pojo.SearchRecords;
import com.cod.utils.MyMapper;

public interface SearchRecordsMapper extends MyMapper<SearchRecords> {
	
	public List<String> getHotwords();
}