package com.lovo.audit.service.wl.impl;

import com.lovo.audit.dao.wl.IUserGradeDao;
import com.lovo.audit.entity.wl.UserFreezeEntity;
import com.lovo.audit.entity.wl.UserGradeEntity;
import com.lovo.audit.service.wl.IUserFreezeService;
import com.lovo.audit.service.wl.IUserGradeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * 用户冻结业务层接口实体类
 */
@Service(value = "userGradeService")
@Transactional
public class UserGradeServiceImpl implements IUserGradeService {

    @Autowired
    private IUserGradeDao userGradeDao;

    @Override
    public void addUserGrade(UserGradeEntity userGradeEntity) {
        userGradeDao.save(userGradeEntity);
    }

    @Override
    public void updateUserGradeById(String userId, String userGrade, double discount) {
        userGradeDao.updateUserGradeById(userId,userGrade,discount);
    }
}
