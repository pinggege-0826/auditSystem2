package com.lovo.audit.entity.hjp;

import javax.persistence.*;

/**
 * 规格用户商品中间实体类
 */
@Entity
@Table(name = "sys_size_userGoods")
public class SizeToUserGoods {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "su_id")
    private int id;

    /**规格对象*/
    @ManyToOne
    @JoinColumn(name = "su_sizeId")
    private GoodsSizeEntity goodsSizeEntity;

    /**用户订单商品对象*/
    @ManyToOne
    @JoinColumn(name = "su_userGoodsId")
    private UserGoodsEntity userGoodsEntity;

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

    public UserGoodsEntity getUserGoodsEntity() {
        return userGoodsEntity;
    }

    public void setUserGoodsEntity(UserGoodsEntity userGoodsEntity) {
        this.userGoodsEntity = userGoodsEntity;
    }
}
