package com.topview.school.dao;

import com.topview.school.po.ExamTemplet;

public interface ExamTempletMapper {
    int deleteByPrimaryKey(String id);

    int insert(ExamTemplet record);

    int insertSelective(ExamTemplet record);

    ExamTemplet selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(ExamTemplet record);

    int updateByPrimaryKey(ExamTemplet record);
}