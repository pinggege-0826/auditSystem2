package com.lovo.audit.controller.cpy;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.lovo.audit.entity.cpy.CompanyEntity;
import com.lovo.audit.entity.lh.MarketingEntity;
import com.lovo.audit.entity.lh.PageEntity;
import com.lovo.audit.service.cpy.ICompanyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import java.util.ArrayList;
import java.util.List;

@Controller
public class CompanyController {

    @Autowired
    private ICompanyService companyService;
    public void addCompany(){

    }
    @RequestMapping("getListCompany")
    @ResponseBody
    public String getListCompany(String currPage,String pageSize) throws Exception{
        int a = Integer.parseInt(currPage);
        int b = Integer.parseInt(pageSize);
        List<CompanyEntity> list=new ArrayList<>();
        list = companyService.findAllCompany(a,b);
        //得到总条数,是总跳数,不是总页数
        int totalPage = companyService.countAllBy();
        //分页实体bean泛型，底下要用改为自己的
        PageEntity<CompanyEntity> page = new PageEntity<CompanyEntity>();
        page.setList(list);
        page.setTotalPage(totalPage);
        ObjectMapper om = new ObjectMapper();
        return om.writeValueAsString(page);

    }
    @RequestMapping("deleteCompany")
    public String deleteCompany(Integer id){
        companyService.deleteCompany(id);
        return "";
    }
//    @RequestMapping("updateCompany")
//    @ResponseBody
//    @Transactional
//    public String updateCompany(CompanyEntity company){
//        String level = company.getCompanyLevel();
//        Integer id = company.getId();
//
//        companyService.updateStatusById(level,id);
//        return "修改成功";
//    }
    @RequestMapping("findCompany/{id}")
    @ResponseBody
    public String userInfo(@PathVariable("id")String id) throws JsonProcessingException {
        CompanyEntity company= companyService.findCompanyById(Integer.parseInt(id));
        ObjectMapper mapper=new ObjectMapper();
        String result=mapper.writeValueAsString(company);
        return result;
    }
}
