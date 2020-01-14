package com.lovo.audit.entity.lh;

import com.lovo.audit.entity.lxj.SpecificationEntity;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

/**
 * 促销审核实体类
 */
@Entity
@Table(name = "sys_marketing")
public class MarketingEntity implements Serializable {
    /**
     * 商品ID
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(length = 32)
    private long productId;
    /**
     * 商品编号
     */
    @Column(length = 80)
    private String productCode;
    /**
     * 商品名
     */
    @Column(length = 80)
    private String productName;
    /**
     * 商品单价
     */
    private double productPrice;
    /**
     * 商品规格集合
     */
    @OneToMany(mappedBy = "marketing")
    private List<SpecificationEntity> productNorms_list;
    /**
     * 商品类型
     */
    @Column(length = 48)
    private String productType;
    /**
     * 促销折扣
     */
    private double discount;
    /**
     * 促销方案状态，0：未通过  1：已通过  2：已审核  3：以删除
     */
    private int status=0;

    public List<SpecificationEntity> getProductNorms_list() {
        return productNorms_list;
    }

    public void setProductNorms_list(List<SpecificationEntity> productNorms_list) {
        this.productNorms_list = productNorms_list;
    }

    public long getProductId() {
        return productId;
    }

    public void setProductId(long productId) {
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

    public double getProductPrice() {
        return productPrice;
    }

    public void setProductPrice(double productPrice) {
        this.productPrice = productPrice;
    }

    public String getProductType() {
        return productType;
    }

    public void setProductType(String productType) {
        this.productType = productType;
    }

    public double getDiscount() {
        return discount;
    }

    public void setDiscount(double discount) {
        this.discount = discount;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }
}
