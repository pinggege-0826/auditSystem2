package com.lovo.audit.entity.hjp;

import javax.persistence.*;

@Entity
@Table(name = "sys_userGoods")
public class UserGoodsEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "g_id")
    private int id;

    /**商品类型*/
    @ManyToOne
    @JoinColumn(name = "g_goodsTypeId")
    private TypeForGoodsEntity typeForGoodsEntity;

    /**商品编号*/
    @Column(name = "g_goodsCode")
    private String goodsCode;

    /**商品名*/
    @Column(name = "g_goodsName")
    private String goodsName;

    /**商品单价*/
    @Column(name = "g_price")
    private double price;

    /**商品数量*/
    @Column(name = "g_goodsNum")
    private int goodsNum;

    /**订单对象*/
    @ManyToOne
    @JoinColumn(name = "uo_orderId")
    private UserOrderEntity userOrderEntity;


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getGoodsCode() {
        return goodsCode;
    }

    public void setGoodsCode(String goodsCode) {
        this.goodsCode = goodsCode;
    }

    public String getGoodsName() {
        return goodsName;
    }

    public void setGoodsName(String goodsName) {
        this.goodsName = goodsName;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getGoodsNum() {
        return goodsNum;
    }

    public void setGoodsNum(int goodsNum) {
        this.goodsNum = goodsNum;
    }

    public UserOrderEntity getUserOrderEntity() {
        return userOrderEntity;
    }

    public void setUserOrderEntity(UserOrderEntity userOrderEntity) {
        this.userOrderEntity = userOrderEntity;
    }
}
