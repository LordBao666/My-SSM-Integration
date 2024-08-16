package com.lordbao.mapper;

import com.lordbao.pojo.Employee;

import java.util.List;

/**
 * @Author Lord_Bao
 * @Date 2024/8/15 20:47
 * @Version 1.0
 */

public interface EmployeeMapper {
    public List<Employee> findAll();

    public int insert(Employee employee);
}
