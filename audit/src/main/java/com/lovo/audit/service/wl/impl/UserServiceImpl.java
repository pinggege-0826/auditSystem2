package com.lovo.audit.service.wl.impl;

import com.lovo.audit.dao.wl.IUserDao;
import com.lovo.audit.entity.wl.UserEntity;
import com.lovo.audit.service.wl.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * 用户业务层接口实体类
 */
@Service(value = "userService")
@Transactional
public class UserServiceImpl implements IUserService {

    @Autowired
    private IUserDao userDao;

    @Override
    public void addUser(UserEntity userEntity) {
        userDao.save(userEntity);
    }

    @Override
    public List<UserEntity> findAllUser(int currPage, int pageSize) {
        currPage -=1;
        Pageable pageable =  PageRequest.of(currPage,pageSize);
        return userDao.findAllUser(pageable);
    }

    @Override
    public UserEntity findUserById(Integer id) {
        return userDao.findUserById(id);
    }

    @Override
    public void updateStatusById(int userState, Integer id) {
        userDao.updateStatusById(userState,id);
    }



    @Override
    public int countAllBy() {
        return userDao.countAllBy();
    }
}
