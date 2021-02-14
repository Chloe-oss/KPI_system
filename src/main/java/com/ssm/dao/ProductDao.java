package com.ssm.dao;

import com.ssm.bean.Product;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProductDao {
    //添加产品
    @Insert("insert into t_product (productid,productname,productintroduction) values (#{productid},#{productname},#{productintroduction})")
    public void db_addProduct(Product product);
    //删除产品信息
    @Delete("delete from t_product where productid=#{productid}")
    public void db_deleteProduct(int productid);
    //更新产品信息
    @Update("update t_product set productname=#{productname},productintroduction=#{productintroduction} where productid=#{productid}")
    public void db_updateProduct(Product product);

    //通过产品编号获取产品信息
    @Select("select * from t_product where productid=#{productid}")
    public Product db_findProductbyProductId(int productid);
    //获取所有产品
    @Select("select * from t_product")
    public List<Product> db_findAllProducts();
}
