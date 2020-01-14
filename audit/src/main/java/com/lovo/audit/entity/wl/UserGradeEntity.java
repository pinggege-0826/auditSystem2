package com.lovo.audit.entity.wl;

import javax.persistence.*;

/**
 * 折扣实体类
 */
@Entity
@Table(name ="t_userGrade")
public class UserGradeEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(name = "user_id",length = 80)
    private  String userId;/**用户id*/
    @Column(name = "g_userGrade",length = 80)
    private  String userGrade;/**用户等级*/
    @Column(name = "g_discount",length = 80)
    private  double discount;/**等级折扣*/
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getUserGrade() {
        return userGrade;
    }

    public void setUserGrade(String userGrade) {
        this.userGrade = userGrade;
    }

    public double getDiscount() {
        return discount;
    }

    public void setDiscount(double discount) {
        this.discount = discount;
    }
}
