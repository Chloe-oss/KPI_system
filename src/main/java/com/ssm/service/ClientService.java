package com.ssm.service;

import com.ssm.bean.Client;
import com.ssm.bean.Order;

import java.util.List;

public interface ClientService {
    //添加客户信息
    public void toAddClient(Client client);
    //删除客户信息
    public void toDeleteClient(int clientid);
    //更新客户信息
    public void toUpdateClient(Client client);

    /* 查询 */
    //根据编号获取客户信息
    public Client findClientbyClientId(int clientid);
    //查询所有客户
    public List<Client> findAllClients();
    //查询某一类客户
    public List<Integer> findClients(String com,int id);

}
