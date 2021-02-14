package com.ssm.controller;

import com.ssm.bean.Client;
import com.ssm.service.ClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

/* 客户管理 */
@Controller
public class ClientController {

    @Autowired
    private ClientService cs;

    //添加客户
    @RequestMapping("/Client/AddClient")
    public void AddClient(Client client, HttpServletRequest req, HttpServletResponse res)throws IOException {
        System.out.println("ClientController/AddClient：添加客户...");
        //是否已经存在当前客户
        Client cur=cs.findClientbyClientId(client.getClientid());
        /*if(cur==null){
            cs.toAddClient(client);
            return 1;//不存在，添加成功
        }else
            return 0;//已经存在，添加失败*/
        cs.toAddClient(client);
        res.sendRedirect(req.getContextPath()+"/Client/FindAllClient");
    }
    //删除客户
    @RequestMapping("/Client/DeleteClient")
    public int DeleteClient(int clientid){
        System.out.println("ClientController/DeleteClient：删除客户...");
        //是否存在当前客户
        Client cur=cs.findClientbyClientId(clientid);
        if(cur==null)
            return 0;//不存在，删除失败
        else {
            cs.toDeleteClient(clientid);
            return 1;//存在，删除成功
        }

    }
    //更新客户
    @RequestMapping("/Client/UpdateClient")
    public int UpdateClient(Client client){
        System.out.println("ClientController/UpdateClient：更新客户...");
        //是否存在当前客户
        Client cur=cs.findClientbyClientId(client.getClientid());
        if(cur==null)
            return 0;//不存在，更新失败
        else {
            cs.toUpdateClient(client);
            return 1;//存在，更新成功
        }
    }
    //显示所有客户
    @RequestMapping("/Client/FindAllClient")
    public String FindAllClient(Model model){
        System.out.println("ClientController/FindAllClient：显示所有客户...");
        List<Client> clients=cs.findAllClients();
        model.addAttribute("allclients",clients);
        return "list";
    }
    //查询某一员工的客户
    @RequestMapping("/Client/FindClientsbyStaffId")
    public String FindClientsbyStaffId(int staffid,Model model){
        System.out.println("ClientController/FindClientsbyStaffId：查询某一员工的客户...");
        List<Integer> clients=cs.findClients("staffid",staffid);
        model.addAttribute("staff/clients",clients);
        return "";
    }
    //查询某一产品的客户
    @RequestMapping("/Client/FindClientsbyProductId")
    public String FindClientsbyProductId(int productid,Model model){
        System.out.println("ClientController/FindClientsbyProductId：查询某一产品的客户...");
        List<Integer> clients=cs.findClients("productid",productid);
        model.addAttribute("product/clients",clients);
        return "";
    }
    //查询某一销售的客户名单
    @RequestMapping("/Client/FindClientsbySaleId")
    public String FindClientsbySaleId(int saleid,Model model){
        System.out.println("ClientController/FindClientsbySaleId：查询某一销售的客户名单...");
        List<Integer> clients=cs.findClients("saleid",saleid);
        model.addAttribute("sale/clients",clients);
        return "";
    }
}
