package com.lovo.audit.entity.hjp;

import javax.persistence.*;
import java.util.List;

/**
 * 用户商品实体类
 */
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
    @Column(name = "g_goodsCode",length = 80)
    private String goodsCode;

    /**商品名*/
    @Column(name = "g_goodsName",length = 48)
    private String goodsName;

    /**商品规格与用户订单商品中间表集合*/
    @OneToMany(mappedBy = "userGoodsEntity")
    private List<SizeToUserGoods> toUserGoodsList;

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

    public TypeForGoodsEntity getTypeForGoodsEntity() {
        return typeForGoodsEntity;
    }

    public void setTypeForGoodsEntity(TypeForGoodsEntity typeForGoodsEntity) {
        this.typeForGoodsEntity = typeForGoodsEntity;
    }

    public List<SizeToUserGoods> getToUserGoodsList() {
        return toUserGoodsList;
    }

    public void setToUserGoodsList(List<SizeToUserGoods> toUserGoodsList) {
        this.toUserGoodsList = toUserGoodsList;
    }

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
