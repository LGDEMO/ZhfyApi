
package com.zhfy.zhfyapi.service.impl;

import com.zhfy.zhfyapi.dao.UserDao;

import com.zhfy.zhfyapi.model.Yd_Yhxx;
import com.zhfy.zhfyapi.service.UserService;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

@Service
public class UserServiceImpl implements UserService {

    private UserDao userDao;
    @Override
    public Map<Object, Object> login(String yhbh, String yhmm) {
        Map<Object, Object>  Yd_YhxxMap = new HashMap<Object, Object>();
        Yd_YhxxMap  = userDao.login(yhbh,yhmm);
        return Yd_YhxxMap;
    }
}
