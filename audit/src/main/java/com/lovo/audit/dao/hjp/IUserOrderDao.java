package com.lovo.audit.dao.hjp;

import com.lovo.audit.entity.hjp.UserOrderEntity;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;


import java.util.List;

public interface IUserOrderDao extends CrudRepository<UserOrderEntity,Integer> {
    /**
     * 查询所有用户订单
     * @return 用户订单集合
     */
    public List<UserOrderEntity> findAllByTag(Pageable pageable,int tag);

    /**
     * 按id修改订单状态
     * @param id
     */
    @Query("update UserOrderEntity set tag=1 where id=?1")
    @Modifying
    public void updateTagById(int id);

    /**
     * 按状态统计总条数
     * @param tag 状态
     * @return 总条数
     */
    public int countByTag(int tag);
}
