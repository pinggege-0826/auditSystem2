package com.lovo.audit.service.hjp.impl;

import com.lovo.audit.dao.hjp.ITypeForGoodsDao;
import com.lovo.audit.entity.hjp.TypeForGoodsEntity;
import com.lovo.audit.service.hjp.ITypeForGoodsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service(value = "typeForGoodsService")
@Transactional
public class TypeForGoodsServiceImpl implements ITypeForGoodsService {

    @Autowired
    private ITypeForGoodsDao typeForGoodsDao;

    @Override
    public void save(TypeForGoodsEntity typeForGoodsEntity) {
        typeForGoodsDao.save(typeForGoodsEntity);

    }
}
