package com.liugh.service.impl;

import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.liugh.entity.Cities;
import com.liugh.entity.User;
import com.liugh.entity.UserToRole;
import com.liugh.mapper.UserMapper;
import com.liugh.service.ICitiesService;
import com.liugh.service.IRoleService;
import com.liugh.service.IUserService;
import com.liugh.service.IUserToRoleService;
import com.liugh.util.ComUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author liugh123
 * @since 2018-05-03
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements IUserService {

    @Autowired
    private IRoleService roleService;

    @Autowired
    private IUserToRoleService userToRoleService;
    @Autowired
    private ICitiesService citiesService;

    @Override
    @Cacheable(value = "UserToRole",keyGenerator="wiselyKeyGenerator")
    public User getUserByUserName(String username) {
        System.out.println("执行getUserByUserName方法了.....");
        EntityWrapper<User> ew = new EntityWrapper<>();
        ew.where("user_name={0}", username);
        return this.selectOne(ew);
    }

    @Override
    public boolean register(User user, int roleId) {
        user = updateDistrict(user);
        boolean result = this.insert(user);
        if (result) {
            UserToRole userToRole  = new UserToRole();
            userToRole.setUserId(user.getUserId());
            userToRole.setRoleId(roleId);
            result = userToRoleService.insert(userToRole);
        }
        return result;
    }

    private User updateDistrict(User user) {
        if (! ComUtil.isEmpty(user.getCityId())) {
            EntityWrapper<Cities> ew = new EntityWrapper<>();
            ew.in("city_id", user.getCityId());
            Cities cities = citiesService.selectOne(ew);
            user.setProvinceId(cities.getProvinceId());
        }
        return user;
    }
}
