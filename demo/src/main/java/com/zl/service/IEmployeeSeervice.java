package com.zl.service;

import com.zl.entity.Employee;

import java.util.List;

/**
 * Created by Administrator on 2016/3/14.
 */
public interface IEmployeeSeervice {
    String find(int id);
    List<Employee> findAll();
    void insertEmp(Employee emp);
}
