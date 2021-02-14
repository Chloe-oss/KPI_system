package com.ssm.bean;

import java.util.Date;
import java.util.HashMap;
import java.util.List;

public class Sale {
    private int saleid;//销售编号
    private int productid;//产品编号
    private int salegoal;//目标销量
    private int saleachieve;//实际完成的销量
    private Date salestart;//发布日期
    private Date saleend;//结束日期
    private List<Staff> stafflist;//员工名单
    private List<Client> clientlist;//客户名单，通过客户查询签订的订单

    public int getSaleid() {
        return saleid;
    }

    public void setSaleid(int saleid) {
        this.saleid = saleid;
    }

    public int getProductid() {
        return productid;
    }

    public void setProductid(int productid) {
        this.productid = productid;
    }

    public int getSalegoal() {
        return salegoal;
    }

    public void setSalegoal(int salegoal) {
        this.salegoal = salegoal;
    }

    public int getSaleachieve() {
        return saleachieve;
    }

    public void setSaleachieve(int saleachieve) {
        this.saleachieve = saleachieve;
    }

    public Date getSalestart() {
        return salestart;
    }

    public void setSalestart(Date salestart) {
        this.salestart = salestart;
    }

    public Date getSaleend() {
        return saleend;
    }

    public void setSaleend(Date saleend) {
        this.saleend = saleend;
    }

    public List<Staff> getStafflist() {
        return stafflist;
    }

    public void setStafflist(List<Staff> stafflist) {
        this.stafflist = stafflist;
    }

    public List<Client> getClientlist() {
        return clientlist;
    }

    public void setClientlist(List<Client> clientlist) {
        this.clientlist = clientlist;
    }

    public String toString(){
        return "Sale{" +"saleid="+saleid
                +", productid="+productid
                +", salegoal="+salegoal
                +", saleachieve="+saleachieve
                +", salestart="+salestart
                +", saleend="+saleend
                +"}";
    }
}
