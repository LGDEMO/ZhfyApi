
package com.zhfy.zhfyapi.service.impl;

import com.zhfy.zhfyapi.mapper.Yd_YhxxMapper;
import com.zhfy.zhfyapi.model.Yd_Yhxx;
import com.zhfy.zhfyapi.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private Yd_YhxxMapper yd_yhxxMapper;


    @Override
    public Map<Object, Object> login(String yhbh, String yhmm) {
        return null;
    }

    @Override
    public Yd_Yhxx selectByPrimaryKey(String yhbh) {
        Yd_Yhxx ydYhxx = yd_yhxxMapper.login(yhbh);
        return ydYhxx;
    }

    @Override
    public Yd_Yhxx login(String yhbh) {
        Yd_Yhxx yd_yhxx = yd_yhxxMapper.login(yhbh);
        return yd_yhxx;
    }

}
