package com.zhfy.zhfyapi.controller;
import com.zhfy.zhfyapi.model.Yd_Yhxx;
import com.zhfy.zhfyapi.service.UserService;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

/**
 * ccmt
 *
 * @Description: java类作用描述
 * @Author: ligang
 * @CreateDate: 2020/5/20 12:55
 * @UpdateUser: ligang
 * @UpdateDate: 2020/5/20 12:55
 * @UpdateRemark: 修改内容
 * @Version: 1.0
 */
@RestController
public class UserController {

    @Autowired
    private UserService userService;
    @Autowired
    public void setService(UserService userService) {
        this.userService = userService;
    }

    /**
     * 登录方法实现说明
     * @author      ligang
     * @param null
     * @return
     * @exception
     * @date        2020/6/1 14:58
     */
    @GetMapping("user/login")
    public Yd_Yhxx Login(@Param("yhbh") String yhbh){
        Yd_Yhxx yd_yhxx = new Yd_Yhxx();
        if(yhbh != null && yhbh !=" "){
            yd_yhxx  = userService.selectByPrimaryKey(yhbh);
        }
        return yd_yhxx;
    }


    /**
    * 方法实现说明
    * @author      ligang 
    * @param null
    * @return      
    * @exception   
    * @date        2020/5/30 10:46
    */
    @GetMapping("/hello")
        public  String SayHello(){
            return  " hello world!!!!";
    }


}
