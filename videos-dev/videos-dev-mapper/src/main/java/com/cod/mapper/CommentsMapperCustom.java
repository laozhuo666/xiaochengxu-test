package com.cod.mapper;

import java.util.List;

import com.cod.pojo.Comments;
import com.cod.pojo.vo.CommentsVO;
import com.cod.utils.MyMapper;

public interface CommentsMapperCustom extends MyMapper<Comments> {
	
	public List<CommentsVO> queryComments(String videoId);
}