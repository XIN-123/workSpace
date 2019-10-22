CREATE DATABASE businessmanager;
USE businessmanager;
CREATE TABLE IF NOT EXISTS admin(
adminId	INT PRIMARY KEY AUTO_INCREMENT COMMENT '编号',
adminName VARCHAR(50) NOT NULL COMMENT '用户名',
adminPwd VARCHAR(20) NOT NULL COMMENT '密码',
adminAuth INT NOT NULL COMMENT '管理员级别' 
)COMMENT '管理员表';

INSERT INTO admin VALUES(NULL,'admin','123456','1'),(NULL,'manager','123456','2'),(NULL,'manager1','123456','2');
#SELECT adminId,adminName,adminPwd,userStatus FROM admin,usertype WHERE admin.adminAuth=usertype.id;
#delete from admin where adminId = 5;
#update admin set adminName='哈哈',adminPwd='123321' where adminId=3;

CREATE TABLE IF NOT EXISTS userinfo(
userId INT PRIMARY KEY AUTO_INCREMENT COMMENT '编号',
userName VARCHAR(50) NOT NULL COMMENT '用户名',
userPwd VARCHAR(50) NOT NULL COMMENT '密码',
userAddr VARCHAR(200) NOT NULL COMMENT '地址',
userPhone VARCHAR(11) NOT NULL COMMENT '电话号码',
userTruename VARCHAR(50) COMMENT '真实姓名',
userSex VARCHAR(10) NOT NULL COMMENT '性别',
userBirthday DATE COMMENT '出生年月',
userRegtime DATE NOT NULL COMMENT '注册时间',
userType INT NOT NULL COMMENT '用户身份',
userStatus INT NOT NULL COMMENT '登陆状态'
)COMMENT '用户信息表';

#select userinfo.*,usertype.userStatus from userinfo,usertype where userinfo.userType=usertype.id 
#delete from userinfo where userId = ;
#update userinfo set userName='',userPwd='',userAddr='',userPhone='',userTruename='',userSex='',userBirthday='',userRegtime='',userType=0,userStatus=1 where userId=4

INSERT INTO userinfo VALUES(NULL,'张三','123456','北京市丰台区','15600666666','张老三','男','2000-01-01',NOW(),3,0),
(NULL,'李四','123456','北京市海淀区','15700666666',NULL,'男',NULL,NOW(),3,0),
(NULL,'里斯','123456','北京市大兴区','15800666666','王老四','女','2000-01-02',NOW(),4,0),
(NULL,'王五','123456','北京市西城区','15900666666','王老五','男','2000-01-03',NOW(),3,0),
(NULL,'赵六','123456','北京市东城区','13800666666',NULL,'男','2000-01-01',NOW(),4,0),
(NULL,'钱七','123456','北京市昌平区','13900666666','大好人','男',NULL,NOW(),3,0),
(NULL,'小周周','123456','北京市大兴区','13600666666','周星志','女',NULL,NOW(),4,1);

CREATE TABLE IF NOT EXISTS usertype(
id INT PRIMARY KEY AUTO_INCREMENT COMMENT '编号',
userStatus VARCHAR(20) NOT NULL COMMENT '登陆类型'
)COMMENT '人员身份表';

INSERT INTO usertype VALUES(NULL,'超级管理员'),(NULL,'普通管理员'),(NULL,'买家'),(NULL,'卖家');

CREATE TABLE IF NOT EXISTS productType(
ptypeId INT PRIMARY KEY AUTO_INCREMENT COMMENT '编号',
ptypeName VARCHAR(50) NOT NULL COMMENT '商品类别名称',
ptypeParentid INT NOT NULL COMMENT '父类编号'
)COMMENT '商品类别表';

INSERT INTO productType VALUES(NULL,'电脑',0),
(NULL,'手机',0),
(NULL,'外设产品',0),
(NULL,'华为电脑',1),
(NULL,'惠普电脑',1),
(NULL,'苹果电脑',1),
(NULL,'索尼电脑',1),
(NULL,'vivo手机',2),
(NULL,'oppp手机',2),
(NULL,'苹果手机',2),
(NULL,'华为手机',2),
(NULL,'鼠标',3),
(NULL,'键盘',3),
(NULL,'耳机',3);


CREATE TABLE IF NOT EXISTS product(
proId INT PRIMARY KEY AUTO_INCREMENT COMMENT '编号',
proName VARCHAR(50) NOT NULL COMMENT '商品名称',
proType INT NOT NULL COMMENT '商品类别',
proDescription VARCHAR(100) COMMENT '商品描述',
proSimg VARCHAR(100) COMMENT '商品小图地址',
proBimg VARCHAR(100) COMMENT '商品大图地址',
proPrice DECIMAL(10,2) NOT NULL COMMENT '商品价格',
proParam VARCHAR(200) COMMENT '商品详细参数以逗号分隔' 
)COMMENT '商品信息表';

