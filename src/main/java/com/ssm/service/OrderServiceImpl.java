package com.ssm.service;

import com.ssm.bean.Order;
import com.ssm.dao.OrderDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("OrderService")
public class OrderServiceImpl implements OrderService{

    @Autowired
    private OrderDao od;

    //添加订单
    public void toAddOrder(Order order){
        System.out.println("OrderService/toAddOrder：添加订单...");
        od.db_addOrder(order);
    }
    //删除订单
    public void toDeleteOrder(int orderid){
        System.out.println("OrderService/toDeleteOrder：删除订单...");
        od.db_deleteorder(orderid);
    }
    //修改订单
    public void toUpdateOrder(Order order){
        System.out.println("OrderService/toUpdateOrder：修改订单...");
        od.db_updateOrder(order);
    }

    //根据订单编号查找订单
    public Order findOrderbyOrderId(int orderid){
        System.out.println("OrderService/findOrderbyOrderId：根据订单编号查找订单...");
        return od.db_findOrderbyOrderId(orderid);
    }
    //获取某一类订单列表
    public List<Order> findOrders(String com,int id){
        System.out.println("OrderService/findOrders：获取某一类订单列表...");
        if(com=="staffid")
            return od.db_findOrdersbyStaffId(id);
        else if(com=="productid")
            return od.db_findOrdersbyProductId(id);
        else if(com=="clientid")
            return od.db_findOrdersbyClientId(id);
        else if(com=="saleid")
            return od.db_findOrdersbySaleId(id);
        else return null;
    }
}
