package com.lovo.audit.entity.hjp;

import javax.persistence.*;

@Entity
@Table(name = "sys_size_supplyGoods")
public class SizeToSupplyGoods {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ss_id")
    private int id;

    /**规格对象*/
    @ManyToOne
    @JoinColumn(name = "ss_sizeId")
    private GoodsSizeEntity goodsSizeEntity;

    /**供货商品对象*/
    @ManyToOne
    @JoinColumn(name = "ss_supplyGoodsId")
    private SupplyGoodsEntity supplyGoodsEntity;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public GoodsSizeEntity getGoodsSizeEntity() {
        return goodsSizeEntity;
    }

    public void setGoodsSizeEntity(GoodsSizeEntity goodsSizeEntity) {
        this.goodsSizeEntity = goodsSizeEntity;
    }

    public SupplyGoodsEntity getSupplyGoodsEntity() {
        return supplyGoodsEntity;
    }

    public void setSupplyGoodsEntity(SupplyGoodsEntity supplyGoodsEntity) {
        this.supplyGoodsEntity = supplyGoodsEntity;
    }
}
