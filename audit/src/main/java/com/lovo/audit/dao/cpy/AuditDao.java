package com.lovo.audit.dao.cpy;

import com.lovo.audit.entity.cpy.AuditEntity;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface AuditDao extends CrudRepository<AuditEntity,Integer> {
    @Query("from AuditEntity ")
    public List<AuditEntity> getListAudit();
}
