package com.lovo.audit.service.lh.impl;
import	java.awt.Desktop.Action;

import com.lovo.audit.dao.lh.IMarketingDao;
import com.lovo.audit.entity.lh.MarketingEntity;
import com.lovo.audit.service.lh.IMarketingService;
import com.lovo.audit.service.lh.ISpecificationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * 促销方案业务实现类
 */
@Service(value = "marketingService")
@Transactional
public class MarketingServiceImpl implements IMarketingService {
    @Autowired
    private IMarketingDao marketingDao;

    @Override
    public List<MarketingEntity> findAllBy(int currPage, int pageSize) {
        currPage -=1;
        Pageable pageable =  PageRequest.of(currPage,pageSize);
        return marketingDao.findAllBy(pageable);
    }

    @Override
    public void saveMarket(MarketingEntity marketingEntity) {
        marketingDao.save(marketingEntity);

    }

    @Override
    public MarketingEntity findById(long id) {
        return marketingDao.findById(id);
    }

    @Override
    public void getIdUpStatus(long id, int status) {
        marketingDao.getIdUpStatus(id,status);
    }

    @Override
    public int countAllBy() {
        return marketingDao.countAllBy();
    }
}
