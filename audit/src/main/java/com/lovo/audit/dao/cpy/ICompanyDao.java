package com.lovo.audit.dao.cpy;

import com.lovo.audit.entity.cpy.CompanyEntity;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.awt.print.Pageable;
import java.util.List;

public interface ICompanyDao extends CrudRepository<CompanyEntity,Integer> {
    /**
     * 查询所有供应商
     * @return 供应商集合
     */
    @Query("from CompanyEntity")
    public List<CompanyEntity> findAllCompany(Pageable pageable);
    /**
     * 通过公司ID修改公司状态
     * @param status 公司状态
     * @param id 公司编号
     */
    @Query("update CompanyEntity set companyStatus = ?1 where id = ?2")
    @Modifying
    public void updateStatusById(String status, Integer id);
    /**
     * 通过公司ID查询公司
     * @param id 公司ID
     * @return 公司对象
     */
    @Query("from CompanyEntity where id = ?1")
    public CompanyEntity findCompanyById(Integer id);
}
