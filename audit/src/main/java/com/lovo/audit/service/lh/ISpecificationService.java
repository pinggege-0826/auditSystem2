package com.lovo.audit.service.lh;

import com.lovo.audit.entity.lxj.SpecificationEntity;

/**
 * 商品规格业务类
 */
public interface ISpecificationService {
    /**
     * 添加一个新的商品规格
     * @param specificationEntity 商品规格对象
     */
    public void saveSpecification(SpecificationEntity specificationEntity);
}
