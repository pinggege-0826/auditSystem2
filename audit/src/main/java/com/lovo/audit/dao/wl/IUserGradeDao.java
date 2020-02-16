package com.lovo.audit.dao.wl;

import com.lovo.audit.entity.wl.UserGradeEntity;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

/**
 * 用户折扣持久层接口
 */
public interface IUserGradeDao extends CrudRepository<UserGradeEntity,Integer> {
    /**
     * 根据用户id修改用户等级和折扣
     * @param userId 用户id
     * @param userGrade 用户等级
     * @param discount 用户折扣
     */
    @Query("update UserGradeEntity set userGrade = ?2, discount = ?3 where id = ?1")
    public void updateUserGradeById(String userId,String userGrade,double discount);
}
