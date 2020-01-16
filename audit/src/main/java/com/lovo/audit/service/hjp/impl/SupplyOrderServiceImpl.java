package com.lovo.audit.service.hjp.impl;

import com.lovo.audit.dao.hjp.ISupplyOrderDao;
import com.lovo.audit.entity.hjp.SupplyOrderEntity;
import com.lovo.audit.service.hjp.ISupplyOrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service(value = "supplyOrderService")
@Transactional
public class SupplyOrderServiceImpl implements ISupplyOrderService {
    @Autowired
    private ISupplyOrderDao supplyOrderDao;
    @Override
    public void save(SupplyOrderEntity supplyOrderEntity) {

        supplyOrderDao.save(supplyOrderEntity);
    }

    @Override
    public void updateTagById(int soid, int tag) {
        supplyOrderDao.updateTagById(soid, tag);
    }

    @Override
    public List<SupplyOrderEntity> findAllByTag(int tag, int currPage) {
        currPage -= 1;
        Pageable pageable =  PageRequest.of(currPage,5);
        return supplyOrderDao.findAllByTag(tag,pageable);
    }

    @Override
    public int countByTag(int tag) {
        return supplyOrderDao.countByTag(tag);
    }

}
