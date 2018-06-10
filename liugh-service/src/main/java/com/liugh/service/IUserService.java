package com.liugh.service;

import com.liugh.entity.User;
import com.baomidou.mybatisplus.service.IService;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author liugh123
 * @since 2018-05-03
 */
public interface IUserService extends IService<User> {

    /**
     * 根据用户名查询用户
     * @param username 用户名
     * @return 用户
     */
    User getUserByUserName(String username);

    /**
     * 注册用户
     * @param user
     * @param roleId
     * @return
     */
     boolean register(User user, int roleId);
}
