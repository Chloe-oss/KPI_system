package com.ssm.service;

import com.ssm.bean.Client;
import com.ssm.bean.Order;

import java.util.HashMap;

public interface SaleService {

    //获取记录表<客户，订单>：OrderDao
    public HashMap<Integer,Integer> findClient_Order(int saleid);
}
