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
@TableName("sys_provinces")
public class Provinces extends Model<Provinces> {

    private static final long serialVersionUID = 1L;

    private Integer id;
    @TableField("province_id")
    private String provinceId;
    private String name;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getProvinceId() {
        return provinceId;
    }

    public void setProvinceId(String provinceId) {
        this.provinceId = provinceId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    protected Serializable pkVal() {
        return this.id;
    }

    @Override
    public String toString() {
        return "Provinces{" +
        "id=" + id +
        ", provinceId=" + provinceId +
        ", name=" + name +
        "}";
    }
}
