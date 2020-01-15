package com.lovo.audit.entity.sl;

import javax.persistence.*;

/**
 * 预存款记录实体类
 */
@Entity
@Table(name = "record")
public class RecordEntity {
    /**预存款记录id*/
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int recordId;
    /**预存款记录时间*/
    @Column(columnDefinition = "DATETIME")
    private String date;
    /**预存款记录详细*/
    @Column
    private String particular;
    /**预存款记录年份*/
    @Column
    private String year;
    /**预存款记录月份*/
    @Column
    private String month;
    /**预存款对象*/
    @ManyToOne
    @JoinColumn(name = "reserveId")
    private ReserveMoneyEntity reserveMoneyEntity;

    public int getRecordId() {
        return recordId;
    }

    public void setRecordId(int recordId) {
        this.recordId = recordId;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getParticular() {
        return particular;
    }

    public void setParticular(String particular) {
        this.particular = particular;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public String getMonth() {
        return month;
    }

    public void setMonth(String month) {
        this.month = month;
    }

    public ReserveMoneyEntity getReserveMoneyEntity() {
        return reserveMoneyEntity;
    }

    public void setReserveMoneyEntity(ReserveMoneyEntity reserveMoneyEntity) {
        this.reserveMoneyEntity = reserveMoneyEntity;
    }
}
