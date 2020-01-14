package com.lovo.audit.entity.hjp;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "sys_typeForSupplyGoods")
public class TypeForGoodsEntity {
    /**商品类型Id*/
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ts_typeId")
    private int id;

    /**类型*/
    @Column(name = "ts_type")
    private String type;

    /**供货商品集合*/
    @OneToMany(mappedBy = "typeForGoodsEntity")
    private List<SupplyGoodsEntity>supplyGoodsEntityList;
    
    /**用户商品集合*/
    @OneToMany(mappedBy = "typeForGoodsEntity")
    private List<UserGoodsEntity>userGoodsEntityList;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public List<SupplyGoodsEntity> getSupplyGoodsEntityList() {
        return supplyGoodsEntityList;
    }

    public void setSupplyGoodsEntityList(List<SupplyGoodsEntity> supplyGoodsEntityList) {
        this.supplyGoodsEntityList = supplyGoodsEntityList;
    }

    public List<UserGoodsEntity> getUserGoodsEntityList() {
        return userGoodsEntityList;
    }

    public void setUserGoodsEntityList(List<UserGoodsEntity> userGoodsEntityList) {
        this.userGoodsEntityList = userGoodsEntityList;
    }
}
