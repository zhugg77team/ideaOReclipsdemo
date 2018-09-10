package com.zl.controller;

import com.zl.entity.User;
import com.zl.service.UserService;
import org.apache.tomcat.util.codec.binary.Base64;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.io.UnsupportedEncodingException;

/**
 * Created by Administrator on 2018/7/30.
 */
@Controller
public class UserController {
    @Autowired
    private UserService userService;

    @RequestMapping("/selectall")
    @ResponseBody
    public Object selectall(){
    	  System.out.println("idea凭冲突了还三次push了");
        return userService.selectall();
    }

    @RequestMapping("/login")
    @ResponseBody
    public Object login(User user)  {
        System.out.println("进来啦");
        if(null==user){
            return "参数有误";
        }else{
        return userService.login(user.getUsername(),user.getPassword());
        }
    }

    @RequestMapping("/insert")
    @ResponseBody
    public Object insert(User user) throws UnsupportedEncodingException {
        String nickname = user.getUsername();//jsonObject对象是查询出来的用户信息转化为json对象，用的是阿里巴巴的fastjson
        //进行编码
        nickname = Base64.encodeBase64String(nickname.getBytes("UTF-8"));
        //进行解码
       // nickname = new String(Base64.decodeBase64(nickname),"UTF-8");
       return  userService.insert(user);
    }





}
