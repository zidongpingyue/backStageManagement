package com.yuan.courseservice.entity;


import com.baomidou.mybatisplus.extension.activerecord.Model;

import java.io.Serializable;

/**
 * (Class)表实体类
 *
 * @author makejava
 * @since 2023-04-28 19:45:21
 */
@SuppressWarnings("serial")
public class Class extends Model<Class> {

    private Integer claId;

    private String claName;

    private String claGrade;

    private Integer claNum;

    private String claMajor;


    public Integer getClaId() {
        return claId;
    }

    public void setClaId(Integer claId) {
        this.claId = claId;
    }

    public String getClaName() {
        return claName;
    }

    public void setClaName(String claName) {
        this.claName = claName;
    }

    public String getClaGrade() {
        return claGrade;
    }

    public void setClaGrade(String claGrade) {
        this.claGrade = claGrade;
    }

    public Integer getClaNum() {
        return claNum;
    }

    public void setClaNum(Integer claNum) {
        this.claNum = claNum;
    }

    public String getClaMajor() {
        return claMajor;
    }

    public void setClaMajor(String claMajor) {
        this.claMajor = claMajor;
    }

    /**
     * 获取主键值
     *
     * @return 主键值
     */
    @Override
    protected Serializable pkVal() {
        return this.claId;
    }
}

