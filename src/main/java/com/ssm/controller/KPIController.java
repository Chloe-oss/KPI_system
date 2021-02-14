package com.ssm.controller;

import com.ssm.bean.Staff;
import com.ssm.service.SaleService;
import com.ssm.service.StaffService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

/* 绩效统计 */
@Controller
public class KPIController {

    /* 目前仅实现每个人、每月的KPI */

    @Autowired
    private SaleService sas;

    @Autowired
    private StaffService sts;

    //获取每月的目标销售量
    //获取每月的实际销售量
    //获取每月的目标销售额
    //获取每月的实际销售额

    //统计每月的业绩完成率
    //统计收款额的累计达成率
    //统计行为管理考核系数
}
