package com.lovo.audit.entity.hjp;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "sys_userOrder")
public class UserOrderEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "uo_orderId")
    private int id;
    /**前端用户ID*/
    @Column(name = "uo_user_Id")
    private String userId;

    /**订单编号*/
    @Column(name = "uo_orderNumx")
    private String orderCode;

    /**下单时间*/
    @Column(name = "uo_orderTime")
    private String orderTime;

    /**购买资金来源*/
    @Column(name = "uo_moneySource")
    private String moneySource;

    /**总金额*/
    @Column(name = "uo_allMoney")
    private double allMoney;

    /**结算状态*/
    @Column(name = "u_tag")
    private int tag;

    /**商品集合*/
    @OneToMany(mappedBy = "userOrderEntity")
    private List<UserGoodsEntity> goodsList;

}

































































































































































































































