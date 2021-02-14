package com.ssm.bean;

import java.util.Date;
import java.util.HashMap;
import java.util.List;

/*
* 小组
* */
public class Group {
    private int groupid;//小组编号
    private int groupleaderid;//组长编号
    private String groupname;//组名
    private List<Integer> stafflist;//组员
    private HashMap<Date,Integer> actualsales;//实际销量
    private HashMap<Date,Integer> actualprofit;//实际销售额

    public int getGroupid() {
        return groupid;
    }

    public void setGroupid(int groupid) {
        this.groupid = groupid;
    }

    public int getGroupleaderid() {
        return groupleaderid;
    }

    public void setGroupleaderid(int groupleaderid) {
        this.groupleaderid = groupleaderid;
    }

    public String getGroupname() {
        return groupname;
    }

    public void setGroupname(String groupname) {
        this.groupname = groupname;
    }

    public List<Integer> getStafflist() {
        return stafflist;
    }

    public void setStafflist(List<Integer> stafflist) {
        this.stafflist = stafflist;
    }

    public HashMap<Date, Integer> getActualsales() {
        return actualsales;
    }

    public void setActualsales(HashMap<Date, Integer> actualsales) {
        this.actualsales = actualsales;
    }

    public HashMap<Date, Integer> getActualprofit() {
        return actualprofit;
    }

    public void setActualprofit(HashMap<Date, Integer> actualprofit) {
        this.actualprofit = actualprofit;
    }

    @Override
    public String toString(){
        return "Group{" +"groupid="+groupid
                +"groupleaderid="+groupleaderid
                +"stafflist="+stafflist
                +"actualsales="+actualsales
                +"actualprofit="+actualprofit
                +"}";
    }
}
