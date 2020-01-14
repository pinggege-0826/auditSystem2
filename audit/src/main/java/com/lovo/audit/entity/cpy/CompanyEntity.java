package com.lovo.audit.entity.cpy;
/**
 * 供应商实体类
 * */
import javax.persistence.*;

@Entity
@Table(name="t_company")
public class CompanyEntity {
    @Id
    @Column(name = "c_id",length = 32,insertable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;/**公司ID*/
    @Column(name = "c_companyName",length = 32,unique =true )
    private String companyName;/**公司名称*/
    @Column(name = "c_mangerName",length = 24)
    private String managerName;/**法人姓名*/
    @Column(name = "c_phone",length = 11)
    private String companyPhone;/**公司电话*/
    @Column(name = "c_address",length = 32)
    private String companyAddress;/**公司地址*/
    @Column(name = "c_charter",columnDefinition = "TEXT")
    private String charter;/**营业执照*/
    @Column(name = "c_scope",length = 48)
    private String scope;/**经营范围*/
    @Column(name = "c_aaumNub",length = 24)
    private String companyCode;/**工商编号*/
    @Column(name = "c_level",length = 24)
    private String companyLevel;/**公司等级*/
    @Column(name = "c_status",length = 12)
    private String companyStatus;/**公司状态（0为未审核，1为正常，2为冻结）*/

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String getManagerName() {
        return managerName;
    }

    public void setManagerName(String managerName) {
        this.managerName = managerName;
    }

    public String getCompanyPhone() {
        return companyPhone;
    }

    public void setCompanyPhone(String companyPhone) {
        this.companyPhone = companyPhone;
    }

    public String getCompanyAddress() {
        return companyAddress;
    }

    public void setCompanyAddress(String companyAddress) {
        this.companyAddress = companyAddress;
    }

    public String getCharter() {
        return charter;
    }

    public void setCharter(String charter) {
        this.charter = charter;
    }

    public String getScope() {
        return scope;
    }

    public void setScope(String scope) {
        this.scope = scope;
    }

    public String getCompanyCode() {
        return companyCode;
    }

    public void setCompanyCode(String companyCode) {
        this.companyCode = companyCode;
    }

    public String getCompanyLevel() {
        return companyLevel;
    }

    public void setCompanyLevel(String companyLevel) {
        this.companyLevel = companyLevel;
    }

    public String getCompanyStatus() {
        return companyStatus;
    }

    public void setCompanyStatus(String companyStatus) {
        this.companyStatus = companyStatus;
    }
}
