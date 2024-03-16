package com.test.schedule.test;

import com.test.schedule.Dao.BaseDao;
import com.test.schedule.pojo.SysUser;
import org.junit.BeforeClass;
import org.junit.Test;

import java.util.List;

public class TestBaseDao {


    private static BaseDao baseDao;

    @BeforeClass
    public static void initBaseDao(){
        baseDao=new BaseDao();
    }

    @Test
    public void testBaseQueryObject(){
        // 查询用户数量  baseQueryObject 查询结果集是单行 单列的 一个值的数据的方法
        String sql ="select count(1) from sys_user";
        Long count = baseDao.baseQueryObject(Long.class, sql);
        System.out.println(count);
    }

    @Test
    public void testBaseQuery(){
        String sql = "select uid, username, user_pwd userPwd from sys_user";
        List<SysUser>  sysUsers = baseDao.baseQuery(SysUser.class, sql);
        sysUsers.forEach(System.out::println);
    }

    @Test
    public void testBaseUpdate(){
        String sql = "insert into sys_schedule values(DEFAULT,?,?,?)";
        int rows = baseDao.baseUpdate(sql, 1, "java学习", 0);
        System.out.println(rows);
    }


}
