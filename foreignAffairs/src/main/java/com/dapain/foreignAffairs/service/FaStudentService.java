package com.dapain.foreignAffairs.service;

import java.util.List;

import org.beetl.sql.core.engine.PageQuery;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ibeetl.admin.core.util.PlatformException;

import com.dapain.foreignAffairs.dao.FaStudentDao;
import com.dapain.foreignAffairs.entity.FaStudent;
import com.ibeetl.admin.core.service.BaseService;

/**
 * FaStudent Service
 */

@Service
@Transactional
public class FaStudentService extends BaseService<FaStudent>{

    @Autowired private FaStudentDao faStudentDao;

    public PageQuery<FaStudent>queryByCondition(PageQuery query){
        PageQuery ret =  faStudentDao.queryByCondition(query);
        queryListAfter(ret.getList());
        return ret;
    }

    public void batchDelFaStudent(List<Long> ids){
        try {
            faStudentDao.batchDelFaStudentByIds(ids);
        } catch (Exception e) {
            throw new PlatformException("批量删除FaStudent失败", e);
        }
    }


}