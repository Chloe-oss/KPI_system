# 创建数据库
create database db_KPI;
# 使用数据库
use db_KPI;
# 创建表 t_Client 客户信息表
create table t_Client(
clientid int primary key,
clientname varchar(20),
clientcontact varchar(20),
clientintroduction varchar(20)
);
# 创建表 t_Product 产品信息表
create table t_Product(
productid int primary key,  -- 产品编号
productname varchar(20), -- 产品名称
productintroduction varchar(20)  -- 产品介绍
);
# 创建表 t_Sale 销售信息表
create table t_Sale(
saleid int primary key,  -- 销售编号
productid int,  -- 产品编号
salegoal int,  -- 目标销量
saleachieve int,  -- 实际完成的销量
salestart date,  -- 发布日期
saleend date,  -- 结束日期
foreign key (productid) references  t_Product (productid)
);
# 创建表 t_Order 订单表
create table t_Order(
orderid int primary key,   -- 订单编号
staffid int,   -- 员工编号
clientid int,  -- 客户编号
productid int, -- 产品编号
saleid int,  -- 销售编号
orderstate char(1),  -- 订单进度状态记录
orderrecord varchar(255),  -- 面谈记录
orderprofit int,  -- 订单金额
productcount int,  -- 产品销量
foreign key (clientid) references  t_Client (clientid),
foreign key (productid) references  t_Product (productid),
foreign key (saleid) references  t_Sale (saleid)
);
# 创建表 t_Role 职位信息表
create table t_Role(
roleid int primary key,  -- 职位编号
rolename varchar(20)  -- 职位名称
);
# 创建表 t_Group 小组表
create table t_Group(
    groupid int primary key,   -- 小组编号
    groupleaderid int,   -- 组长编号
    groupname varchar(20)   -- 组名
);
# 创建表 t_Staff 员工信息表
create table t_Staff(
staffid int primary key,  -- 员工编号
staffname varchar(20),  -- 员工姓名
staffcode varchar(20),  -- 登录账号
staffpwd varchar(20),  -- 登录密码
groupid int,  -- 团队编号
staffimg varchar(255),   -- 头像路径
staffsex varchar(20),  -- 性别
staffbirthdate date,  -- 出生日期
staffphone varchar(20),  -- 联系电话
staffemail varchar(20),  -- 邮箱
staffarea varchar(20),  -- 区域
rolename varchar(20),  -- 职位
roleid int,  -- 职位编号
staffentryjob date,  -- 入职时间
staffresignatejob date,  -- 离职时间
foreign key (groupid) references  t_Group (groupid),
foreign key (roleid) references  t_Role (roleid)
);
# t_Staff初始化
insert into t_Staff(staffid,staffname,staffcode,staffpwd,staffimg) values (1,'员工A','A酱','111AAA.','D:\KPI_images\guitar.jsp');
insert into t_Staff(staffid,staffname,staffcode,staffpwd,staffimg) values (2,'员工B','B酱','222BBB.','D:\KPI_images\happy.jsp');
insert into t_Staff(staffid,staffname,staffcode,staffpwd,staffimg) values (3,'员工C','C酱','333CCC.','D:\KPI_images\逢考必过.jsp');
insert into t_Staff(staffid,staffname,staffcode,staffpwd,staffimg) values (4,'员工D','D酱','444DDD.','D:\KPI_images\guitar.jsp');
insert into t_Staff(staffid,staffname,staffcode,staffpwd,staffimg) values (5,'员工E','E酱','555EEE.','D:\KPI_images\happy.jsp');
# t_Role初始化
insert into t_Role (roleid, rolename) values (1,'普通员工');
insert into t_Role (roleid, rolename) values (2,'组长');
insert into t_Role (roleid, rolename) values (3,'部门经理');
insert into t_Role (roleid, rolename) values (4,'区域经理');
insert into t_Role (roleid, rolename) values (5,'销售经理');
insert into t_Role (roleid, rolename) values (6,'审核员');