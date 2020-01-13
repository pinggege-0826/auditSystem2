package com.lovo.audit.entity.cpy;

import javax.persistence.*;

@Entity
@Table(name="t_audit")
public class AuditEntity {
    @Id
    @Column(name = "a_id",length = 32,insertable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(name = "a_companyName",length = 32,unique =true )
    private String companyName;/**公司名称*/
    @Column(name = "a_status",length = 12)
    private String auditStatus;/**审核状态（1为已通过审核，2为未通过审核）*/

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

    public String getAuditStatus() {
        return auditStatus;
    }

    public void setAuditStatus(String auditStatus) {
        this.auditStatus = auditStatus;
    }
}
