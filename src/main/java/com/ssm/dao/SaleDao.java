package com.ssm.dao;

import com.ssm.bean.Sale;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import java.util.List;

public interface SaleDao {
    //添加销售任务
    @Insert("insert into t_sale (saleid,productid,salegoal,saleachieve,salestart,saleend) values (#{saleid},#{productid},#{salegoal},#{saleachieve},#{salestart},#{saleend})")
    public void db_addSale(Sale sale);
    //删除销售任务
    @Delete("delete * from t_sale where saleid=#{saleid}")
    public void db_deleteSale(int saleid);
    //更新销售任务
    @Update("update t_sale set productid=#{productid},salegoal=#{salegoal},saleachieve=#{saleachieve},salestart=#{salestart},saleend=#{saleend} where saleid=#{saleid}")
    public void db_updateSale(Sale sale);

    //获取同一产品的销售
    @Select("select * from t_sale where productid=#{productid}")
    public List<Sale> db_findSalesbyProductId(int productid);
    //获取同一员工的销售
    @Select("select * from t_sale where staffid=#{staffid}")
    public List<Sale> db_findSalesbyStaffId(int staffid);
}
