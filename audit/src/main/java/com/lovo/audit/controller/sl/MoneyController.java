package com.lovo.audit.controller.sl;

import com.lovo.audit.service.sl.IRecordService;
import com.lovo.audit.service.sl.IReserveMoneyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * 预存款Controller
 */
@Controller
public class MoneyController {

    @Autowired
    private IRecordService recordService;

    @Autowired
    private IReserveMoneyService reserveMoneyService;

    @RequestMapping("saveReserveMoney")
    @ResponseBody
    public int saveReserveMoney(String userId,String money){
        int money1 = Integer.parseInt(money);
        return reserveMoneyService.saveReserveMoneyByUserId(userId,money1);
    }


}
