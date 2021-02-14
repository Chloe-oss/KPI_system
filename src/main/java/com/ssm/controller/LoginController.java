package com.ssm.controller;

import com.ssm.bean.Staff;
import com.ssm.service.StaffService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

/*
* 登录业务
* */
@Controller
public class LoginController {

    @Autowired
    private StaffService ss;

    //账号信息验证
    @RequestMapping("/LoginController/CheckCode")
    public String CheckCode(@RequestParam("username") String code, @RequestParam("userpwd") String pwd, HttpSession session, Model model){
    /*public String CheckCode(Model model, HttpSession session, HttpServletRequest req, HttpServletResponse res)throws IOException{*/
        System.out.println("LoginController/CheckCode：用户账号验证...");

        /* 字符格式设置 */
        //req.setCharacterEncoding("UTF-8");
        //res.setContentType("text/html; charset=utf-8");

        /* 注意：这里获取的是标签的 name */
        //String code=req.getParameter("username");
        //System.out.println("账号名："+code);
        //String pwd=req.getParameter("userpwd");
        //System.out.println("密码："+pwd);
        Staff staff=ss.findStaffbyCode(code);
        System.out.println("获取到的员工名："+staff.getStaffname());
        if(staff == null) { //是否存在当前账号
            model.addAttribute("error","不存在当前帐号，请重新输入");
            //System.out.println("不存在当前帐号，请重新输入");
            return "Login";
        }
        else if(!pwd.equals(staff.getStaffpwd())) { //密码是否正确
            model.addAttribute("error","账号或密码错误");
            //System.out.println("账号或密码错误:"+staff.getStaffpwd());
            return "Login";
        }
        else{//根据不同职位发送不同的页面信息
            /* model只用于一次request */
            session.setAttribute("curStaff",staff);
            //model.addAttribute("curStaff",staff);
            //System.out.println("进入系统");
            return "Home";//管理页面信息
        }
    }
}
