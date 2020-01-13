package com.lovo.audit.entity.cpy;

import javax.persistence.*;

@Entity
@Table(name="sys_company")
public class CompanyEntity {
    @Id
    @Column(name = "id",length = 32,insertable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(length = 32,unique =true )
    private String companyName;/**公司名称*/
    @Column(length = 24)
    private String managerName;/**法人姓名*/
    @Column(length = 11)
    private String companyPhone;/**公司电话*/
    @Column(length = 32)
    private String companyAddress;/**公司地址*/
    @Column(columnDefinition = "TEXT")
    private String charter;/**营业执照*/
    @Column(length = 48)
    private String scope;/**经营范围*/
    @Column(length = 24)
    private String companyCode;/**工商编号*/
    @Column(length = 12)
    private String companyStatus;/**公司状态*/








}
