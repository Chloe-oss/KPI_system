package com.ssm.controller;

import com.ssm.bean.Staff;
import com.ssm.service.StaffService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;
import java.util.List;

/* 员工管理 */
@Controller
@RequestMapping("/StaffController")
public class StaffController {

    @Autowired
    private StaffService sas;

    //所有用户：修改个人信息
    public int UpdateStaff(Staff staff){
        System.out.println("StaffController/UpdateStaff：修改个人信息");
        Staff cur=sas.findStaffbyStaffId(staff.getStaffid());
        if(cur==null) //当前员工不存在，更新失败
            return 0;
        else{
            sas.toUpdateStaff(staff);
            return 1;//存在当前员工，更新成功
        }
    }

    //根据职位编号显示对应的成员信息
    public List<Staff> findStaffList(Staff staff){
        System.out.println("StaffController/findStaffList：显示成员信息");
        if(staff.getRoleid()==1)//如果当前用户为组长
            return sas.findStaffGroup(staff.getGroupid());
        return null;
    }

    //添加成员
    @RequestMapping("/AddStaff")
    public String AddStaff(int staffid,String staffname, MultipartFile image)throws IOException {
        System.out.println("StaffController/AddStaff：添加成员");
        //Staff cur=sas.findStaffbyStaffId(staff.getStaffid());
        Staff cur=sas.findStaffbyStaffId(staffid);
        if(cur==null) { //当前员工不存在，添加成功
            Staff staff=new Staff();
            staff.setStaffid(staffid);
            staff.setStaffname(staffname);
            System.out.println("图片路径："+"d:\\" + image.getOriginalFilename());
            staff.setImg("d:\\"+image.getOriginalFilename());//添加图片路径
            sas.toAddStaff(staff);//将staff存入数据库
            image.transferTo(new File("d:\\"+image.getOriginalFilename()));
            return "test_img";
        }
        else
            return "test_img";//存在当前员工，更新成功
    }

    //删除成员
    public void DeleteStaff(Staff curstaff, Staff staff){
        System.out.println("StaffController/DeleteStaff：删除成员");
        //如果为组长：查找小组所在成员，解散小组
        if(staff.getRoleid()==1) {
            List<Staff> stafflist=sas.findStaffGroup(staff.getGroupid());//查找要删除的员工staff的小组成员
            for(Staff s:stafflist)
                s.setGroupid(curstaff.getGroupid());
        }
        sas.toDeleteStaff(staff.getStaffid());
    }

    //查询成员

}
