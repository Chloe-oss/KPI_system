package com.ssm.service;

import com.ssm.bean.Staff;
import org.springframework.stereotype.Service;

import java.util.List;

public interface StaffService {

    //添加员工信息
    public void toAddStaff(Staff staff);
    //删除员工信息
    public void toDeleteStaff(int staffid);
    //更新员工信息
    public void toUpdateStaff(Staff staff);

    //根据账号名获取员工信息
    public Staff findStaffbyCode(String code);
    //根据员工编号获取员工信息
    public Staff findStaffbyStaffId(int staffid);
    //获取小组成员信息
    public List<Staff> findStaffGroup(int groupid);
}
