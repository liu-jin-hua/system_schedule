package com.test.schedule.controller;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.lang.reflect.Method;


@WebServlet("/schedule/*")
public class ScheduleController extends BaseController {
    protected void add(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException{
        System.out.println("add");
    }
    protected void delete(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException{
        System.out.println("delete");
    }
    protected void update(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException{
        System.out.println("update");
    }
    protected void find(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException{
        System.out.println("find");
    }
}
