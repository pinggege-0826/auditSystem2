package com.lovo.audit.dao.wl;

import com.lovo.audit.entity.wl.UserFreezeEntity;
import com.lovo.audit.service.wl.impl.UserFreezeServiceImpl;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

/**
 * 用户冻结持久层接口
 */
public interface IUserFreezeDao extends CrudRepository<UserFreezeEntity,Integer> {

    /**
     * 根据用户id查询用户冻结信息
     * @param userId 用户id
     * @return 用户冻结信息对象
     */
    @Query("from UserFreezeEntity where id = ?1")
    public UserFreezeEntity findById(String userId);

    /**
     * 查询所有冻结用户
     * @return 用户冻结对象集合
     */
    @Query("from UserFreezeEntity")
    public List<UserFreezeEntity> findAllById();
}
