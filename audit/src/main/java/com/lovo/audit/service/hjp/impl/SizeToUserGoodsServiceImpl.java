package com.lovo.audit.service.hjp.impl;

import com.lovo.audit.dao.hjp.ISizeToUserGoodsDao;
import com.lovo.audit.entity.hjp.SizeToUserGoods;
import com.lovo.audit.service.hjp.ISizeToUserGoodsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service(value = "sizeToUserGoodsService")
@Transactional
public class SizeToUserGoodsServiceImpl implements ISizeToUserGoodsService {

    @Autowired
    private ISizeToUserGoodsDao sizeToUserGoodsDao;
    @Override
    public void save(SizeToUserGoods sizeToUserGoods) {
        sizeToUserGoodsDao.save(sizeToUserGoods);
    }
}
