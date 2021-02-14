package com.ssm.service;

import com.ssm.bean.Client;
import com.ssm.dao.ClientDao;
import com.ssm.dao.OrderDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("ClientService")
public class ClientServiceImpl implements ClientService{

    @Autowired
    private ClientDao cd;

    @Autowired
    private OrderDao od;

    //添加客户信息
    @Override
    public void toAddClient(Client client){
        System.out.println("ClientService/addClient：添加客户");
        cd.db_addClient(client);
    }
    //删除客户信息
    @Override
    public void toDeleteClient(int clientid){
        System.out.println("ClientService/deleteClient：删除客户");
        cd.db_deleteClient(clientid);
    }
    //更新客户信息
    @Override
    public void toUpdateClient(Client client){
        System.out.println("ClientService/updateClient：更新客户信息");
        cd.db_updateClient(client);
    }

    /* 查询 */
    //根据编号获取客户信息
    @Override
    public Client findClientbyClientId(int clientid){
        System.out.println("ClientService：查询客户");
        return cd.db_findClientbyClientId(clientid);
    }

    //查询所有客户
    @Override
    public List<Client> findAllClients(){
        System.out.println("ClientService/findAllClients：查询所有客户...");
        return cd.db_findAllClients();
    }

    //查询某一类客户
    @Override
    public List<Integer> findClients(String com,int id){
        System.out.println("ClientService/findClientList：查询某类客户...");
        if(com=="staffid")
            return od.db_findClientsbyStaffId(id);
        else if(com=="productid")
            return od.db_findClientsbyProductId(id);
        else if(com=="saleid")
            return od.db_findClientsbySaleId(id);
        else return null;
    }
}
