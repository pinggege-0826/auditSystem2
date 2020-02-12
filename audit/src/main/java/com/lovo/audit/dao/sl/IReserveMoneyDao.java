package com.lovo.audit.dao.sl;

import com.lovo.audit.entity.sl.ReserveMoneyEntity;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

/**
 * 预存款持久层接口
 */
public interface IReserveMoneyDao extends CrudRepository<ReserveMoneyEntity,Integer> {

    @Query("select money from ReserveMoneyEntity where money = ?1")
    public int findMoneyByUserId(String userId);

    @Query("update ReserveMoneyEntity set totalMoney = ?2 where userId = ?1")
    public void updateTotalMoneyByUserId(String userId,int totalMoney);

    @Query("select totalMoney from ReserveMoneyEntity where userId = ?1")
    public int findTotalMoneyByUserId(String userId);

    @Query("select reserveId from ReserveMoneyEntity where userId = ?1")
    public int findReserveIdByUserId(String userId);
}


