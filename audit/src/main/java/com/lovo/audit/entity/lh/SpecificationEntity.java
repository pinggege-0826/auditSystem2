package com.lovo.audit.entity.lh;

import javax.persistence.*;

/**
 * 促销商品规格实体类
 */
@Entity
@Table(name = "sys_specification")
public class SpecificationEntity {
    /**
     * 规格id
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(length = 32)
    private long specificationId;
    /**
     * 商品对象
     */
    @ManyToOne
    @JoinColumn(name = "s_marketId")
    private MarketingEntity productCode;
    /**
     * 规格名字
     */
    @Column(length = 32)
    private String specificationName;
    /**
     * 规格对应的名字的值
     */
    @Column(length = 64)
    private String specificationValue;

    public long getSpecificationId() {
        return specificationId;
    }

    public void setSpecificationId(long specificationId) {
        this.specificationId = specificationId;
    }

    public MarketingEntity getProductCode() {
        return productCode;
    }

    public void setProductCode(MarketingEntity productCode) {
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
}
