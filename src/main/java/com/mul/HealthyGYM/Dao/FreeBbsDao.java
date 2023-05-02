package com.mul.HealthyGYM.Dao;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import com.mul.HealthyGYM.Dto.BbsCommentDto;
import com.mul.HealthyGYM.Dto.BbsDto;
import com.mul.HealthyGYM.Dto.BbsParam;

@Mapper
@Repository
public interface FreeBbsDao {
	
	List<Map<String, Object>> bbsList(BbsParam param);
	List<Map<String, Object>> bbsDetail(int bbsseq);
	int checkLiking(BbsDto dto);
	
	List<Map<String, Object>> bbsComment(int bbsseq);
	int writeBbs(BbsDto dto);
	int writeBbsComment(BbsCommentDto dto);
	int writeBbsReply(BbsCommentDto dto);
	
	int likeBbs(BbsDto dto);
	int unlikeBbs(BbsDto dto);
	int likecountUp(int bbsseq);
	int likecountDown(int bbsseq);
	
	int uploadFile(String filename);
}
