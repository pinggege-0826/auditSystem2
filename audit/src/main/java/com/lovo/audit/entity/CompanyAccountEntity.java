package com.lovo.audit.entity;

import javax.persistence.*;

@Entity
@Table(name = "sys_companyAccount")
public class CompanyAccountEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ca_id")
    private int id;

    @Column(name = "ca_money")
    private double money;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getMoney() {
        return money;
    }

    public void setMoney(double money) {
        this.money = money;
    }
}
