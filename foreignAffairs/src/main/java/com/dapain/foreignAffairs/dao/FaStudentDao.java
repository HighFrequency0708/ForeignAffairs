package com.dapain.foreignAffairs.dao;

import java.util.List;

import org.beetl.sql.core.annotatoin.SqlResource;
import org.beetl.sql.core.mapper.BaseMapper;
import org.beetl.sql.core.engine.PageQuery;

import  com.dapain.foreignAffairs.entity.*;

/**
 * FaStudent Dao
 */
@SqlResource("foreignAffairsCms.faStudent")
public interface FaStudentDao extends BaseMapper<FaStudent>{
    
	public PageQuery<FaStudent> queryByCondition(PageQuery query);
    
	public void batchDelFaStudentByIds(List<Long> ids);
	
	
}