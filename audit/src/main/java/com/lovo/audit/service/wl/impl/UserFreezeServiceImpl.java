package com.lovo.audit.service.wl.impl;

import com.lovo.audit.dao.wl.IUserFreezeDao;
import com.lovo.audit.entity.wl.UserFreezeEntity;
import com.lovo.audit.service.wl.IUserFreezeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * 用户冻结业务层接口实体类
 */
@Service(value = "userFreezeService")
@Transactional
public class UserFreezeServiceImpl implements IUserFreezeService {

    @Autowired
    private IUserFreezeDao userFreezeDao;

    @Override
    public void addUserFreeze(UserFreezeEntity userFreezeEntity) {
        userFreezeDao.save(userFreezeEntity);
    }

    @Override
    public UserFreezeEntity findById(String userId) {
        return userFreezeDao.findById(userId);
    }

    @Override
    public List<UserFreezeEntity> findAllById() {
        return userFreezeDao.findAllById();
    }
}
