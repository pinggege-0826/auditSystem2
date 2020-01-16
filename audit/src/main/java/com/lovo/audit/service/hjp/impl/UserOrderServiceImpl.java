package com.lovo.audit.service.hjp.impl;

import com.lovo.audit.dao.hjp.IUserOrderDao;
import com.lovo.audit.entity.hjp.UserOrderEntity;
import com.lovo.audit.service.hjp.IUserOrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
@Service(value = "userOrderService")
@Transactional
public class UserOrderServiceImpl implements IUserOrderService {

    @Autowired
    private IUserOrderDao userOrderDao;
    @Override
    public void saveUserOrder(UserOrderEntity userOrderEntity) {
        userOrderDao.save(userOrderEntity);
    }

    @Override
    public List<UserOrderEntity> findAllByTag(int currPage,int tag) {
        currPage -= 1;
        Pageable pageable =  PageRequest.of(currPage,5);
        return userOrderDao.findAllByTag(pageable,tag);
    }

    @Override
    public void updateTagById(int id) {
        userOrderDao.updateTagById(id);
    }

    @Override
    public int countByTag(int tag) {
        return 0;
    }


}
