package com.ssm.service;

import com.ssm.bean.Order;

import java.util.List;

/* 订单管理 */
public interface OrderService {

    //添加订单
    public void toAddOrder(Order order);
    //删除订单
    public void toDeleteOrder(int orderid);
    //修改订单
    public void toUpdateOrder(Order order);

    //根据订单编号查找订单
    public Order findOrderbyOrderId(int orderid);
    //获取某一类订单列表
    public List<Order> findOrders(String com,int id);
}
