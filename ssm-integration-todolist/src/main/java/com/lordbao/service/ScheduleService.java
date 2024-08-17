package com.lordbao.service;

import com.lordbao.pojo.Schedule;
import com.lordbao.utils.R;

/**
 * @Author Lord_Bao
 * @Date 2024/8/16 20:07
 * @Version 1.0
 */
public interface ScheduleService {
    R page(int pageSize, int currentPage);
    R insert(Schedule schedule);

    R delete(Integer id);

    R update(Schedule schedule);
}
