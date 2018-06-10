package com.liugh.entity;

import java.io.Serializable;

import com.baomidou.mybatisplus.enums.IdType;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.activerecord.Model;
import com.baomidou.mybatisplus.annotations.TableName;

/**
 * <p>
 * 角色与菜单对应表
 * </p>
 *
 * @author liugh123
 * @since 2018-05-08
 */
@TableName("sys_role_to_menu")
public class RoleToMenu extends Model<RoleToMenu> {

    private static final long serialVersionUID = 1L;

    /**
     * 角色与菜单对应主键
     */
    @TableId(value = "role_to_menu_id", type = IdType.AUTO)
    private Integer roleToMenuId;
    /**
     * 角色主键
     */
    @TableField("role_id")
    private Integer roleId;
    /**
     * 菜单主键
     */
    @TableField("menu_id")
    private Integer menuId;
    /**
     * 状态(0:禁用;1:启用）
     */
    private Integer status;


    public Integer getRoleToMenuId() {
        return roleToMenuId;
    }

    public void setRoleToMenuId(Integer roleToMenuId) {
        this.roleToMenuId = roleToMenuId;
    }

    public Integer getRoleId() {
        return roleId;
    }

    public void setRoleId(Integer roleId) {
        this.roleId = roleId;
    }

    public Integer getMenuId() {
        return menuId;
    }

    public void setMenuId(Integer menuId) {
        this.menuId = menuId;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    @Override
    protected Serializable pkVal() {
        return this.roleToMenuId;
    }

    @Override
    public String toString() {
        return "RoleToMenu{" +
                "roleToMenuId=" + roleToMenuId +
                ", roleId=" + roleId +
                ", menuId=" + menuId +
                ", status=" + status +
                "}";
    }
}
