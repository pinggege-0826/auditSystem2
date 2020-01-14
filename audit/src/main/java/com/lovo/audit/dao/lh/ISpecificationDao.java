package com.lovo.audit.dao.lh;

import com.lovo.audit.entity.lxj.SpecificationEntity;
import org.springframework.data.repository.CrudRepository;

/**
 * 商品规格持久类
 */
public interface ISpecificationDao extends CrudRepository<SpecificationEntity,Integer> {


}
