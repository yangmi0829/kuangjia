package com.liugh.entity;

import java.io.Serializable;

import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.activerecord.Model;
import com.baomidou.mybatisplus.annotations.TableName;

/**
 * <p>
 * 
 * </p>
 *
 * @author liugh123
 * @since 2018-05-11
 */
@TableName("sys_cities")
public class Cities extends Model<Cities> {

    private static final long serialVersionUID = 1L;

    private Integer id;
    @TableField("city_id")
    private String cityId;
    private String name;
    @TableField("province_id")
    private String provinceId;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCityId() {
        return cityId;
    }

    public void setCityId(String cityId) {
        this.cityId = cityId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getProvinceId() {
        return provinceId;
    }

    public void setProvinceId(String provinceId) {
        this.provinceId = provinceId;
    }

    @Override
    protected Serializable pkVal() {
        return this.id;
    }

    @Override
    public String toString() {
        return "Cities{" +
        "id=" + id +
        ", cityId=" + cityId +
        ", name=" + name +
        ", provinceId=" + provinceId +
        "}";
    }
}
