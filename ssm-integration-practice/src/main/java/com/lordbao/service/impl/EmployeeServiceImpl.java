package com.lordbao.service.impl;

import com.lordbao.mapper.EmployeeMapper;
import com.lordbao.pojo.Employee;
import com.lordbao.service.EmployeeService;
import jakarta.annotation.Resource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author Lord_Bao
 * @Date 2024/8/15 21:08
 * @Version 1.0
 */
@Service
public class EmployeeServiceImpl implements EmployeeService {

    @Autowired
    private EmployeeMapper employeeMapper;

    @Override
    public List<Employee> findAll(){
        return employeeMapper.findAll();
    }

    @Override
    public int insert(Employee employee) {
        return employeeMapper.insert(employee);
    }

}
