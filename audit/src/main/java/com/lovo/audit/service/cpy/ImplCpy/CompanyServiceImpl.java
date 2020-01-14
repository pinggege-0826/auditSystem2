package com.lovo.audit.service.cpy.ImplCpy;

import com.lovo.audit.dao.cpy.ICompanyDao;
import com.lovo.audit.entity.cpy.CompanyEntity;
import com.lovo.audit.service.cpy.ICompanyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service(value = "companyService")
@Transactional
public class CompanyServiceImpl implements ICompanyService {

    @Autowired
    private ICompanyDao companyDao;

    @Override
    public void addCompany(CompanyEntity company) {
        companyDao.save(company);
    }
}
