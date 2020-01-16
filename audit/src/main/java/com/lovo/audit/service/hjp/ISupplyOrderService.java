package com.lovo.audit.service.hjp;

import com.lovo.audit.entity.hjp.SupplyOrderEntity;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface ISupplyOrderService {
    /**
     * 保存供应商订单对象
     * @param supplyOrderEntity 供应商订单对象
     */
    public void save(SupplyOrderEntity supplyOrderEntity);

    /**
     *按id修改订单状态
     * @param soid 订单id
     * @param tag 状态
     */
    public void updateTagById(int soid,int tag);

    /**
     * 按状态查询订单集合
     * @param tag 状态
     * @param currPage 当前页数
     * @return 订单集合
     */
    public List<SupplyOrderEntity> findAllByTag(int tag, int currPage);
    /**
     * 按状态统计总条数
     * @param tag 状态
     * @return 总条数
     */
    public int countByTag(int tag);
}
