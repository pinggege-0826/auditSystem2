package com.lovo.audit.entity.lsz;

import javax.persistence.*;
import java.util.Set;

/**
 * 用户退货表
 */
@Entity
@Table(name = "sys_userReturn")
public class UserReturnEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "u_supplierId")
    private int supplierId;
    @Column(name = "u_salesOrder",length = 48)
    /**退货订单号*/
    private String salesOrder;
    @Column(name = "u_orderNum",length = 48)
    /**订单号*/
    private String orderNum;
    @Column(name = "u_userId",length = 48)
    /**用户ID*/
    private String userId;
    @Column(name = "u_money")
    /**退款金额*/
    private double money;
    @Column(name = "u_payment",length = 48)
    /**退款方式*/
    private String payment;
    @Column(columnDefinition = "TIMESTAMP",name = "u_refundTime",length = 48)
    /**退款时间*/
    private String refundTime;
    @Column(name = "u_tag")
    /**退货状态*/
    private int tag;
    /**商品集合*/
    @OneToMany(mappedBy = "userReturn")
    private Set<SupplierEntity> supplierSet;

    public int getSupplierId() {
        return supplierId;
    }

    public void setSupplierId(int supplierId) {
        this.supplierId = supplierId;
    }

    public String getSalesOrder() {
        return salesOrder;
    }

    public void setSalesOrder(String salesOrder) {
        this.salesOrder = salesOrder;
    }

    public String getOrderNum() {
        return orderNum;
    }

    public void setOrderNum(String orderNum) {
        this.orderNum = orderNum;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public double getMoney() {
        return money;
    }

    public void setMoney(double money) {
        this.money = money;
    }

    public String getPayment() {
        return payment;
    }

    public void setPayment(String payment) {
        this.payment = payment;
    }

    public String getRefundTime() {
        return refundTime;
    }

    public void setRefundTime(String refundTime) {
        this.refundTime = refundTime;
    }

    public int getTag() {
        return tag;
    }

    public void setTag(int tag) {
        this.tag = tag;
    }

    public Set<SupplierEntity> getSupplierSet() {
        return supplierSet;
    }

    public void setSupplierSet(Set<SupplierEntity> supplierSet) {
        this.supplierSet = supplierSet;
    }
}
