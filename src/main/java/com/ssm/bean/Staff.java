package com.ssm.bean;

import java.util.Date;
import java.util.List;

public class Staff {
    private int staffid;//员工编号
    private String staffname;//员工姓名
    private String staffcode;//用户账号
    private String staffpwd;//登陆密码
    private int groupid;//团队编号：用于查询团队（小组、部门、区域）销售记录
    private String staffimg;//账户头像
    private String staffsex;//性别
    private Date staffbirthdate;//出生日期
    private String staffphone;//联系电话
    private String staffemail;//邮箱
    private String staffarea;//区域：辅助查询销售记录（涉及工作区域的修改）
    private String rolename;//职位：涉及权限设置
    private int roleid;//职位编号
    private Date staffentryjob;//入职时间
    private Date staffresignatejob;//离职时间
    private List<Integer> salelist;//销售记录表<销量编号saleid>（可用于具体销量、绩效查询）

    public int getStaffid() {
        return staffid;
    }

    public void setStaffid(int staffid) {
        this.staffid = staffid;
    }

    public String getStaffname() {
        return staffname;
    }

    public void setStaffname(String staffname) {
        this.staffname = staffname;
    }

    public String getStaffcode() {
        return staffcode;
    }

    public void setStaffcode(String staffcode) {
        this.staffcode = staffcode;
    }

    public String getStaffpwd() {
        return staffpwd;
    }

    public void setStaffpwd(String staffpwd) {
        this.staffpwd = staffpwd;
    }

    public int getGroupid() {
        return groupid;
    }

    public void setGroupid(int groupid) {
        this.groupid = groupid;
    }

    public String getImg() {
        return staffimg;
    }

    public void setImg(String staffimg) {
        this.staffimg = staffimg;
    }

    public String getStaffsex() {
        return staffsex;
    }

    public void setStaffsex(String staffsex) {
        this.staffsex = staffsex;
    }

    public Date getStaffbirthdate() {
        return staffbirthdate;
    }

    public void setStaffbirthdate(Date staffbirthdate) {
        this.staffbirthdate = staffbirthdate;
    }

    public String getStaffphone() {
        return staffphone;
    }

    public void setStaffphone(String staffphone) {
        this.staffphone = staffphone;
    }

    public String getStaffemail() {
        return staffemail;
    }

    public void setStaffemail(String staffemail) {
        this.staffemail = staffemail;
    }

    public String getStaffarea() {
        return staffarea;
    }

    public void setStaffarea(String staffarea) {
        this.staffarea = staffarea;
    }

    public String getRolename() {
        return rolename;
    }

    public void setRolename(String rolename) {
        this.rolename = rolename;
    }

    public int getRoleid() {
        return roleid;
    }

    public void setRoleid(int roleid) {
        this.roleid = roleid;
    }

    public Date getStaffentryjob() {
        return staffentryjob;
    }

    public void setStaffentryjob(Date staffentryjob) {
        this.staffentryjob = staffentryjob;
    }

    public Date getStaffresignatejob() {
        return staffresignatejob;
    }

    public void setStaffresignatejob(Date staffresignatejob) {
        this.staffresignatejob = staffresignatejob;
    }

    public List<Integer> getSalelist() {
        return salelist;
    }

    public void setSalelist(List<Integer> salelist) {
        this.salelist = salelist;
    }

    @Override
    public String toString(){
        return "Staff{" +"staffid="+staffid
                +"staffname="+staffname
                +"}";
        /*return "Staff{" +"staffid="+staffid
                +"staffname="+staffname
                +"staffcode="+staffcode
                +"staffpwd="+staffpwd
                +"teamid="+teamid
                +"staffsex="+staffsex
                +"staffbirthdate="+staffbirthdate
                +"staffphone="+staffphone
                +"staffemail="+staffemail
                +"staffarea="+staffarea
                +"rolename="+rolename
                +"roleid="+roleid
                +"staffentryjob="+staffentryjob
                +"staffresignatejob="+staffresignatejob
                +"salelist="+salelist
                +"}";*/
    }
}
