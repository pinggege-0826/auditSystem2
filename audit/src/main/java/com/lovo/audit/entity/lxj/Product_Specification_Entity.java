package com.lovo.audit.entity.lxj;

import javax.persistence.*;
import java.io.Serializable;

/**
 * 采购商品_规格_中间表
 */
@Entity
@Table(name = "sys_product_specification")
public class Product_Specification_Entity implements Serializable {
    /**
     * 采购商品_规格_中间表id
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int psId;

    /**
     * 采购商品对象
     */
    @ManyToOne
    @JoinColumn(name = "productFid")
    private ProductEntity product;

    /**
     * 规格对象
     */
    @ManyToOne
    @JoinColumn(name = "specificationFid")
    private SpecificationEntity specification;

    public Product_Specification_Entity() {
    }

    public int getPsId() {
        return psId;
    }

    public void setPsId(int psId) {
        this.psId = psId;
    }

    public ProductEntity getProduct() {
        return product;
    }

    public void setProduct(ProductEntity product) {
        this.product = product;
    }

    public SpecificationEntity getSpecification() {
        return specification;
    }

    public void setSpecification(SpecificationEntity specification) {
        this.specification = specification;
    }
}
