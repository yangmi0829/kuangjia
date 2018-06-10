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
@TableName("sys_areas")
public class Areas extends Model<Areas> {

    private static final long serialVersionUID = 1L;

    private Integer id;
    @TableField("area_id")
    private String areaId;
    private String name;
    @TableField("city_id")
    private String cityId;
    @TableField("lng_lat")
    private String lngLat;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getAreaId() {
        return areaId;
    }

    public void setAreaId(String areaId) {
        this.areaId = areaId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCityId() {
        return cityId;
    }

    public void setCityId(String cityId) {
        this.cityId = cityId;
    }

    public String getLngLat() {
        return lngLat;
    }

    public void setLngLat(String lngLat) {
        this.lngLat = lngLat;
    }

    @Override
    protected Serializable pkVal() {
        return this.id;
    }

    @Override
    public String toString() {
        return "Areas{" +
        "id=" + id +
        ", areaId=" + areaId +
        ", name=" + name +
        ", cityId=" + cityId +
        ", lngLat=" + lngLat +
        "}";
    }
}
