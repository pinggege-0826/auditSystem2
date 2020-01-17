package com.lovo.audit.service.cpy;


import com.lovo.audit.entity.cpy.CompanyEntity;
import com.lovo.audit.entity.lh.MarketingEntity;

import java.util.List;

public interface ICompanyService {
    /**
     * 添加公司
     * @param company 供应商对象
     */
    public void addCompany(CompanyEntity company);
    /**
     * 查询所有供应商并分页展示
     * @param currPage  当前页
     * @param pageSize  每页显示条数
     * @return          分好页的供应商集合
     */
    public List<CompanyEntity> findAllCompany(int currPage,int pageSize);

    /**
     * 根据公司Id查询详情
     * @param id  公司ID
     * @return    供应商对象
     */
    public CompanyEntity findCompanyById(Integer id);

    /**
     * 根据公司Id修改供应商的状态
     * @param id       公司Id
     * @param level   供应商状态  （0为未审核，1为正常，2为冻结）
     */
    public void updateStatusById(String level,Integer id);

    /**
     * 删除供应商
     * @param id 公司id
     */
    public void deleteCompany(Integer id);
    /**
     * 统计总页数
     * @return  总页数
     */
    public int countAllBy();
}
