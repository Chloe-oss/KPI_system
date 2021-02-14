package com.ssm.service;

import com.ssm.bean.Staff;
import com.ssm.dao.StaffDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StaffServiceImpl implements StaffService{

    @Autowired
    private StaffDao sd;

    //添加员工信息
    @Override
    public void toAddStaff(Staff staff){
        System.out.println("StaffService/toAddStaff：添加员工信息...");
        sd.db_addStaff(staff);
    }

    //删除员工信息
    @Override
    public void toDeleteStaff(int staffid){
        System.out.println("StaffService/toDeleteStaff：删除员工信息...");
        sd.db_deleteStaff(staffid);
    }

    //更新员工信息
    @Override
    public void toUpdateStaff(Staff staff){
        System.out.println("StaffService/toUpdateStaff：更新员工信息...");
        sd.db_updateStaff(staff);
    }

    //根据账号名获取员工信息
    @Override
    public Staff findStaffbyCode(String code){
        System.out.println("StaffService/findStaffbyCode：根据账号名获取员工信息...");
        return sd.db_findStaffsbyCode(code);
    }

    //根据员工编号获取员工信息
    @Override
    public Staff findStaffbyStaffId(int staffid){
        System.out.println("StaffService/getStaffbyStaffId：根据员工编号获取员工信息...");
        return sd.db_findStaffbyStaffId(staffid);
    }

    //获取小组成员信息
    public List<Staff> findStaffGroup(int groupid){
        System.out.println("StaffService/findStaffGroup：获取小组成员信息...");
        return sd.db_findStaffsbyGroupId(groupid);
    }
}
