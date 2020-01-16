package com.lovo.audit.service.hjp.impl;

import com.lovo.audit.dao.hjp.IUserGoodsDao;
import com.lovo.audit.entity.hjp.UserGoodsEntity;
import com.lovo.audit.service.hjp.IUseGoodsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


import java.util.List;
@Service(value = "userGoodsService")
@Transactional
public class UserGoodsServiceImpl implements IUseGoodsService {

    @Autowired
    private IUserGoodsDao userGoodsDao;
    @Override
    public void saveUserGoods(UserGoodsEntity userGoodsEntity) {
        userGoodsDao.save(userGoodsEntity);
    }

    @Override
    public List<UserGoodsEntity> findByUserOrderEntityId(int uoId,int currPage) {
        currPage -= 1;
        Pageable pageable = PageRequest.of(currPage,5);
        return userGoodsDao.findByUserOrderEntityId(uoId,pageable);
    }

    @Override
    public int countByUserOrderEntityId(int uoid) {
        return userGoodsDao.countByUserOrderEntityId(uoid);
    }

}
