package com.zhfy.zhfyapi.dao;


import java.util.Map;

/**
* @Description:    java类作用描述
* @Author:         ligang
* @CreateDate:     2020/5/31 16:45
* @UpdateUser:     ligang
* @UpdateDate:     2020/5/31 16:45
* @UpdateRemark:   修改内容
* @Version:        1.0
 *
 *  * 业务接口：站在"使用者"角度设计接口 三个方面：方法定义粒度，参数，返回类型（return 类型/异常）
 *
*/
public interface UserDao {

    /**
    用户登录
    * 方法实现说明
    * @author      ligang
    * @return
    * @exception
    * @date        2020/5/31 16:45
    */
    Map<Object,Object> login(String yhbh, String yhmm);
}
