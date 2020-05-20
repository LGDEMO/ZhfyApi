package com.zhfy.zhfyapi.service;

import com.zhfy.zhfyapi.model.Yd_Yhxx;
import org.springframework.stereotype.Component;

/**
 * @Description: java接口作用描述
 * @Author: ligang
 * @CreateDate: 2020/5/20 14:03
 * @UpdateUser: ligang
 * @UpdateDate: 2020/5/20 14:03
 * @UpdateRemark: 修改内容
 * @Version: 1.0
 */
@Component
public interface UserService {
    Yd_Yhxx login(String yhbh, String yhmm);

}
