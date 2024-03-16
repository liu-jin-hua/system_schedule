package com.test.schedule.test;

import com.test.schedule.Dao.BaseDao;
import com.test.schedule.Dao.SysScheduleDao;
import com.test.schedule.Dao.impl.SysScheduleDaoImpl;
import com.test.schedule.pojo.SysSchedule;
import org.junit.BeforeClass;
import org.junit.Test;

public class TestAddSchedule {
    private static SysScheduleDao sysScheduleDao;
    @BeforeClass
    public static void intiSysScheduleDao(){
        sysScheduleDao = new SysScheduleDaoImpl();
    }

    @Test
    public void testAddSchedule() {

        int rows = sysScheduleDao.addSysSchedule(new SysSchedule(null,2,"mysql学习",0));
        System.out.println(rows);
    }

}
