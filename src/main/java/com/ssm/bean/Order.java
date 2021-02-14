package com.ssm.bean;

/*
* 订单信息
* 由于订单与其他对象都是 1：n 的关系，所有联系都记录在order
* */
public class Order {
    private int orderid;//主键：订单编号
    private int staffid;//员工编号
    private int clientid;//客户编号
    private int productid;//产品编号
    private int saleid;// 销售编号
    private String orderstate;//订单进度记录：（A：未访问、B：正在访问、C：是否完成签约（0，1）、D：是否完成收款（0、1））
    private String orderrecord;//面谈记录
    private int orderprofit;//订单金额
    private int productcount;//产品销量

    public int getOrderid() {
        return orderid;
    }

    public void setOrderid(int orderid) {
        this.orderid = orderid;
    }

    public int getStaffid() {
        return staffid;
    }

    public void setStaffid(int staffid) {
        this.staffid = staffid;
    }

    public int getClientid() {
        return clientid;
    }

    public void setClientid(int clientid) {
        this.clientid = clientid;
    }

    public int getProductid() {
        return productid;
    }

    public void setProductid(int productid) {
        this.productid = productid;
    }

    public int getSaleid() {
        return saleid;
    }

    public void setSaleid(int saleid) {
        this.saleid = saleid;
    }

    public String getOrderstate() {
        return orderstate;
    }

    public void setOrderstate(String orderstate) {
        this.orderstate = orderstate;
    }

    public String getOrderrecord() {
        return orderrecord;
    }

    public void setOrderrecord(String orderrecord) {
        this.orderrecord = orderrecord;
    }

    public int getOrderprofit() {
        return orderprofit;
    }

    public void setOrderprofit(int orderprofit) {
        this.orderprofit = orderprofit;
    }

    public int getProductcount() {
        return productcount;
    }

    public void setProductcount(int productcount) {
        this.productcount = productcount;
    }

    public String toString(){
        return "Order{" +"orderid="+orderid
                +"staffid="+staffid
                +"clientid="+clientid
                +"productid="+productid
                +"saleid="+saleid
                +"orderstate="+orderstate
                +"orderrecord="+orderrecord
                +"orderprofit="+orderprofit
                +"productcount="+productcount
                +"}";
    }
}
