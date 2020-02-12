package com.lovo.audit.service.sl.impl;

import com.lovo.audit.dao.sl.IReserveMoneyDao;
import com.lovo.audit.entity.sl.ReserveMoneyEntity;
import com.lovo.audit.service.sl.IReserveMoneyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * 预存款业务层接口实现类
 */
@Service(value = "reserveMoneyService")
@Transactional
public class ReserveMoneyServiceImpl implements IReserveMoneyService {

    @Autowired
    private IReserveMoneyDao reserveMoneyDao;

    @Override
    public void addReserveMoneyUser(ReserveMoneyEntity reserveMoneyEntity) {
        reserveMoneyDao.save(reserveMoneyEntity);
    }

    @Override
    public int findReserveIdByUserId(String userId) {
        return reserveMoneyDao.findReserveIdByUserId(userId);
    }

    @Override
    public String saveReserveMoneyByUserId(String userId, int money) {
        int oldMoney = reserveMoneyDao.findMoneyByUserId(userId);
        int totalMoney = money + oldMoney;
        reserveMoneyDao.updateTotalMoneyByUserId(userId,totalMoney);
        return "0";
    }

    @Override
    public String getReserveMoneyByUserId(String userId, int money) {
            String result = "0";
            int oldMoney = reserveMoneyDao.findMoneyByUserId(userId);
            if (money > oldMoney){
                result = "1";
            }else {
                int totalMoney = oldMoney - money;
                reserveMoneyDao.updateTotalMoneyByUserId(userId,totalMoney);
            }
            return result;
    }

    @Override
    public void updateLevelByUserId(String userId) {
        int totalMoney = reserveMoneyDao.findTotalMoneyByUserId(userId);
        String userGrade = "普通会员";
        double discount = 1;
        if (totalMoney <= 49999){
            userGrade = "普通会员";
            discount = 1;
        }else if (totalMoney <= 99999){
            userGrade = "白银会员";
            discount = 0.95;
        }else if (totalMoney <= 199999){
            userGrade = "黄金会员";
            discount = 0.88;
        }else if (totalMoney <= 499999){
            userGrade = "白金会员";
            discount = 0.8;
        }else if (totalMoney >= 500000){
            userGrade = "钻石会员";
            discount = 0.75;
        }
    }
}
