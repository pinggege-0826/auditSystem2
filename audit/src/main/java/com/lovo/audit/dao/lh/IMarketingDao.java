package com.lovo.audit.dao.lh;

import com.lovo.audit.entity.lh.MarketingEntity;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

/**
 * 促销方案持久类
 */
public interface IMarketingDao extends CrudRepository<MarketingEntity,Long> {

    /**
     * 查询所有促销方案并分好页
     * @return  方案集合
     */
    @Query("from MarketingEntity where status is not 3")
    public List<MarketingEntity> findAllBy(Pageable pageable);

    /**
     * 根据促销方案Id查询详情
     * @param id  促销方案ID
     * @return    促销方案对象
     */
    public MarketingEntity findById(long id);

    /**
     * 根据促销ID修改方案状态
     * @param id   促销ID
     * @param status 方案状态  默认为0：未通过
     */
    @Query("update MarketingEntity set status=?2 where productId=?1")
    @Modifying
    public void getIdUpStatus(long id,int status);


    /**
     * 统计总页数
     * @return  总页数
     */
    @Query("select count(*) from MarketingEntity where status is not 3")
    public int countAllBy();
}
