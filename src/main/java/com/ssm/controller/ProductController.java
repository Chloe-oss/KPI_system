package com.ssm.controller;

import com.ssm.bean.Product;
import com.ssm.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;

import java.util.List;

/* 产品管理 */
@Controller
public class ProductController {

    @Autowired
    private ProductService ps;

    //添加产品
    public int AddProduct(Product product){
        System.out.println("ProductController/AddProduct：添加新的产品...");
        Product cur=ps.findProductbyProductId(product.getProductid());
        if(cur==null){//不存在产品，添加成功
            ps.toAddProduct(product);
            return 1;
        }else
            return 0;//存在产品，添加失败
    }

    //删除产品
    public int DeleteProduct(Product product){
        System.out.println("ProductController/DeleteProduct：删除产品...");
        Product cur=ps.findProductbyProductId(product.getProductid());
        if(cur==null)//不存在产品，删除失败
            return 0;
        else {
            ps.toDeleteProduct(product.getProductid());
            return 1;//存在产品，删除成功
        }
    }

    //更新产品
    public int UpdateProduct(Product product){
        System.out.println("ProductController/UpdateProduct：更新产品...");
        Product cur=ps.findProductbyProductId(product.getProductid());
        if(cur==null)//不存在产品，更新失败
            return 0;
        else {
            ps.toUpdateProduct(product);
            return 1;//存在产品，更新成功
        }
    }

    //查找产品

    //显示所有产品
    public String AllProduct(Model model){
        System.out.println("ProductController/UpdateProduct：更新产品...");
        List<Product> products=ps.findAllProducts();
        model.addAttribute("allproducts",products);
        return "";
    }
}
