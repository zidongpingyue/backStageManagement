package com.yuan.userservice.entity;


import com.baomidou.mybatisplus.extension.activerecord.Model;

import java.io.Serializable;

/**
 * (Teacher)表实体类
 *
 * @author makejava
 * @since 2023-04-28 18:02:35
 */
@SuppressWarnings("serial")
public class Teacher extends Model<Teacher> {

    private Integer teaId;

    private String teaName;

    private String teaSex;

    private Integer teaAge;

    private String teaEducation;

    private String teaPhone;

    private String teaToken;

    private String teaAvatar;


    public Integer getTeaId() {
        return teaId;
    }

    public void setTeaId(Integer teaId) {
        this.teaId = teaId;
    }

    public String getTeaName() {
        return teaName;
    }

    public void setTeaName(String teaName) {
        this.teaName = teaName;
    }

    public String getTeaSex() {
        return teaSex;
    }

    public void setTeaSex(String teaSex) {
        this.teaSex = teaSex;
    }

    public Integer getTeaAge() {
        return teaAge;
    }

    public void setTeaAge(Integer teaAge) {
        this.teaAge = teaAge;
    }

    public String getTeaEducation() {
        return teaEducation;
    }

    public void setTeaEducation(String teaEducation) {
        this.teaEducation = teaEducation;
    }

    public String getTeaPhone() {
        return teaPhone;
    }

    public void setTeaPhone(String teaPhone) {
        this.teaPhone = teaPhone;
    }

    public String getTeaToken() {
        return teaToken;
    }

    public void setTeaToken(String teaToken) {
        this.teaToken = teaToken;
    }

    public String getTeaAvatar() {
        return teaAvatar;
    }

    public void setTeaAvatar(String teaAvatar) {
        this.teaAvatar = teaAvatar;
    }

    /**
     * 获取主键值
     *
     * @return 主键值
     */
    @Override
    protected Serializable pkVal() {
        return this.teaId;
    }
}

