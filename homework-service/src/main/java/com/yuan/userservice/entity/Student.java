package com.yuan.userservice.entity;


import com.baomidou.mybatisplus.extension.activerecord.Model;

import java.io.Serializable;

/**
 * (Student)表实体类
 *
 * @author makejava
 * @since 2023-04-28 18:04:36
 */
@SuppressWarnings("serial")
public class Student extends Model<Student> {

    private Integer stuId;

    private Integer claId;

    private String stuName;

    private String stuSex;

    private Integer stuAge;

    private String stuPhone;

    private String stuToken;

    private String stuAvatar;


    public Integer getStuId() {
        return stuId;
    }

    public void setStuId(Integer stuId) {
        this.stuId = stuId;
    }

    public Integer getClaId() {
        return claId;
    }

    public void setClaId(Integer claId) {
        this.claId = claId;
    }

    public String getStuName() {
        return stuName;
    }

    public void setStuName(String stuName) {
        this.stuName = stuName;
    }

    public String getStuSex() {
        return stuSex;
    }

    public void setStuSex(String stuSex) {
        this.stuSex = stuSex;
    }

    public Integer getStuAge() {
        return stuAge;
    }

    public void setStuAge(Integer stuAge) {
        this.stuAge = stuAge;
    }

    public String getStuPhone() {
        return stuPhone;
    }

    public void setStuPhone(String stuPhone) {
        this.stuPhone = stuPhone;
    }

    public String getStuToken() {
        return stuToken;
    }

    public void setStuToken(String stuToken) {
        this.stuToken = stuToken;
    }

    public String getStuAvatar() {
        return stuAvatar;
    }

    public void setStuAvatar(String stuAvatar) {
        this.stuAvatar = stuAvatar;
    }

    /**
     * 获取主键值
     *
     * @return 主键值
     */
    @Override
    protected Serializable pkVal() {
        return this.stuId;
    }
}

