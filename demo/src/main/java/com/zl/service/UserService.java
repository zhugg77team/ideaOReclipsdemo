package com.zl.service;

import com.zl.entity.User;
import com.zl.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.jws.soap.SOAPBinding;
import java.util.List;

/**
 * Created by Administrator on 2018/7/30.
 */
@Service("userService")
public class UserService {
    @Autowired
    private UserMapper userMapper;

    public int delete(int id){
       return userMapper.delete(id);
    }

    public  int insert(User User){
        return  userMapper.insert(User);
    }

    public List<User> selectall(){
        return  userMapper.selectAll();
    }

    public Object login(String username,String password){
        User user= userMapper.login(username,password);
        if(null==user){
            return "没有找到该用户！";
        }else{
            return user;
        }
    }


}
