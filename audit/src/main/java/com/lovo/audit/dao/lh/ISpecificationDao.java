package com.lovo.audit.dao.lh;

import com.lovo.audit.entity.lh.SpecificationEntity;
import org.springframework.data.repository.CrudRepository;

/**
 * 促销商品规格持久类
 */
public interface ISpecificationDao extends CrudRepository<SpecificationEntity,Long> {


}
