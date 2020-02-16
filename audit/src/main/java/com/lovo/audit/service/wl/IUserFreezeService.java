package com.lovo.audit.service.wl;

import com.lovo.audit.entity.wl.UserFreezeEntity;

import java.util.List;

/**
 * 用户冻结业务层接口
 */
public interface IUserFreezeService {

    /**
     * 添加用户冻结信息
     * @param userFreezeEntity
     */
    public void addUserFreeze(UserFreezeEntity userFreezeEntity);

    /**
     * 根据用户id查询用户冻结信息
     * @param userId 用户id
     * @return 用户冻结信息对象
     */
    public UserFreezeEntity findById(String userId);

    /**
     * 查询所有冻结用户
     * @return 用户冻结对象集合
     */
    public List<UserFreezeEntity> findAllById();
}
