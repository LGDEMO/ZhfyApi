
package com.zhfy.zhfyapi.service.impl;

import com.zhfy.zhfyapi.mapper.Yd_YhxxMapper;
import com.zhfy.zhfyapi.model.Yd_Yhxx;
import com.zhfy.zhfyapi.service.UserService;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

@Service
public class UserServiceImpl implements UserService {

    private Yd_YhxxMapper yd_yhxxMapper;

    @Override
    public Map<Object, Object> login(String yhbh, String yhmm) {

        Map<Object, Object>  Yd_YhxxMap = new HashMap<Object, Object>();

        Yd_YhxxMap  = yd_yhxxMapper.login(yhbh,yhmm);
        return Yd_YhxxMap;
    }
}
