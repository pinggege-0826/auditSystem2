package com.lovo.audit.entity.lxj;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.lovo.audit.entity.cpy.CompanyEntity;

import javax.persistence.*;
import java.util.List;

/**
 * 竞标单（接收）
 */
@Entity
@Table(name = "sys_bid")
public class BidEntity {
    /**
     * 竞标单id
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int bidId;

    /**
     * 竞标单号
     */
    @Column(length = 48)
    private String bidCode;


    /**
     * 单价
     */
    private float price;

    /**
     * 可供货数量
     */
    private int provideNub;

    /**
     * 下单时间
     */
    @Column(length = 48,columnDefinition = "Datetime")
    private String orderDate;

    /**
     * 竞标单状态
     *      0-未处理状态
     *      1-选择竞标单
     *      2-放弃竞标单
     */
    private int orderStatus;

    /**
     * 商品对象
     */
    @OneToOne
    @JoinColumn(name = "productFid")
    private ProductEntity product;

    /**
     * 供货商集合
     */
    @OneToMany(mappedBy = "product")
    @JsonIgnore
    private List<CompanyEntity> companyEntityList;

    public int getBidId() {
        return bidId;
    }

    public void setBidId(int bidId) {
        this.bidId = bidId;
    }

    public String getBidCode() {
        return bidCode;
    }

    public void setBidCode(String bidCode) {
        this.bidCode = bidCode;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public int getProvideNub() {
        return provideNub;
    }

    public void setProvideNub(int provideNub) {
        this.provideNub = provideNub;
    }

    public String getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(String orderDate) {
        this.orderDate = orderDate;
    }

    public int getOrderStatus() {
        return orderStatus;
    }

    public void setOrderStatus(int orderStatus) {
        this.orderStatus = orderStatus;
    }

    public ProductEntity getProduct() {
        return product;
    }

    public void setProduct(ProductEntity product) {
        this.product = product;
    }

    public List<CompanyEntity> getCompanyEntityList() {
        return companyEntityList;
    }

    public void setCompanyEntityList(List<CompanyEntity> companyEntityList) {
        this.companyEntityList = companyEntityList;
    }
}
