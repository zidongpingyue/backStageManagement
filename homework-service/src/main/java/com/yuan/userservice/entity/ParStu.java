package com.yuan.userservice.entity;


import com.baomidou.mybatisplus.extension.activerecord.Model;

import java.io.Serializable;

/**
 * (ParStu)表实体类
 *
 * @author makejava
 * @since 2023-04-28 18:05:43
 */
@SuppressWarnings("serial")
public class ParStu extends Model<ParStu> {

    private Integer parStuId;

    private Integer stuId;

    private Integer parId;

    private String parStuName;


    public Integer getParStuId() {
        return parStuId;
    }

    public void setParStuId(Integer parStuId) {
        this.parStuId = parStuId;
    }

    public Integer getStuId() {
        return stuId;
    }

    public void setStuId(Integer stuId) {
        this.stuId = stuId;
    }

    public Integer getParId() {
        return parId;
    }

    public void setParId(Integer parId) {
        this.parId = parId;
    }

    public String getParStuName() {
        return parStuName;
    }

    public void setParStuName(String parStuName) {
        this.parStuName = parStuName;
    }

    /**
     * 获取主键值
     *
     * @return 主键值
     */
    @Override
    protected Serializable pkVal() {
        return this.parStuId;
    }
}

