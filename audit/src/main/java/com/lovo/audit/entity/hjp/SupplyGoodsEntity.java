package com.lovo.audit.entity.hjp;

import javax.persistence.*;
import java.util.List;

/**
 * 供货商品实体类
 */
@Entity
@Table(name = "sys_supplyGoods")
public class SupplyGoodsEntity {
    /**供货商品id*/
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "sg_goodsId")
    private int id;

    /**商品编号*/
    @Column(name = "sg_goodsCode",length = 80)
    private String goodsCode;

    /**商品类型*/
    @ManyToOne
    @JoinColumn(name = "sg_goodsTypeId")
    private TypeForGoodsEntity typeForGoodsEntity;

    /**商品名称*/
    @Column(name = "sg_goodsName" , length = 24)
    private String goodsName;

    /**商品规格与供货商品中间表集合*/
    @OneToMany(mappedBy = "supplyGoodsEntity")
    private List<SizeToSupplyGoods>toSupplyGoodsList;

    /**单价*/
    @Column(name = "sg_price")
    private int price;

    /**商品数量*/
    @Column(name = "sg_goodsNum")
    private int goodsNum;

    /**订单对象*/
    @ManyToOne
    @JoinColumn(name = "sg_soid")
    private SupplyOrderEntity supplyOrderEntity;

    public SupplyOrderEntity getSupplyOrderEntity() {
        return supplyOrderEntity;
    }

    public void setSupplyOrderEntity(SupplyOrderEntity supplyOrderEntity) {
        this.supplyOrderEntity = supplyOrderEntity;
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

    public TypeForGoodsEntity getTypeForGoodsEntity() {
        return typeForGoodsEntity;
    }

    public void setTypeForGoodsEntity(TypeForGoodsEntity typeForGoodsEntity) {
        this.typeForGoodsEntity = typeForGoodsEntity;
    }

    public String getGoodsName() {
        return goodsName;
    }

    public void setGoodsName(String goodsName) {
        this.goodsName = goodsName;
    }

    public List<SizeToSupplyGoods> getToSupplyGoodsList() {
        return toSupplyGoodsList;
    }

    public void setToSupplyGoodsList(List<SizeToSupplyGoods> toSupplyGoodsList) {
        this.toSupplyGoodsList = toSupplyGoodsList;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getGoodsNum() {
        return goodsNum;
    }

    public void setGoodsNum(int goodsNum) {
        this.goodsNum = goodsNum;
    }
}
