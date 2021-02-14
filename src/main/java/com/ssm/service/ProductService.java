package com.ssm.service;

import com.ssm.bean.Order;
import com.ssm.bean.Product;

import java.util.Date;
import java.util.HashMap;
import java.util.List;

public interface ProductService {

    //添加产品
    public void toAddProduct(Product product);
    //删除产品
    public void toDeleteProduct(int productid);
    //修改产品
    public void toUpdateProduct(Product product);

    //根据编号查找产品
    public Product findProductbyProductId(int productid);
    //查找所有产品
    public List<Product> findAllProducts();

}
