package com.yuan.userservice.entity;


import com.baomidou.mybatisplus.extension.activerecord.Model;

import java.io.Serializable;

/**
 * (Parent)表实体类
 *
 * @author makejava
 * @since 2023-04-28 18:04:43
 */
@SuppressWarnings("serial")
public class Parent extends Model<Parent> {

    private Integer parId;

    private String parName;

    private String parSex;

    private Integer parAge;

    private String parPhone;

    private String parToken;

    private String parAvatar;


    public Integer getParId() {
        return parId;
    }

    public void setParId(Integer parId) {
        this.parId = parId;
    }

    public String getParName() {
        return parName;
    }

    public void setParName(String parName) {
        this.parName = parName;
    }

    public String getParSex() {
        return parSex;
    }

    public void setParSex(String parSex) {
        this.parSex = parSex;
    }

    public Integer getParAge() {
        return parAge;
    }

    public void setParAge(Integer parAge) {
        this.parAge = parAge;
    }

    public String getParPhone() {
        return parPhone;
    }

    public void setParPhone(String parPhone) {
        this.parPhone = parPhone;
    }

    public String getParToken() {
        return parToken;
    }

    public void setParToken(String parToken) {
        this.parToken = parToken;
    }

    public String getParAvatar() {
        return parAvatar;
    }

    public void setParAvatar(String parAvatar) {
        this.parAvatar = parAvatar;
    }

    /**
     * 获取主键值
     *
     * @return 主键值
     */
    @Override
    protected Serializable pkVal() {
        return this.parId;
    }
}

