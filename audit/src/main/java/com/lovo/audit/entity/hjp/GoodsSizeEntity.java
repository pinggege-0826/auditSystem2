package com.lovo.audit.entity.hjp;

import javax.persistence.*;
import java.util.List;

/**
 * 商品规格实体类
 */
@Entity
@Table(name = "sys_goodsSize")
public class GoodsSizeEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "gs_goodsSizeId")
    private int id;

    /**商品规格*/
    @Column(name = "gs_size",length = 255)
    private String  size;

    /**供货商品与规格中间表集合*/
    @OneToMany(mappedBy = "goodsSizeEntity")
    private List<SizeToSupplyGoods>toSupplyGoodsList;

    /**用户订单商品与规格中间表集合*/
    @OneToMany(mappedBy = "goodsSizeEntity")
    private List<SizeToUserGoods> toUserGoodsList;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public List<SizeToSupplyGoods> getToSupplyGoodsList() {
        return toSupplyGoodsList;
    }

    public void setToSupplyGoodsList(List<SizeToSupplyGoods> toSupplyGoodsList) {
        this.toSupplyGoodsList = toSupplyGoodsList;
    }

    public List<SizeToUserGoods> getToUserGoodsList() {
        return toUserGoodsList;
    }

    public void setToUserGoodsList(List<SizeToUserGoods> toUserGoodsList) {
        this.toUserGoodsList = toUserGoodsList;
    }
}
