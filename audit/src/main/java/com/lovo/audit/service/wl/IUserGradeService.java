package com.lovo.audit.service.wl;

import com.lovo.audit.entity.wl.UserGradeEntity;

/**
 * 用户折扣业务层接口
 */
public interface IUserGradeService {

    /**
     *添加用户折扣
     * @param userGradeEntity 用户折扣对象
     */
    public void addUserGrade(UserGradeEntity userGradeEntity);

    /**
     * 根据用户id修改用户等级和折扣
     * @param userId 用户id
     * @param userGrade 用户等级
     * @param discount 用户折扣
     */
    public void updateUserGradeById(String userId,String userGrade,double discount);
}
