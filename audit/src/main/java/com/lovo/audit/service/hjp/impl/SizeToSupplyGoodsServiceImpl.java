package com.lovo.audit.service.hjp.impl;

import com.lovo.audit.dao.hjp.ISizeToSupplyGoodsDao;
import com.lovo.audit.entity.hjp.SizeToSupplyGoods;
import com.lovo.audit.service.hjp.ISizeToSupplyGoodsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service(value = "sizeToSupplyGoodsService")
@Transactional
public class SizeToSupplyGoodsServiceImpl implements ISizeToSupplyGoodsService {

    @Autowired
    private ISizeToSupplyGoodsDao sizeToSupplyGoodsDao;
    @Override
    public void save(SizeToSupplyGoods sizeToSupplyGoods) {
        sizeToSupplyGoodsDao.save(sizeToSupplyGoods);
    }
}
