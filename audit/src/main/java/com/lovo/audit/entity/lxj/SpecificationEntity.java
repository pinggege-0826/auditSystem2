package com.lovo.audit.entity.lxj;

import javax.persistence.*;
import java.io.Serializable;

/**
 * 规格表
 */
@Entity
@Table(name = "sys_specification")
public class SpecificationEntity implements Serializable {
    /**
     * 规格id
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int specificationId;

    /**
     * 规格编号
     */
    @Column(length = 80)
    private String productCode;

    /**
     * 规格名字
     */
    @Column(length = 32)
    private String specificationName;

    /**
     * 对应规格名字的值
     */
    @Column(length = 64)
    private String specificationValue;

    /**
     * 采购商品对象
     */
    @ManyToOne
    @JoinColumn(name = "productFid")
    private ProductEntity product;

    public SpecificationEntity() {
    }

    public int getSpecificationId() {
        return specificationId;
    }

    public void setSpecificationId(int specificationId) {
        this.specificationId = specificationId;
    }

    public String getProductCode() {
        return productCode;
    }

    public void setProductCode(String productCode) {
        this.productCode = productCode;
    }

    public String getSpecificationName() {
        return specificationName;
    }

    public void setSpecificationName(String specificationName) {
        this.specificationName = specificationName;
    }

    public String getSpecificationValue() {
        return specificationValue;
    }

    public void setSpecificationValue(String specificationValue) {
        this.specificationValue = specificationValue;
    }

    public ProductEntity getProduct() {
        return product;
    }

    public void setProduct(ProductEntity product) {
        this.product = product;
    }
}
