package com.lovo.audit.dao.wl;

import com.lovo.audit.entity.wl.UserEntity;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

/**
 * 用户持久层接口
 */
public interface IUserDao extends CrudRepository<UserEntity,Integer> {

    /**
     * 查询所有用户
     * @return 用户集合
     */
    @Query("from UserEntity ")
    public List<UserEntity> findAllUser(Pageable pageable);

    /**
     * 根据用户Id查询详情
     * @param id  用户ID
     * @return    用户对象
     */
    @Query("from UserEntity where id = ?1")
    public UserEntity findUserById(Integer id);

    /**
     * 根据用户Id修改用户的状态
     * @param id       用户Id
     * @param userState   用户状态  （0为正常，1为冻结）
     */
    @Query("update UserEntity set userState = ?1 where id = ?2")
    public void updateStatusById(int userState,Integer id);

    /**
     * 统计总页数
     * @return  总页数
     */
    public int countAllBy();
}
