
package com.zhfy.zhfyapi.service;


import org.springframework.stereotype.Component;

import java.util.Map;


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
    Map<Object,Object> login(String yhbh, String yhmm);

}
