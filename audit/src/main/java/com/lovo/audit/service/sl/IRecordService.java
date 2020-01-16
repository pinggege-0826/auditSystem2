package com.lovo.audit.service.sl;

import com.lovo.audit.entity.sl.RecordEntity;

import java.util.List;

/**
 * 预存款记录实体类
 */
public interface IRecordService {

    /**
     * 保存预存款记录
     * @param recordEntity 预存款记录实体类
     */
    public void addRecord(RecordEntity recordEntity);

    /**
     * 动态查询预存款记录
     * @param year 年份
     * @param month 月份
     * @return 预存款记录集合
     */
    public List<RecordEntity> findList(String year,String month);
}
