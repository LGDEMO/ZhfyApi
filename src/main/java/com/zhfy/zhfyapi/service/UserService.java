
package com.zhfy.zhfyapi.service;


import org.springframework.stereotype.Component;

import java.util.Map;

/**
* @Description:    java类作用描述
* @Author:         ligang
* @CreateDate:     2020/5/29 17:13
* @UpdateUser:     ligang
* @UpdateDate:     2020/5/29 17:13
* @UpdateRemark:   修改内容
* @Version:        1.0
*/
@Component
public interface UserService {
    Map<Object,Object> login(String yhbh, String yhmm);

}
