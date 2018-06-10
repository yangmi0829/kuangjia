package com.liugh.service.impl;

import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.liugh.entity.UserToRole;
import com.liugh.mapper.UserToRoleMapper;
import com.liugh.service.IUserToRoleService;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.liugh.util.ComUtil;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author liugh123
 * @since 2018-05-03
 */
@Service
public class UserToRoleServiceImpl extends ServiceImpl<UserToRoleMapper, UserToRole> implements IUserToRoleService {

    @Override
    @Cacheable(value = "UserToRole",keyGenerator="wiselyKeyGenerator")
    public UserToRole selectByUserId(Integer userId) {
        EntityWrapper<UserToRole> ew = new EntityWrapper<>();
        ew.where("user_id={0}", userId);
        List<UserToRole> userToRoleList = this.selectList(ew);
        return ComUtil.isEmpty(userToRoleList)? null: userToRoleList.get(0);
    }
}
