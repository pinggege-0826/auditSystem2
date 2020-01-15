package com.lovo.audit.service.lh;

import com.lovo.audit.entity.lh.MarketingEntity;

import java.util.List;

/**
 * 促销方案业务类
 */
public interface IMarketingService {

    /**
     * 查询所有促销方案并分页展示
     * @param currPage  当前页
     * @param pageSize  每页显示条数
     * @return          分好页的促销方案集合
     */
    public List<MarketingEntity> findAllBy(int  currPage,int pageSize);

    /**
     * 添加一个新的促销方案对象
     * @param marketingEntity 促销方案对象
     */
    public void saveMarket(MarketingEntity marketingEntity);

    /**
     * 根据促销方案Id查询详情
     * @param id  促销方案ID
     * @return    促销方案对象
     */
    public MarketingEntity findById(long id);

    /**
     * 根据促销方案的ID修改方案的状态
     * @param id       方案ID
     * @param status   方案状态  0：未通过  1：已通过  2：已审核  3：以删除
     */
    public void getIdUpStatus(long id,int status);

    /**
     * 统计总页数
     * @return  总页数
     */
    public int  countAllBy();
}
