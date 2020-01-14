package com.lovo.audit.entity.hjp;

import javax.persistence.*;
import java.util.List;

/**
 * 用户订单实体类
 */
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
    @Column(name = "uo_orderNum",length = 80)
    private String orderCode;

    /**下单时间*/
    @Column(name = "uo_orderTime")
    private String orderTime;

    /**购买资金来源*/
    @Column(name = "uo_moneySource",length = 24)
    private String moneySource;

    /**总金额*/
    @Column(name = "uo_allMoney")
    private double allMoney;

    /**结算状态*/
    @Column(name = "uo_tag")
    private int tag;

    /**商品集合*/
    @OneToMany(mappedBy = "userOrderEntity")
    private List<UserGoodsEntity> goodsList;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getOrderCode() {
        return orderCode;
    }

    public void setOrderCode(String orderCode) {
        this.orderCode = orderCode;
    }

    public String getOrderTime() {
        return orderTime;
    }

    public void setOrderTime(String orderTime) {
        this.orderTime = orderTime;
    }

    public String getMoneySource() {
        return moneySource;
    }

    public void setMoneySource(String moneySource) {
        this.moneySource = moneySource;
    }

    public double getAllMoney() {
        return allMoney;
    }

    public void setAllMoney(double allMoney) {
        this.allMoney = allMoney;
    }

    public int getTag() {
        return tag;
    }

    public void setTag(int tag) {
        this.tag = tag;
    }

    public List<UserGoodsEntity> getGoodsList() {
        return goodsList;
    }

    public void setGoodsList(List<UserGoodsEntity> goodsList) {
        this.goodsList = goodsList;
    }
}

































































































































































































































