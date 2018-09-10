package com.zl.mapper;

import com.zl.entity.User;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface UserMapper {
    @Delete("delete user where id=#{id}")
    int delete(@Param("id") Integer id);

    @Insert("insert into user values(#{username},#{password})")
    int insert(User user);

    @Select("select * from user")
    List<User> selectAll();

    @Select("select * from user where username=#{username} and password=#{password}")
    User login(@Param("username")String username,@Param("password")String password);


}