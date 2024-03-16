package com.test.schedule.service.impl;

import com.test.schedule.Dao.SysUserDao;
import com.test.schedule.Dao.impl.SysUserDaoImpl;
import com.test.schedule.pojo.SysUser;
import com.test.schedule.service.SysUserService;

public class SysUserServiceImpl implements SysUserService {

    private SysUserDao sysUserDao = new SysUserDaoImpl();

    /*
    * 1.实现注册方法
    * 2.调用dao层进行增加用户记录
    * 3.再返回结果
    *
    * */
    @Override
    public int addUser(SysUser sysUser) {

        return sysUserDao.addUser(sysUser);
    }

}
