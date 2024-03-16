package com.test.schedule.Dao.impl;

import com.test.schedule.Dao.BaseDao;
import com.test.schedule.Dao.SysUserDao;
import com.test.schedule.pojo.SysUser;

public class SysUserDaoImpl extends BaseDao implements SysUserDao {
    @Override
    public int addUser(SysUser sysUser) {
        String sql = "insert into sys_User value(default, ?, ?)";

        return baseUpdate(sql, sysUser.getUsername(), sysUser.getUserPwd());
    }
}
