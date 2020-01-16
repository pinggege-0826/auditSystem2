package com.lovo.audit.dao.hjp;

import com.lovo.audit.entity.hjp.SupplyGoodsEntity;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface ISupplyGoodsDao extends CrudRepository<SupplyGoodsEntity,Integer> {
    /**
     * 根据订单id查询商品信息集合
     * @param soid 供应商订单id
     * @param pageable 分页对象
     * @return 商品信息集合
     */
    public List<SupplyGoodsEntity> findBySupplyOrderEntityId(int soid, Pageable pageable);

    /**
     * 根据订单id统计商品总条数
     * @param soid 订单id
     * @return 总条数
     */
    public int countBySupplyOrderEntityId(int soid);
}
