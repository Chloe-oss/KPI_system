package com.ssm.dao;

import com.ssm.bean.Client;
import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Repository;

import java.util.List;

/*
 * 数据库 MyBatis
 */
@Repository //持久层注解
public interface ClientDao {

    //添加客户
    @Insert("insert into t_client (clientid,clientname,clientcontact,clientintroduction)values(#{clientid},#{clientname},#{clientcontact},#{clientintroduction})")
    public void db_addClient(Client client);

    //删除客户
    @Delete("delete from t_client where clientid = #{clientid}")
    public void db_deleteClient(@Param("clientid") int clientid);

    //更新客户
    @Update("update t_client set " +
            "clientname=#{clientname}," +
            "clientcontact=#{clientcontact}," +
            "clientintroduction=#{clientintroduction}" +
            "where clientid=#{clientid}")
    public void db_updateClient(Client client);

    //根据编号获取客户
    @Select("select * from t_client where clientid=#{clientid}")
    public Client db_findClientbyClientId(int clientid);

    //获取所有客户清单
    @Select("select * from t_client")
    public List<Client> db_findAllClients();
}

