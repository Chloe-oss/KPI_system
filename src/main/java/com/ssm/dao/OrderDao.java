package com.ssm.dao;

import com.ssm.bean.Order;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface OrderDao {

    //添加订单
    @Insert("insert into t_order (" +
            "orderid,staffid,clientid,productid,saleid,orderstate,orderrecord,orderprofit,productcount" +
            ")values(" +
            "#{orderid},#{staffid},#{clientid},#{productid},#{saleid},#{orderstate},#{orderrecord},#{orderprofit},#{productcount}" +
            ")")
    public void db_addOrder(Order order);
    //删除订单
    @Delete("delete from t_order where orderid=#{orderid}")
    public void db_deleteorder(int orderid);
    //修改订单
    @Update("update t_order set staffid=#{staffid},clientid=#{clientid},productid=#{productid},saleid=#{saleid},orderstate=#{orderstate},#{orderrecord},#{orderprofit},#{productcount} where orderid=#{orderid}")
    public void db_updateOrder(Order order);

    //根据订单编号获取订单信息
    @Select("select * from t_order where orderid=#{orderid}")
    public Order db_findOrderbyOrderId(int OrderId);

    //获取同一员工的订单列表
    @Select("select * from t_order where staffid=#{staffid}")
    public List<Order> db_findOrdersbyStaffId(int staffid);
    //获取同一产品的订单列表
    @Select("select * from t_order where productid=#{productid}")
    public List<Order> db_findOrdersbyProductId(int productid);
    //获取同一客户的订单列表
    @Select("select * from t_order where clientid=#{clientid}")
    public List<Order> db_findOrdersbyClientId(int clientid);
    //获取同一销售的订单列表
    @Select("select * from t_order where saleid=#{saleid}")
    public List<Order> db_findOrdersbySaleId(int saleid);

    //获取同一员工的客户清单
    @Select("select clientid from t_order where staffid=#{staffid}")
    public List<Integer> db_findClientsbyStaffId(int staffid);
    //获取同一产品的客户清单
    @Select("select clientid from t_order where productid=#{productid}")
    public List<Integer> db_findClientsbyProductId(int productid);
    //获取同一销售的客户清单
    @Select("select clientid from t_order where saleid=#{saleid}")
    public List<Integer> db_findClientsbySaleId(int saleid);
}
