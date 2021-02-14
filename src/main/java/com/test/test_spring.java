package com.test;

import com.ssm.service.ClientService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/* 测试 spring 框架 */
public class test_spring {

    /*
    * 以Client为例测试
    * */
    @Test
    public void run1(){
        ApplicationContext ac=new ClassPathXmlApplicationContext("classpath:applicationContext.xml");
        ClientService cs=(ClientService) ac.getBean("ClientService");
        cs.findAllClients();
    }
}
