package com.lovo.audit.entity.lxj;

import com.lovo.audit.entity.cpy.CompanyEntity;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

/**
 *商品对象
 */
@Entity
@Table(name = "sys_product")
public class ProductEntity implements Serializable {
    /**
     * 商品id
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int productId;

    /**
     * 商品编号
     */
    @Column(length = 48)
    private String productCode;

    /**
     * 商品名称
     */
    @Column(length = 48)
    private String productName;

    /**
     * 商品类型
     */
    @Column(length = 48)
    private String productType;

    /**
     * 采购数量
     */
    private int productNum;

    /**
     * 商品规格集合
     */
    @OneToMany(mappedBy = "product")
    private List<SpecificationEntity> specificationEntityList;

    /**
     * 采购单对象
     */
    @ManyToOne
    @JoinColumn(name = "buyOrderFid")
    private BuyOrderEntity buyOrder;

    /**
     * 竞标单对象
     */
    @OneToOne
    @JoinColumn(name = "bidFid")
    private BidEntity bid;



    public ProductEntity() {
    }

    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    public String getProductCode() {
        return productCode;
    }

    public void setProductCode(String productCode) {
        this.productCode = productCode;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getProductType() {
        return productType;
    }

    public void setProductType(String productType) {
        this.productType = productType;
    }

    public int getProductNum() {
        return productNum;
    }

    public void setProductNum(int productNum) {
        this.productNum = productNum;
    }

    public List<SpecificationEntity> getSpecificationEntityList() {
        return specificationEntityList;
    }

    public void setSpecificationEntityList(List<SpecificationEntity> specificationEntityList) {
        this.specificationEntityList = specificationEntityList;
    }

    public BuyOrderEntity getBuyOrder() {
        return buyOrder;
    }

    public void setBuyOrder(BuyOrderEntity buyOrder) {
        this.buyOrder = buyOrder;
    }

    public BidEntity getBid() {
        return bid;
    }

    public void setBid(BidEntity bid) {
        this.bid = bid;
    }
}
