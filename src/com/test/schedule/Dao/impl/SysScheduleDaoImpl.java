package com.test.schedule.Dao.impl;

import com.test.schedule.Dao.BaseDao;
import com.test.schedule.Dao.SysScheduleDao;
import com.test.schedule.pojo.SysSchedule;

public class SysScheduleDaoImpl extends BaseDao implements SysScheduleDao {
    @Override
    public int addSysSchedule(SysSchedule sysSchedule) {
        String sql = "insert into sys_schedule values(DEFAULT,?,?,?)";
        int rows = baseUpdate(sql, 1, "java学习", 0);
        return rows;
    }
}
