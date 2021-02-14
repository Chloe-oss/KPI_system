package com.test;

import com.ssm.bean.Client;
import com.ssm.dao.ClientDao;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;
import java.io.InputStream;

/*
* 数据库bean测试
*/
public class test_bean {
    //test1：测试 bean+mybatis第一次基础测试
    /*
    * bug1：用@Repository注解是ok的，但是用ClientDao.xml行不通，基本配置应该是没问题，测试流程也可以共用，怀疑是mapper与dao的衔接出问题了
    * */
    @Test
    public void test1()throws Exception{
        //创建JavaBean
        Client c=new Client();
        c.setClientid(2); c.setClientname("客户B"); c.setClientcontact("222BB"); c.setClientintroduction("第二位客户哦");
        //加载配置文件
        InputStream in= Resources.getResourceAsStream("mybatis-config.xml");
        // 创建SqlSessionFactory对象
        SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(in);
        // 创建SqlSession对象
        SqlSession session = factory.openSession();
        // 获取到代理对象
        ClientDao dao = session.getMapper(ClientDao.class);
        // 保存
        dao.db_addClient(c);
        // 提交事务
        session.commit();//数据提交
        // 关闭资源
        session.close();
        in.close();
    }
}
