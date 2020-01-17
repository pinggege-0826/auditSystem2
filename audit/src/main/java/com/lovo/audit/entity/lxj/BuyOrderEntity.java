package com.lovo.audit.entity.lxj;

import com.lovo.audit.entity.hjp.SupplyOrderEntity;

import javax.persistence.*;
import java.io.Serializable;
import java.sql.Date;
import java.util.List;

/**
 * 采购表
 */
@Entity
@Table(name = "sys_buy_order")
public class BuyOrderEntity  implements Serializable {
    /**
     * 采购单id
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int buyId;

    /**
     * 采购单号
     */
    @Column(length = 80)
    private String buyCode;

    /**
     * 下单时间
     */
    @Column(columnDefinition = "Datetime")
    private Date buyDate;

    /**
     * 状态
     *      0-初始化状态
     *      1-订购中状态
     *      2-审核未通过状态
     */
    private int buyStatus;

    /**
     * 采购商品集合
     */
    @OneToMany(mappedBy = "buyOrder")
    private List<ProductEntity> productEntityList;

    /**
     * 供货订单集合
     */
    @OneToMany(mappedBy = "buyOrderEntity")
    private List<SupplyOrderEntity> supplyOrderEntityList;

    public BuyOrderEntity() {
    }

    public int getBuyId() {
        return buyId;
    }

    public void setBuyId(int buyId) {
        this.buyId = buyId;
    }

    public String getBuyCode() {
        return buyCode;
    }

    public void setBuyCode(String buyCode) {
        this.buyCode = buyCode;
    }

    public Date getBuyDate() {
        return buyDate;
    }

    public void setBuyDate(Date buyDate) {
        this.buyDate = buyDate;
    }

    public int getBuyStatus() {
        return buyStatus;
    }

    public void setBuyStatus(int buyStatus) {
        this.buyStatus = buyStatus;
    }

    public List<ProductEntity> getProductEntityList() {
        return productEntityList;
    }

    public void setProductEntityList(List<ProductEntity> productEntityList) {
        this.productEntityList = productEntityList;
    }

    public List<SupplyOrderEntity> getSupplyOrderEntityList() {
        return supplyOrderEntityList;
    }

    public void setSupplyOrderEntityList(List<SupplyOrderEntity> supplyOrderEntityList) {
        this.supplyOrderEntityList = supplyOrderEntityList;
    }
}
