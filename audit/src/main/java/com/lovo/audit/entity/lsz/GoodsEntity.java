package com.lovo.audit.entity.lsz;

import javax.persistence.*;

/**
 * 商品表
 */
@Entity
@Table(name = "sys_goods")
public class GoodsEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "g_goodsId")
    private int goodsId;
    @Column(name = "g_commodityName",length = 48)
    /**商品名称*/
    private String commodityName;
    @Column(name = "g_quantity")
    /**商品数量*/
    private int quantity;
    @ManyToOne
    @JoinColumn(name = "u_orderNum")
    private UserReturnEntity userReturn;

    public UserReturnEntity getUserReturn() {
        return userReturn;
    }

    public void setUserReturn(UserReturnEntity userReturn) {
        this.userReturn = userReturn;
    }

    public int getGoodsId() {
        return goodsId;
    }

    public void setGoodsId(int goodsId) {
        this.goodsId = goodsId;
    }

    public String getCommodityName() {
        return commodityName;
    }

    public void setCommodityName(String commodityName) {
        this.commodityName = commodityName;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}
