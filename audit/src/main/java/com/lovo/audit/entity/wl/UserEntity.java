package com.lovo.audit.entity.wl;

import javax.persistence.*;

/**
 * 用户实体类
 */
@Entity
@Table(name ="t_userAudit")
public class UserEntity {
    @Id
    @Column(name = "pk_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(name = "user_id",length = 32)
    private String userId;/**用户id*/
    @Column(name = "user_name",length = 48)
    private String userName;/**用户名*/
    @Column(name = "user_real_name",length = 48)
    private  String realName;/**真实姓名*/
    @Column(name = "user_pwd",length = 48)
    private  String password;/**密码*/
    @Column(name = "user_sex",length = 8)
    private  String  sex;/**性别*/
    @Column(name = "user_phone",length = 32)
    private  String phone;/**电话*/
    @Column(name = "user_real_id",length = 48)
    private  String realId;/**身份证号*/
    @Column(name = "user_userImg",columnDefinition = "TEXT")
    private  String userImg;/**身份证图片*/
    @Column(name = "user_business_License_Img",columnDefinition = "TEXT")
    private  String businessLicenseImg;/**营业执照*/
    @Column(name = "user_company_name",length = 80)
    private  String  companyName;/**公司名称*/
    @Column(name = "user_state")
    private int userState;/**用户状态*/
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

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getRealName() {
        return realName;
    }

    public void setRealName(String realName) {
        this.realName = realName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getRealId() {
        return realId;
    }

    public void setRealId(String realId) {
        this.realId = realId;
    }

    public String getUserImg() {
        return userImg;
    }

    public void setUserImg(String userImg) {
        this.userImg = userImg;
    }

    public String getBusinessLicenseImg() {
        return businessLicenseImg;
    }

    public void setBusinessLicenseImg(String businessLicenseImg) {
        this.businessLicenseImg = businessLicenseImg;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public int getUserState() {
        return userState;
    }

    public void setUserState(int userState) {
        this.userState = userState;
    }
}
