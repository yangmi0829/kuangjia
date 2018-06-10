package com.liugh.controller;


import com.liugh.annotation.CurrentUser;
import com.liugh.annotation.Pass;
import com.liugh.base.PublicResult;
import com.liugh.base.PublicResultConstant;
import com.liugh.entity.User;
import com.liugh.service.IUserService;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author liugh
 * @since 2018-05-03
 */
@RestController
@RequestMapping("/api")
public class UserController {

    @Autowired
    IUserService userService;

    @GetMapping("/currentUser")
    @RequiresPermissions(value = {"user:list"})
    public PublicResult<User> findCurrentUser( @CurrentUser User currentUser) throws Exception{
        return new PublicResult<>(PublicResultConstant.SUCCESS, currentUser);
    }


    @RequestMapping("/user/{id}")
    @Pass
    public PublicResult<Object> findUser(@PathVariable String id) throws Exception{
        return new PublicResult<>(PublicResultConstant.SUCCESS, id);
    }
}

