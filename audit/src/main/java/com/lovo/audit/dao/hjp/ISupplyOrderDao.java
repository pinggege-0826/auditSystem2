package com.lovo.audit.dao.hjp;

import com.lovo.audit.entity.hjp.SupplyOrderEntity;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface ISupplyOrderDao extends CrudRepository<SupplyOrderEntity,Integer> {
    /**
     * 按订单状态查询供应商订单信息
     * @param tag 状态
     * @param pageable 分页对象
     * @return 供应商订单集合
     */
    public List<SupplyOrderEntity> findAllByTag(int tag, Pageable pageable);

    /**
     * 根据订单id更爱订单状态
     * @param soid 订单id
     * @param tag 状态
     */
    @Query("update SupplyOrderEntity set tag=?2 where id=?1")
    @Modifying
    public void updateTagById(int soid,int tag);

    /**
     * 按状态统计总条数
     * @param tag 状态
     * @return 总条数
     */
    public int countByTag(int tag);
}
