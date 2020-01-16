package com.lovo.audit.service.hjp;

import com.lovo.audit.dao.hjp.IUserOrderDao;
import com.lovo.audit.entity.hjp.UserOrderEntity;
import org.springframework.beans.factory.annotation.Autowired;

import java.awt.print.Pageable;
import java.util.List;

public interface IUserOrderService {
    /**
     * 保存用户订单对象
     * @param userOrderEntity 用户订单对象
     */
    public void saveUserOrder(UserOrderEntity userOrderEntity);

    /**
     * 按用户订单状态查询用户订单集合
     * @param currPage 当前页数
     * @param tag 状态
     * @return 用户订单集合
     */
    public List<UserOrderEntity> findAllByTag(int currPage,int tag);

    /**
     * 按id修改订单状态
     * @param id 订单id
     */
    public void updateTagById(int id);

    /**
     * 按状态统计总条数
     * @param tag 状态
     * @return 总条数
     */
    public int countByTag(int tag);
}
