package com.ssm.dao;

import com.ssm.bean.Staff;
import org.apache.ibatis.annotations.*;

import java.util.List;

public interface StaffDao {
    //添加员工
    @Insert("insert into t_staff(staffid,staffname,staffimg) values (#{staffid},#{staffname},#{staffimg})")
    /*@Insert("insert into t_staff (" +
            "staffid,staffname,staffcode,staffpwd,groupid,staffimg,staffsex,staffbirthdate,staffphone,staffemail,staffarea,rolename,roleid,staffentryjob,staffresignatejob" +
            ") values (" +
            "#{staffid},#{staffname},#{staffcode},#{staffpwd},#{groupid},#{staffimg},#{staffsex},#{staffbirthdate},#{staffphone},#{staffemail},#{staffarea},#{rolename},#{roleid},#{staffentryjob},#{staffresignatejob})")*/
    public void db_addStaff(Staff staff);
    //删除员工
    @Delete("delete from t_staff where staffid=#{staffid} ")
    public void db_deleteStaff(int staffid);
    //修改员工
    @Update("update t_staff set " +
            "staffname=#{staffname},staffcode=#{staffcode},staffpwd=#{staffpwd},groupid=#{groupid},staffimg=#{staffimg},staffsex=#{staffsex},staffbirthdate=#{staffbirthdate},staffphone=#{staffphone},"
            +"staffemail=#{staffemail},staffarea=#{staffarea},rolename=#{rolename},roleid=#{roleid},staffentryjob=#{staffentryjob},staffresignatejob=#{staffresignatejob}"
            +"where staffid=#{staffid}")
    public void db_updateStaff(Staff staff);

    //根据员工编号获取员工
    @Select("select * from t_staff where staffid=#{staffid}")
    public Staff db_findStaffbyStaffId(int staffid);
    //查找所有员工
    @Select("select * from t_staff")
    public List<Staff> db_findAllStaffs();

    //根据账号名获取员工
    @Select("select * from t_staff where staffcode=#{code}")
    public Staff db_findStaffsbyCode(String code);
    //根据小组编号获取员工
    @Select("select * from t_staff where groupid=#{groupid}")
    public List<Staff> db_findStaffsbyGroupId(int groupid);
    //获取同一职位的员工
    @Select("select * from t_staff where roleid=#{roleid}")
    public List<Staff> db_findStaffsbyRoleId(int roleid);
}
