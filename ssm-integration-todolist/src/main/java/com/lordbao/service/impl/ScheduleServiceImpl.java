package com.lordbao.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.lordbao.mapper.ScheduleMapper;
import com.lordbao.pojo.Schedule;
import com.lordbao.service.ScheduleService;
import com.lordbao.utils.PageBean;
import com.lordbao.utils.R;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author Lord_Bao
 * @Date 2024/8/16 20:08
 * @Version 1.0
 */
@Service
public class ScheduleServiceImpl implements ScheduleService {
    @Autowired
    private ScheduleMapper scheduleMapper;

    @Override
    public R page(int pageSize, int currentPage) {
        PageHelper.startPage(currentPage,pageSize);
        List<Schedule> list=scheduleMapper.queryList();
        PageInfo<Schedule> info = new PageInfo<>(list);
        PageBean<Schedule> pageBean = new PageBean<>(currentPage, pageSize, info.getTotal(), info.getList());
        return R.ok(pageBean);
    }

    @Override
    public R insert(Schedule schedule) {
        int rows = scheduleMapper.insert(schedule);
        //添加成功
        if(rows>0){
            return R.ok(null);
        }

        return R.fail("插入数据失败");
    }

    @Override
    public R delete(Integer id) {
        int rows = scheduleMapper.delete(id);
        //删除成功
        if(rows>0){
            return R.ok(null);
        }

        return R.fail("删除数据失败");
    }

    @Override
    public R update(Schedule schedule) {
        int rows = scheduleMapper.update(schedule);
        //更新成功
        if(rows>0){
            return R.ok(null);
        }

        return R.fail("更新数据失败");
    }
}
