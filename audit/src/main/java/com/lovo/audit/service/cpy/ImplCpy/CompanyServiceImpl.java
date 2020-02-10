package com.lovo.audit.service.cpy.ImplCpy;

import com.lovo.audit.dao.cpy.ICompanyDao;
import com.lovo.audit.entity.cpy.CompanyEntity;
import com.lovo.audit.service.cpy.ICompanyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service(value = "companyService")
@Transactional
public class CompanyServiceImpl implements ICompanyService {

    @Autowired
    private ICompanyDao companyDao;

    @Override
    public void addCompany(CompanyEntity company) {
        companyDao.save(company);
    }

    @Override
    public List<CompanyEntity> findAllCompany(int currPage, int pageSize) {
        currPage -=1;
        Pageable pageable =  PageRequest.of(currPage,pageSize);
        return companyDao.findAllCompany(pageable);
    }

    @Override
    public CompanyEntity findCompanyById(Integer id) {
        return companyDao.findCompanyById(id);
    }

    @Override
    public void updateStatusById(String level,Integer id) {
        companyDao.updateStatusById(level,id);
    }

    @Override
    public void deleteCompany(Integer id) {
        companyDao.deleteCompany(id);
    }

    @Override
    public int countAllBy() {

        return companyDao.countAllBy();
    }
}
