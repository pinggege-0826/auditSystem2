package com.lovo.audit.entity.hjp;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "sys_supplyOrder")
public class SupplyOrderEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "s_id")
    private int id;

    /**供应商名*/
    @Column(name = "s_supplierName")
    private String supplierName;

    /**供货订单编号*/
    @Column(name = "s_orderNum")
    private String orderNum;

    /**总金额*/
    @Column(name = "s_allMoney")
    private double allMoney;

    /**采购单对象*/


    /**供货商品集合*/
    @OneToMany(mappedBy = "")
    private List<SupplyGoodsEntity > goodsList;

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
