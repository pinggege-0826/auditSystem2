package com.lovo.audit.entity.lsz;

import javax.persistence.*;

/**
 * 供应商退货表
 */
@Entity
@Table(name = "sys_supplier")
public class SupplierEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "s_returnId")
    /**退货订单ID*/
    private int returnId;
    @Column(name = "s_salesOrder")
    /**退货订单号*/
    private int salesOrder;
    @Column(name = "s_goodsName",length = 48)
    /**退货商品名称*/
    private String goodsName;
    @Column(name = "s_procurementNub")
    /**退货商品数量*/
    private int procurementNub;
    @Column(name = "s_totalMoney")
    /**订单总金额*/
    private double totalMoney;
    @Column(name = "s_supplyName",length = 48)
    /**供应商名称*/
    private String supplyName;
    @Column(name = "s_bidCode",length = 48)
    /**竞标编号*/
    private String bidCode;
    @Column(name = "s_batch",length = 48)
    /**进货批次*/
    private String batch;
    @Column(columnDefinition = "TIMESTAMP",name = "s_backTime",length = 48)
    /**退货时间*/
    private String backTime;
    @Column(name = "s_tag")
    /**退货状态,0为退货中，1为已退货*/
    private String tag;

    public int getReturnId() {
        return returnId;
    }

    public void setReturnId(int returnId) {
        this.returnId = returnId;
    }

    public int getSalesOrder() {
        return salesOrder;
    }

    public void setSalesOrder(int salesOrder) {
        this.salesOrder = salesOrder;
    }

    public String getGoodsName() {
        return goodsName;
    }

    public void setGoodsName(String goodsName) {
        this.goodsName = goodsName;
    }

    public int getProcurementNub() {
        return procurementNub;
    }

    public void setProcurementNub(int procurementNub) {
        this.procurementNub = procurementNub;
    }

    public double getTotalMoney() {
        return totalMoney;
    }

    public void setTotalMoney(double totalMoney) {
        this.totalMoney = totalMoney;
    }

    public String getSupplyName() {
        return supplyName;
    }

    public void setSupplyName(String supplyName) {
        this.supplyName = supplyName;
    }

    public String getBidCode() {
        return bidCode;
    }

    public void setBidCode(String bidCode) {
        this.bidCode = bidCode;
    }

    public String getBatch() {
        return batch;
    }

    public void setBatch(String batch) {
        this.batch = batch;
    }

    public String getBackTime() {
        return backTime;
    }

    public void setBackTime(String backTime) {
        this.backTime = backTime;
    }

    public String getTag() {
        return tag;
    }

    public void setTag(String tag) {
        this.tag = tag;
    }
}
