package com.lovo.audit.service.hjp;

import com.lovo.audit.entity.hjp.UserGoodsEntity;


import java.util.List;

public interface IUseGoodsService {
    /**
     * 保存用户订单商品对象
     * @param userGoodsEntity 用户订单商品对象
     */
    public void saveUserGoods(UserGoodsEntity userGoodsEntity);

    /**
     * 按用户订单id查询用户商品集合
     * @param uoId 用户订单id
     * @param currPage 当前页数
     * @return 用户商品集合
     */
    public List<UserGoodsEntity> findByUserOrderEntityId(int uoId,int currPage);


    /**
     * 根据订单id统计商品总条数
     * @param uoid 订单id
     * @return 总条数
     */
    public int countByUserOrderEntityId(int uoid);
}
