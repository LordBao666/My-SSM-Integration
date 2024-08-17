package com.lordbao.mapper;

import com.lordbao.pojo.Schedule;

import java.util.List;

/**
 * @Author Lord_Bao
 * @Date 2024/8/16 20:08
 * @Version 1.0
 */
public interface ScheduleMapper {
    List<Schedule> queryList();
    int insert(Schedule schedule);
    int delete(Integer id);
    int update(Schedule schedule);
}
