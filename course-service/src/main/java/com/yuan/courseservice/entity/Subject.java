package com.yuan.courseservice.entity;


import com.baomidou.mybatisplus.extension.activerecord.Model;

import java.io.Serializable;

/**
 * (Subject)表实体类
 *
 * @author makejava
 * @since 2023-04-28 19:45:22
 */
@SuppressWarnings("serial")
public class Subject extends Model<Subject> {

    private Integer subId;

    private String subName;


    public Integer getSubId() {
        return subId;
    }

    public void setSubId(Integer subId) {
        this.subId = subId;
    }

    public String getSubName() {
        return subName;
    }

    public void setSubName(String subName) {
        this.subName = subName;
    }

    /**
     * 获取主键值
     *
     * @return 主键值
     */
    @Override
    protected Serializable pkVal() {
        return this.subId;
    }
}

