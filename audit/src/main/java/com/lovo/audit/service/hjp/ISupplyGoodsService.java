package com.lovo.audit.service.hjp;

import com.lovo.audit.entity.hjp.SupplyGoodsEntity;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface ISupplyGoodsService {
    /**
     * 保存商品对象
     * @param supplyGoodsEntity  商品对象
     */
    public void save(SupplyGoodsEntity supplyGoodsEntity);

    /**
     * 根据订单id查询商品集合
     * @param soid 订单id
     * @param currPage 当前页数
     * @return 商品集合
     */
    public List<SupplyGoodsEntity> findBySupplyOrderEntityId(int soid,int currPage);

    /**
     * 根据订单id统计商品总条数
     * @param soid 订单id
     * @return 总条数
     */
    public int countBySupplyOrderEntityId(int soid);
}
