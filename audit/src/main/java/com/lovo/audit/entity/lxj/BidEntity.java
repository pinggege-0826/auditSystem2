package com.lovo.audit.entity.lxj;

import javax.persistence.*;

/**
 * 竞标单（接收）
 */
@Entity
@Table(name = "sys_bid")
public class BidEntity {
    /**
     * 竞标单id
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int bidId;

    /**
     * 竞标单号
     */
    @Column(length = 48)
    private String bidCode;


    /**
     * 单价
     */
    private float price;

    /**
     * 可供货数量
     */
    private int provideNub;

    /**
     * 下单时间
     */
    @Column(length = 48)
    private String orderDate;

    /**
     * 竞标单状态
     */
    private int orderStatus;

    /**
     * 商品对象
     */
    @ManyToOne
    @JoinColumn(name = "productFid")
    private ProductEntity product;

    /**
     * 供货商对象
     */

}
