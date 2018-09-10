package com.zl.mapper;

import com.zl.entity.Employee;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * Created by Administrator on 2016/3/14.
 */
/*
* +-------+-------------------------------
| Table | Create Table
+-------+-------------------------------
| emp   | CREATE TABLE `emp` (
  `id` int(11) DEFAULT NULL,
  `empname` varchar(20) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 |
+-------+-------------------------------
* */
@Mapper
public  interface EmployeeMapper {
    @Select("select empname from emp where id=#{id}")
    String findByPramaryKey(@Param("id") Integer id);
    @Select("select * from emp")
    List<Employee> findAll();
    @Insert("insert into emp values(#{id},#{empname})")
    void insertEmp(Employee emp);
}
