package com.liugh.entity;

import java.io.Serializable;

import com.baomidou.mybatisplus.enums.IdType;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.activerecord.Model;
import com.baomidou.mybatisplus.annotations.TableName;

/**
 * <p>
 * 用户与角色对应表
 * </p>
 *
 * @author liugh123
 * @since 2018-05-08
 */
@TableName("sys_user_to_role")
public class UserToRole extends Model<UserToRole> {

    private static final long serialVersionUID = 1L;

    /**
     * 用户与角色对应主键
     */
    @TableId(value = "user_to_role_id", type = IdType.AUTO)
    private Integer userToRoleId;
    /**
     * 用户主键
     */
    @TableField("user_id")
    private Integer userId;
    /**
     * 角色主键
     */
    @TableField("role_id")
    private Integer roleId;


    public Integer getUserToRoleId() {
        return userToRoleId;
    }

    public void setUserToRoleId(Integer userToRoleId) {
        this.userToRoleId = userToRoleId;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Integer getRoleId() {
        return roleId;
    }

    public void setRoleId(Integer roleId) {
        this.roleId = roleId;
    }

    @Override
    protected Serializable pkVal() {
        return this.userToRoleId;
    }

    @Override
    public String toString() {
        return "UserToRole{" +
                "userToRoleId=" + userToRoleId +
                ", userId=" + userId +
                ", roleId=" + roleId +
                "}";
    }
}
