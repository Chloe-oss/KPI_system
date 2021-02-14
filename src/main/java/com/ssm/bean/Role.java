package com.ssm.bean;

import java.util.List;

public class Role {
    private int roleid;//职位编号
    private String rolename;//职位名称
    private List<Staff> stafflist;//小组的组员名单

    public int getRoleid() { return roleid; }

    public void setRoleid(int roleid) {
        this.roleid = roleid;
    }

    public String getRolename() {
        return rolename;
    }

    public void setRolename(String rolename) {
        this.rolename = rolename;
    }

    public List<Staff> getStafflist() { return stafflist; }

    public void setStafflist(List<Staff> stafflist) { this.stafflist = stafflist; }

    @Override
    public String toString(){
        return "Role{" +"roleid="+roleid
                +"rolename="+rolename
                +"}";
    }
}
