package com.lordbao.controller;

import com.lordbao.pojo.Schedule;
import com.lordbao.service.ScheduleService;
import com.lordbao.utils.R;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

/**
 * @Author Lord_Bao
 * @Date 2024/8/16 20:07
 * @Version 1.0
 */
@RestController
@CrossOrigin
@RequestMapping("schedule")
public class ScheduleController {
    @Autowired
    private ScheduleService scheduleService;

    @GetMapping("{pageSize}/{currentPage}")
    public R page(@PathVariable int pageSize, @PathVariable int currentPage){
        return scheduleService.page(pageSize, currentPage);
    }

    @PostMapping
    public R insert(@Validated @RequestBody Schedule schedule, BindingResult bindingResult){
        if(bindingResult.hasErrors()){
            return R.fail("插入元素的参数不能为空");
        }
        return scheduleService.insert(schedule);
    }

    @DeleteMapping("{id}")
    public R delete(@PathVariable Integer id){
        return scheduleService.delete(id);
    }

    @PutMapping
    public R update(@Validated@ RequestBody Schedule schedule,BindingResult bindingResult){
        if(bindingResult.hasErrors()){
            return R.fail("更新元素的参数不能为空");
        }
        if(schedule.getId()==null){
            return R.fail("更新元素的id不能为null");
        }

        return scheduleService.update(schedule);
    }
}
