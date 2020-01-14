package com.lovo.audit.service.lh.impl;

import com.lovo.audit.dao.lh.ISpecificationDao;
import com.lovo.audit.entity.lh.SpecificationEntity;
import com.lovo.audit.service.lh.ISpecificationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * 商品规格业务实现类
 */
@Service(value = "specificationService")
@Transactional
public class SpecificationServiceImpl implements ISpecificationService {

    @Autowired
    private ISpecificationDao specificationDao;
    @Override
    public void saveSpecifition(SpecificationEntity specificationEntity) {
        specificationDao.save(specificationEntity);
    }
}
