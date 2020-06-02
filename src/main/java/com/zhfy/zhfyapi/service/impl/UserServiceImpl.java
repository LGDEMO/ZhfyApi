
package com.zhfy.zhfyapi.service.impl;

import com.zhfy.zhfyapi.mapper.UserMapper;

import com.zhfy.zhfyapi.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;
    @Override
    public Map<Object, Object> login(String yhbh, String yhmm) {
        Map<Object, Object>  Yd_YhxxMap = new HashMap<Object, Object>();
        Yd_YhxxMap  = userMapper.login(yhbh,yhmm);
        return Yd_YhxxMap;
    }
}
