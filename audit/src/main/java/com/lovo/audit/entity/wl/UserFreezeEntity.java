package com.lovo.audit.entity.wl;

import javax.persistence.*;

/**
 * 用户冻结实体类
 */
@Entity
@Table(name ="t_userFreeze")
public class UserFreezeEntity {
    @Id
    @Column(name = "pk_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(name = "user_id",length = 80)
    private String userId;/**用户Id*/
    @Column(name = "f_causerFreeze",length = 80)
    private String causerFreeze;/**冻结原因*/
    @Column(name = "f_thawReason",length = 80)
    private  String thawReason;/**解冻原因*/
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

    public String getCauserFreeze() {
        return causerFreeze;
    }

    public void setCauserFreeze(String causerFreeze) {
        this.causerFreeze = causerFreeze;
    }

    public String getThawReason() {
        return thawReason;
    }

    public void setThawReason(String thawReason) {
        this.thawReason = thawReason;
    }
}
