package com.lovo.audit.service.hjp.impl;

import com.lovo.audit.dao.hjp.ISupplyGoodsDao;
import com.lovo.audit.entity.hjp.SupplyGoodsEntity;
import com.lovo.audit.service.hjp.ISupplyGoodsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service(value = "supplyGoodsService")
@Transactional
public class SupplyGoodsServiceImpl implements ISupplyGoodsService {
    @Autowired
    private ISupplyGoodsDao supplyGoodsDao;
    @Override
    public void save(SupplyGoodsEntity supplyGoodsEntity) {
        supplyGoodsDao.save(supplyGoodsEntity);
    }

    @Override
    public List<SupplyGoodsEntity> findBySupplyOrderEntityId(int soid, int currPage) {
        currPage -= 1;
        Pageable pageable =  PageRequest.of(currPage,5);
        return supplyGoodsDao.findBySupplyOrderEntityId(soid,pageable);
    }

    @Override
    public int countBySupplyOrderEntityId(int soid) {
        return supplyGoodsDao.countBySupplyOrderEntityId(soid);
    }


}
