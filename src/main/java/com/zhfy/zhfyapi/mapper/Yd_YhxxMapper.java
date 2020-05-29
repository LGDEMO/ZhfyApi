package com.zhfy.zhfyapi.mapper;

import com.zhfy.zhfyapi.model.Yd_Yhxx;

import java.util.Map;

public interface Yd_YhxxMapper {
    int deleteByPrimaryKey(String yhbh);

    int insert(Yd_Yhxx record);

    int insertSelective(Yd_Yhxx record);

    Yd_Yhxx selectByPrimaryKey(String yhbh);

    int updateByPrimaryKeySelective(Yd_Yhxx record);

    int updateByPrimaryKey(Yd_Yhxx record);
    Map<Object,Object> login(String yhbh, String yhmm);
}