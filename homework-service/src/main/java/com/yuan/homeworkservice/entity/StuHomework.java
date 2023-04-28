package com.yuan.homeworkservice.entity;


import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.extension.activerecord.Model;

import java.io.Serializable;

/**
 * (StuHomework)表实体类
 *
 * @author makejava
 * @since 2023-04-28 19:44:02
 */
@SuppressWarnings("serial")
public class StuHomework extends Model<StuHomework> {
    @TableId
    private Integer stuHomId;

    private Integer homId;

    private Integer stuId;

    private Object stuHomScore;

    private Integer stuHomRank;

    private String stuHomCommit;


    public Integer getStuHomId() {
        return stuHomId;
    }

    public void setStuHomId(Integer stuHomId) {
        this.stuHomId = stuHomId;
    }

    public Integer getHomId() {
        return homId;
    }

    public void setHomId(Integer homId) {
        this.homId = homId;
    }

    public Integer getStuId() {
        return stuId;
    }

    public void setStuId(Integer stuId) {
        this.stuId = stuId;
    }

    public Object getStuHomScore() {
        return stuHomScore;
    }

    public void setStuHomScore(Object stuHomScore) {
        this.stuHomScore = stuHomScore;
    }

    public Integer getStuHomRank() {
        return stuHomRank;
    }

    public void setStuHomRank(Integer stuHomRank) {
        this.stuHomRank = stuHomRank;
    }

    public String getStuHomCommit() {
        return stuHomCommit;
    }

    public void setStuHomCommit(String stuHomCommit) {
        this.stuHomCommit = stuHomCommit;
    }

    /**
     * 获取主键值
     *
     * @return 主键值
     */
    @Override
    protected Serializable pkVal() {
        return this.stuHomId;
    }
}

