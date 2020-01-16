package com.lovo.audit.dao.sl;

import com.lovo.audit.entity.sl.RecordEntity;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

/**
 * 预存款记录持久层接口
 */
public interface IRecordDao extends CrudRepository<RecordEntity,Integer> {

    @Query("from RecordEntity where year = ?1 and month = ?2")
    public List<RecordEntity> findList(String year,String month);
}
