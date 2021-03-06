package com.lovo.audit.entity.hjp;

import com.lovo.audit.entity.lxj.BuyOrderEntity;

import javax.persistence.*;
import java.util.List;

/**
 * 供货订单实体类
 */
@Entity
@Table(name = "sys_supplyOrder")
public class SupplyOrderEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "s_id")
    private int id;

    /**供应商名*/
    @Column(name = "s_supplierName",length = 48)
    private String supplierName;

    /**供货订单编号*/
    @Column(name = "s_orderNum",length = 80)
    private String orderNum;

    /**总金额*/
    @Column(name = "s_allMoney")
    private double allMoney;

    /**采购单对象*/
    @ManyToOne
    @JoinColumn(name = "buyId")
    private BuyOrderEntity buyOrderEntity;

    /**供货商品集合*/
    @OneToMany(mappedBy = "supplyOrderEntity")
    private List<SupplyGoodsEntity > goodsList;

    /**
     * 订单状态
     * 0-未结算
     * 1-已结算
     * 2-已通知供应商订单已结算
     */
    @Column(name = "s_tag")
    private int tag = 0;

    public BuyOrderEntity getBuyOrderEntity() {
        return buyOrderEntity;
    }

    public void setBuyOrderEntity(BuyOrderEntity buyOrderEntity) {
        this.buyOrderEntity = buyOrderEntity;
    }

    public int getTag() {
        return tag;
    }

    public void setTag(int tag) {
        this.tag = tag;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getSupplierName() {
        return supplierName;
    }

    public void setSupplierName(String supplierName) {
        this.supplierName = supplierName;
    }

    public String getOrderNum() {
        return orderNum;
    }

    public void setOrderNum(String orderNum) {
        this.orderNum = orderNum;
    }

    public double getAllMoney() {
        return allMoney;
    }

    public void setAllMoney(double allMoney) {
        this.allMoney = allMoney;
    }

    public List<SupplyGoodsEntity> getGoodsList() {
        return goodsList;
    }

    public void setGoodsList(List<SupplyGoodsEntity> goodsList) {
        this.goodsList = goodsList;
    }
}
