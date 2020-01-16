package com.lovo.audit.entity.lxj;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.lovo.audit.entity.lh.MarketingEntity;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

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
     * 采购商品_规格——中间表集合
     */
    @OneToMany(mappedBy = "specification")
    private List<Product_Specification_Entity> product_specification_entityList;

    /**
     * 促销审核对象
     */
    @ManyToOne
    @JoinColumn(name = "marketingFid")
    @JsonIgnoreProperties(value = {"productNorms_list"})
    private MarketingEntity marketing;

    public MarketingEntity getMarketing() {
        return marketing;
    }

    public void setMarketing(MarketingEntity marketing) {
        this.marketing = marketing;
    }

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

    public List<Product_Specification_Entity> getProduct_specification_entityList() {
        return product_specification_entityList;
    }

    public void setProduct_specification_entityList(List<Product_Specification_Entity> product_specification_entityList) {
        this.product_specification_entityList = product_specification_entityList;
    }
}
