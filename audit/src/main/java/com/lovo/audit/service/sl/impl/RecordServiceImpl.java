package com.lovo.audit.service.sl.impl;

import com.lovo.audit.dao.sl.IRecordDao;
import com.lovo.audit.entity.sl.RecordEntity;
import com.lovo.audit.service.sl.IRecordService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;

/**
 * 预存款记录业务层接口实现类
 */
@Service(value = "recordService")
@Transactional
public class RecordServiceImpl implements IRecordService {

    @Autowired
    private IRecordDao recordDao;

    @Override
    public void addRecord(RecordEntity recordEntity) {
        recordDao.save(recordEntity);
    }

    @Override
    public List<RecordEntity> findList(String year, String month) {
        List<RecordEntity> list = new ArrayList<>();
        if (year == null && month == null){
            list = recordDao.findList(null,null);
        }
        if (year != null && month == null){
            list = recordDao.findList(year,null);
        }
        if (year == null && month != null){
            list = recordDao.findList(null,month);
        }
        return list;
    }
}
