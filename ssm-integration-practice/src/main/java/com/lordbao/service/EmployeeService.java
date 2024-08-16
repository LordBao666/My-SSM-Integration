package com.lordbao.service;

import com.lordbao.pojo.Employee;

import java.util.List;

/**
 * @Author Lord_Bao
 * @Date 2024/8/15 21:00
 * @Version 1.0
 */

public interface EmployeeService {

    public List<Employee> findAll();

    int insert(Employee employee);
}
