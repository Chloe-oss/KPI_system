package com.ssm.service;

import com.ssm.bean.Client;
import com.ssm.bean.Order;
import com.ssm.dao.OrderDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;

@Service("SaleService")
public class SaleServiceImpl implements SaleService{

    @Autowired
    private OrderDao od;

    public HashMap<Integer,Integer> findClient_Order(int saleid){
        System.out.println("SaleService/findClient_Order：获取记录表<客户，订单>...");
        List<Order> orderlist=od.db_findOrdersbySaleId(saleid);
        HashMap<Integer,Integer> client_order=new HashMap<Integer,Integer>();
        for(Order order:orderlist)
            client_order.put(order.getClientid(),order.getOrderid());
        return client_order;
    }
}
