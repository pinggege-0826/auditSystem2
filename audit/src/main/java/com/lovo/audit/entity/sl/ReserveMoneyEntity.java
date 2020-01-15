package com.lovo.audit.entity.sl;

import javax.persistence.*;
import java.util.List;

/**
 * 预存款实体类
 */
@Entity
@Table(name = "reserveMoney")
public class ReserveMoneyEntity {
    /**预存款id*/
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int reserveId;
    /**预存款金额*/
    @Column
    private int money;
    /**总充值金额*/
    @Column
    private int totalMoney;
    /**用户对象*/
    @Column
    private String userId;
    /**预存款记录对象集合*/
    @OneToMany(mappedBy = "reserveMoneyEntity")
    private List<RecordEntity> recordEntityList;

    public int getReserveId() {
        return reserveId;
    }

    public void setReserveId(int reserveId) {
        this.reserveId = reserveId;
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }

    public int getTotalMoney() {
        return totalMoney;
    }

    public void setTotalMoney(int totalMoney) {
        this.totalMoney = totalMoney;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public List<RecordEntity> getRecordEntityList() {
        return recordEntityList;
    }

    public void setRecordEntityList(List<RecordEntity> recordEntityList) {
        this.recordEntityList = recordEntityList;
    }
}
