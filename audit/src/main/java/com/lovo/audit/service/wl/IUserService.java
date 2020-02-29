package com.lovo.audit.service.wl;

import com.lovo.audit.entity.wl.UserEntity;

import java.util.List;

/**
 * 用户业务层接口
 */
public interface IUserService {

    /**
     * 添加用户
     * @param userEntity 用户对象
     */
    public void addUser(UserEntity userEntity);
    /**
     * 查询所有供应商并分页展示
     * @param currPage  当前页
     * @param pageSize  每页显示条数
     * @return          分好页的用户集合
     */
    public List<UserEntity> findAllUser(int currPage, int pageSize);

    /**
     * 根据用户Id查询详情
     * @param id  用户ID
     * @return    用户对象
     */
    public UserEntity findUserById(Integer id);

    /**
     * 根据用户Id修改用户的状态
     * @param id       用户Id
     * @param userState   用户状态  （0为正常，1为冻结）
     */
    public void updateStatusById(int userState,Integer id);


    /**
     * 统计总页数
     * @return  总页数
     */
    public int countAllBy();
}
