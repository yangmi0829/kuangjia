package com.liugh.entity;

import java.io.Serializable;

import com.baomidou.mybatisplus.enums.IdType;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.activerecord.Model;
import com.baomidou.mybatisplus.annotations.TableName;

/**
 * <p>
 * 用户表
 * </p>
 *
 * @author liugh123
 * @since 2018-05-08
 */
@TableName("sys_user")
public class User extends Model<User> {

    private static final long serialVersionUID = 1L;

    public User(String userName, String realName, String passWord, String telephone,
                String unit, Integer sex, Long birthday, String email,String cityId) {
        this.userName = userName;
        this.sex = sex;
        this.birthday = birthday;
        this.email = email;
        this.passWord = passWord;
        this.telephone = telephone;
        this.unit = unit;
        this.realName = realName;
        this.cityId = cityId;
    }

    public User(){}
    /**
     * 用户主键
     */
    @TableId(value = "user_id", type = IdType.AUTO)
    private Integer userId;
    /**
     * 用户名称
     */
    @TableField("user_name")
    private String userName;
    /**
     * 性别（1：男 2：女）
     */
    private Integer sex;
    /**
     * 生日
     */
    private Long birthday;
    /**
     * 电子邮件
     */
    private String email;
    /**
     * 用户密码
     */
    @TableField("pass_word")
    private String passWord;
    /**
     * 电话号
     */
    private String telephone;
    /**
     * 单位
     */
    private String unit;
    /**
     * 创建时间
     */
    @TableField("create_time")
    private Long createTime;
    /**
     * 省主键
     */
    @TableField("province_id")
    private String provinceId;
    /**
     * 市主键
     */
    @TableField("city_id")
    private String cityId;
    /**
     * 县主键
     */
    @TableField("area_id")
    private String areaId;
    /**
     * 真实姓名
     */
    @TableField("real_name")
    private String realName;
    /**
     * 头像
     */
    @TableField("head_image")
    private String headImage;
    /**
     * 状态(1:启用  2:冻结  3:删除）
     */
    private Integer status;


    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public Integer getSex() {
        return sex;
    }

    public void setSex(Integer sex) {
        this.sex = sex;
    }

    public Long getBirthday() {
        return birthday;
    }

    public void setBirthday(Long birthday) {
        this.birthday = birthday;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassWord() {
        return passWord;
    }

    public void setPassWord(String passWord) {
        this.passWord = passWord;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }

    public Long getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Long createTime) {
        this.createTime = createTime;
    }

    public String getProvinceId() {
        return provinceId;
    }

    public void setProvinceId(String provinceId) {
        this.provinceId = provinceId;
    }

    public String getCityId() {
        return cityId;
    }

    public void setCityId(String cityId) {
        this.cityId = cityId;
    }

    public String getAreaId() {
        return areaId;
    }

    public void setAreaId(String areaId) {
        this.areaId = areaId;
    }

    public String getRealName() {
        return realName;
    }

    public void setRealName(String realName) {
        this.realName = realName;
    }

    public String getHeadImage() {
        return headImage;
    }

    public void setHeadImage(String headImage) {
        this.headImage = headImage;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    @Override
    protected Serializable pkVal() {
        return this.userId;
    }

    @Override
    public String toString() {
        return "User{" +
                "userId=" + userId +
                ", userName=" + userName +
                ", sex=" + sex +
                ", birthday=" + birthday +
                ", email=" + email +
                ", passWord=" + passWord +
                ", telephone=" + telephone +
                ", unit=" + unit +
                ", createTime=" + createTime +
                ", provinceId=" + provinceId +
                ", cityId=" + cityId +
                ", areaId=" + areaId +
                ", realName=" + realName +
                ", headImage=" + headImage +
                ", status=" + status +
                "}";
    }
}
