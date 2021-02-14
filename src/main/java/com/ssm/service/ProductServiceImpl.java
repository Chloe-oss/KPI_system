package com.ssm.service;

import com.ssm.bean.Order;
import com.ssm.bean.Product;
import com.ssm.bean.Sale;
import com.ssm.dao.OrderDao;
import com.ssm.dao.ProductDao;
import com.ssm.dao.SaleDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.HashMap;
import java.util.List;

@Service("ProductService")
public class ProductServiceImpl implements ProductService{

    @Autowired
    private ProductDao pd;

    //添加产品
    public void toAddProduct(Product product){
        System.out.println("ProductService/toAddProduct：添加产品...");
        pd.db_addProduct(product);
    }
    //删除产品
    public void toDeleteProduct(int productid){
        System.out.println("ProductService/toDeleteProduct：删除产品...");
        pd.db_deleteProduct(productid);
    }
    //修改产品
    public void toUpdateProduct(Product product){
        System.out.println("ProductService/toUpdateProduct：修改产品...");
        pd.db_updateProduct(product);
    }

    //根据编号查找产品
    public Product findProductbyProductId(int productid){
        System.out.println("ProductService/findProductbyProductId：根据编号查找产品...");
        return pd.db_findProductbyProductId(productid);
    }
    //查找所有产品
    public List<Product> findAllProducts(){
        System.out.println("ProductService/findAllProducts：查找所有产品...");
        return pd.db_findAllProducts();
    }
}
