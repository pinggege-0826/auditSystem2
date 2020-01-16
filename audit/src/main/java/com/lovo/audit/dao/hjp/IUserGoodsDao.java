package com.lovo.audit.dao.hjp;

import com.lovo.audit.entity.hjp.UserGoodsEntity;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;


import java.util.List;

public interface IUserGoodsDao extends CrudRepository<UserGoodsEntity,Integer> {
    /**
     * 根据订单id查询商品集合
     * @param uoId 订单id
     * @param pageable 当前页数即每页记录条数
     * @return 商品集合
     */
    @Query("from UserGoodsEntity where userOrderEntity.id=?1 ")
    public List<UserGoodsEntity> findByUserOrderEntityId(int uoId, Pageable pageable);

    /**
     * 根据订单id统计商品总条数
     * @param uoid 订单id
     * @return 总条数
     */
    public int countByUserOrderEntityId(int uoid);
}
