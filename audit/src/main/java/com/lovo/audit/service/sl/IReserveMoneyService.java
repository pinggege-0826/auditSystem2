package com.lovo.audit.service.sl;

import com.lovo.audit.entity.sl.ReserveMoneyEntity;

/**
 * 预存款业务层接口
 */
public interface IReserveMoneyService {

    /**
     * 开启用户预存款
     * @param reserveMoneyEntity 预存款对象
     */
    public void addReserveMoneyUser(ReserveMoneyEntity reserveMoneyEntity);

    /**
     * 通过用户id查找预存款id
     * @param userId 用户id
     * @return 预存款id
     */
    public int findReserveIdByUserId(String userId);

    /**
     * 根据用户id存款
     * @param userId 用户id
     * @param money 预存款存款金额
     */
    public String saveReserveMoneyByUserId(String userId,int money);

    /**
     * 根据用户id取款
     * 取款前需要判断取款金额是否大于预存款余额，如果大于就不能取款，如果等于或小于就可以取款
     * @param userId 用户id
     * @param money 预存款取款金额
     * @Return 返回数字0和1,0表示取款成功，1表示取款失败
     */
    public String getReserveMoneyByUserId(String userId,int money);

    /**
     * 根据用户的充值总金额修改用户的等级
     * @param userId 用户id
     */
    public void updateLevelByUserId(String userId);
}
