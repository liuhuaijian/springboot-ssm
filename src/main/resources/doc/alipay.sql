create table if not exists `user`(

)engine=InnoDB default charset=utf8mb4 comment='用户表';

create table `flow`(
 `id` varchar(20) not null,
 `flow_num` varchar(20) default null comment '流水号',
 `order_num` varchar(20) default null comment '订单号',
 `product_id` varchar(20) default null comment '产品主键ID',
 `paid_amount` varchar(11) default null comment '支付金额',
 `paid_method` int(11) default null comment '支付方式：1、支付宝；2、微信',
 `buy_counts` int(11) default null comment '购买个数',
 `create_time` datetime default null comment '创建时间',
 primary key (`id`)
)engine=InnoDB default charset=utf8mb4 comment='流水表';

create table `orders`(
 `id` varchar(20) not null ,
 `order_num` varchar(20) default null comment '订单号',
 `order_status` varchar(20) default null comment '订单状态：10、待付款；20、已付款',
 `paid_amount` varchar(11) default null comment '实际支付金额',
 `product_id` varchar(20) default null comment '产品表外键ID',
 `buy_counts` int(11) default null comment '购买产品的个数',
 `create_time` datetime default null comment '订单创建时间',
 `paid_time` datetime default null comment '支付时间',
 primary key (`id`)
)engine=InnoDB default charset=utf8mb4 comment='订单表';

create table `product`(
 `id` varchar(20) not null,
 `name` varchar(20) default null comment '产品名称',
 `price` varchar(20) default null comment '价格',
 primary key (`id`)
)engine=InnoDB default charset=utf8mb4 comment='产品表';

