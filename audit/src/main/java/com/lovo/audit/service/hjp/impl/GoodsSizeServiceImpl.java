package com.lovo.audit.service.hjp.impl;

import com.lovo.audit.dao.hjp.IGoodsSizeDao;
import com.lovo.audit.entity.hjp.GoodsSizeEntity;
import com.lovo.audit.service.hjp.IGoodsSizeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service(value = "goodsSizeService")
@Transactional
public class GoodsSizeServiceImpl implements IGoodsSizeService {

    @Autowired
    private IGoodsSizeDao goodsSizeDao;
    @Override
    public void save(GoodsSizeEntity goodsSizeEntity) {
        goodsSizeDao.save(goodsSizeEntity);
    }
}
