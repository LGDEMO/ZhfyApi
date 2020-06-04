package com.zhfy.zhfyapi.mapper;

import com.zhfy.zhfyapi.model.Yd_Fyxx;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface Yd_FyxxMapper {
    int deleteByPrimaryKey(String fydm);

    int insert(Yd_Fyxx record);

    int insertSelective(Yd_Fyxx record);

    Yd_Fyxx selectByPrimaryKey(String fydm);

    int updateByPrimaryKeySelective(Yd_Fyxx record);

    int updateByPrimaryKey(Yd_Fyxx record);

}