package com.yuan.homeworkservice.entity;


import com.baomidou.mybatisplus.extension.activerecord.Model;

import java.io.Serializable;

/**
 * (Picture)表实体类
 *
 * @author makejava
 * @since 2023-04-28 19:44:03
 */
@SuppressWarnings("serial")
public class Picture extends Model<Picture> {

    private Integer picId;

    private Integer stuHomId;

    private Date picTime;

    private String picUrl;

    private String picType;


    public Integer getPicId() {
        return picId;
    }

    public void setPicId(Integer picId) {
        this.picId = picId;
    }

    public Integer getStuHomId() {
        return stuHomId;
    }

    public void setStuHomId(Integer stuHomId) {
        this.stuHomId = stuHomId;
    }

    public Date getPicTime() {
        return picTime;
    }

    public void setPicTime(Date picTime) {
        this.picTime = picTime;
    }

    public String getPicUrl() {
        return picUrl;
    }

    public void setPicUrl(String picUrl) {
        this.picUrl = picUrl;
    }

    public String getPicType() {
        return picType;
    }

    public void setPicType(String picType) {
        this.picType = picType;
    }

    /**
     * 获取主键值
     *
     * @return 主键值
     */
    @Override
    protected Serializable pkVal() {
        return this.picId;
    }
}

