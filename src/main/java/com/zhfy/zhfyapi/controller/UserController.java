package com.zhfy.zhfyapi.controller;


import com.zhfy.zhfyapi.model.Yd_Yhxx;
import com.zhfy.zhfyapi.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.SpringBootApplication;
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
@SpringBootApplication
public class UserController {

    @Autowired
    private UserService userService;
    @Autowired
    public void setService(UserService userService) {
        this.userService = userService;
    }
    /**
     * 方法实现说明
     *
     * @param null
     * @return
     * @throws
     * @author ligang
     * @date 2020/5/23 18:44
     */
    @PostMapping("user/login")
    public Map login(@RequestBody Yd_Yhxx yd_yhxx) {
        Map<Object, Object> resultMap = new HashMap<>();
        resultMap = userService.login(yd_yhxx.getYhbh(), yd_yhxx.getYhmm());
        return resultMap;
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