#select proId,proName,proType,proDescription,proSimg,proBimg,proPrice,proParam,ptypeName from product,productType where ptypeId=proType and proName like '%%' limit 1,3;
#delete from product where proId = 8;
#update product set proName='好电脑',proType=6,proDescription='h啊啊',proSimg='',proBimg='',proPrice=99.9,proParam='颜色：银色,重量：1.5kg' where proId=9

INSERT INTO product VALUES(NULL,'苹果笔记本电脑',6,'这个是一个好电脑',NULL,NULL,9999.99,'大小：19寸,颜色：银色,重量：1.5kg'),
(NULL,'华为笔记本电脑',4,'这个是一个好电脑',NULL,NULL,8999.99,'大小：19寸,颜色：银色,重量：1.0kg'),
(NULL,'华为手机',11,'这个是一个好手机',NULL,NULL,1999.99,'大小：7寸,颜色：银色,重量：0.2kg'),
(NULL,'vivo手机',8,'这个是一个好手机',NULL,NULL,9999.99,'大小：8寸,颜色：银色,重量：1.5kg'),
(NULL,'索尼笔记本电脑',7,'这个是一个好电脑',NULL,NULL,999.99,'大小：19寸,颜色：银色,重量：1.5kg'),
(NULL,'惠普笔记本电脑',5,'这个是一个好电脑',NULL,NULL,6999.99,'大小：19寸,颜色：银色,重量：1.5kg'),
(NULL,'镭射鼠标',12,'这个是一个好鼠标',NULL,NULL,99.99,'大小：19寸,颜色：银色,重量：1.5kg');

CREATE TABLE IF NOT EXISTS orderd(
orderId INT PRIMARY KEY AUTO_INCREMENT COMMENT '编号',
orderPro VARCHAR(50) NOT NULL COMMENT '订单商品名称',
userId INT NOT NULL COMMENT '用户编号',
delAddr VARCHAR(200) NOT NULL COMMENT '发货地址',
userAddr VARCHAR(200) NOT NULL COMMENT '收货地址',
orderTime DATE NOT NULL COMMENT '发货时间',
ordreBz VARCHAR(200) COMMENT '备注',
orderStatus INT NOT NULL COMMENT '状态'
)COMMENT '订单表';

#delete from orderd where orderId=

SELECT orderId,orderPro,userId,delAddr,userAddr,orderTime,ordreBz,orderstatus.orderStatus FROM orderd,orderstatus WHERE orderd.orderStatus=ordersId
INSERT INTO orderd VALUES(NULL,'华为笔记本电脑',2,'北京市海淀区','北京市东城区',NOW(),NULL,1),
(NULL,'苹果笔记本电脑',4,'北京市东城区','北京市东城区',NOW(),NULL,3),
(NULL,'华为手机',6,'北京市海淀区','北京市东城区',NOW(),NULL,2);

CREATE TABLE IF NOT EXISTS orderstatus(
ordersId INT PRIMARY KEY AUTO_INCREMENT COMMENT '编号',
orderStatus VARCHAR(20) NOT NULL COMMENT '状态'
)COMMENT '订单状态表';

INSERT INTO orderstatus VALUES(NULL,'待发货'),(NULL,'运输中'),(NULL,'待收货'),(NULL,'已收货');

CREATE TABLE IF NOT EXISTS COMMENT(
comId INT PRIMARY KEY AUTO_INCREMENT COMMENT '编号',
comName VARCHAR(50) NOT NULL COMMENT '评价的商品名称',
userId INT NOT NULL COMMENT '用户编号',
comTitle VARCHAR(50) NOT NULL COMMENT '评价标题',
comContent VARCHAR(200) COMMENT '评价内容',
comTime DATE NOT NULL COMMENT '评价时间',
comScore DECIMAL(3,2) NOT NULL COMMENT '评价分数'
)COMMENT '评价表';

#select * from comment 
#update comment set comName='',userId=2,comTitle='',comContent='2',comTime='',comScore=2 where comId=2

INSERT INTO COMMENT VALUES(NULL,'苹果笔记本电脑',2,'这真是一个好电脑','哈哈哈哈好啊好好电脑',NOW(),5),
(NULL,'华为笔记本电脑',4,'这真是一个好电脑','哈哈哈哈好啊好好电脑',NOW(),4);

CREATE TABLE IF NOT EXISTS shoppingTorlley(
troId INT PRIMARY KEY AUTO_INCREMENT COMMENT '编号',
proId INT NOT NULL COMMENT '收藏的商品编号',
userId INT NOT NULL COMMENT '用户编号',
troTime DATE NOT NULL COMMENT '收藏日期'
)COMMENT '购物车';

SELECT * FROM shoppingTorlley
INSERT INTO shoppingTorlley VALUES(NULL,1,1,NOW());

SELECT * FROM shoppingTorlley 

SELECT * FROM COMMENT

SELECT * FROM orderd LEFT JOIN orderstatus ON orderd.orderStatus = ordersId
 

SELECT * FROM orderd 

SELECT * FROM product

SELECT * FROM producttype

SELECT * FROM userinfo

SELECT * FROM admin; 