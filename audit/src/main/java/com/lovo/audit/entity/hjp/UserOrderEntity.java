package com.lovo.audit.entity.hjp;

import javax.persistence.*;

@Entity
@Table(name = "sys_userOrder")
public class UserOrderEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "u_orderId")
    private int id;

}
