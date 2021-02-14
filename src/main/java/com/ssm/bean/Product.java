package com.ssm.bean;

import java.util.Date;
import java.util.HashMap;
import java.util.List;

public class Product {
    private int productid;//产品编号
    private String productname;//产品名称
    private String productintroduction;//产品介绍
    private HashMap<Date,Integer> sales_Date;//每月销量
    private HashMap<Date,Integer> profit_Date;//每月销售额

    public int getProductid() {
        return productid;
    }

    public void setProductid(int productid) {
        this.productid = productid;
    }

    public String getProductname() {
        return productname;
    }

    public void setProductname(String productname) {
        this.productname = productname;
    }

    public String getProductintroduction() {
        return productintroduction;
    }

    public void setProductintroduction(String productintroduction) {
        this.productintroduction = productintroduction;
    }

    public HashMap<Date, Integer> getSales_Date() {
        return sales_Date;
    }

    public void setSales_Date(HashMap<Date, Integer> sales_Date) {
        this.sales_Date = sales_Date;
    }

    public HashMap<Date, Integer> getProfit_Date() {
        return profit_Date;
    }

    public void setProfit_Date(HashMap<Date, Integer> profit_Date) {
        this.profit_Date = profit_Date;
    }

    public String toString(){
        return "Product{" +"productid="+productid
                +", productname="+productname
                +", productintroduction="+productintroduction
                +"}";
    }
}
