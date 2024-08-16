package com.lordbao.controller;

import com.lordbao.pojo.Employee;
import com.lordbao.service.EmployeeService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @Author Lord_Bao
 * @Date 2024/8/15 20:47
 * @Version 1.0
 */
@RestController
@RequestMapping("emp")
@Slf4j
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;


    @GetMapping("findall")
    public List<Employee> findAll(){
        log.debug("Yes findAll is being called");
        return employeeService.findAll();
    }

    @PostMapping("insert")
    public int insert(@RequestBody Employee employee){
        return employeeService.insert(employee);
    }
}
