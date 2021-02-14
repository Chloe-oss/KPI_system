package com.ssm.bean;

import java.util.List;

public class Client {
    private int clientid;//客户编号
    private String clientname;//客户姓名
    private String clientcontact;//客户联系方式
    private String clientintroduction;//客户简介
    private List<Order> orderlist;//订单列表

    public int getClientid() {
        return clientid;
    }
    public void setClientid(int clientid) {
        this.clientid = clientid;
    }

    public String getClientname() {
        return clientname;
    }
    public void setClientname(String clientname) {
        this.clientname = clientname;
    }

    public List<Order> getOrderlist() {
        return orderlist;
    }
    public void setOrderlist(List<Order> orderlist) {
        this.orderlist = orderlist;
    }

    public String getClientcontact() {
        return clientcontact;
    }
    public void setClientcontact(String clientcontact) {
        this.clientcontact = clientcontact;
    }

    public String getClientintroduction() {
        return clientintroduction;
    }
    public void setClientintroduction(String clientintroduction) {
        this.clientintroduction = clientintroduction;
    }

    public String toString(){
        return "Client{" +"clientid="+clientid
                +", clientname="+clientname
                +", clientcontact="+clientcontact
                +", clientintroduction="+clientintroduction
                +"}";
    }
}
