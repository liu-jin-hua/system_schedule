package com.test.schedule.controller;

import com.test.schedule.pojo.SysSchedule;
import com.test.schedule.pojo.SysUser;
import com.test.schedule.service.SysUserService;
import com.test.schedule.service.impl.SysUserServiceImpl;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

@WebServlet("/user/*")
public class UserController extends BaseController {

    private SysUserService sysUserService = new SysUserServiceImpl();


    /*
    * 1.注册入口
    *
    * */
    protected void regist(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        //1.获取参数
        String name = req.getParameter("username");
        String passwd = req.getParameter("userPwd");

        //2.调用注册方法进行注册
        SysUser sysUser = new SysUser(null, name, passwd);
        int flag = sysUserService.addUser(sysUser);

        //重定向页面
        if (flag > 0){
            resp.sendRedirect("/registSuccess.html");
        }else {
            resp.sendRedirect("/registFail.html");
        }

    }
}
