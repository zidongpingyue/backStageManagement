package com.yuan.reviewservice.entity;


import com.baomidou.mybatisplus.extension.activerecord.Model;

import java.io.Serializable;

/**
 * (Work)表实体类
 *
 * @author makejava
 * @since 2023-04-28 19:43:11
 */
@SuppressWarnings("serial")
public class Work extends Model<Work> {

    private Integer worId;

    private Integer proId;

    private Integer ansId;

    private Object worScore;

    private String worComment;


    public Integer getWorId() {
        return worId;
    }

    public void setWorId(Integer worId) {
        this.worId = worId;
    }

    public Integer getProId() {
        return proId;
    }

    public void setProId(Integer proId) {
        this.proId = proId;
    }

    public Integer getAnsId() {
        return ansId;
    }

    public void setAnsId(Integer ansId) {
        this.ansId = ansId;
    }

    public Object getWorScore() {
        return worScore;
    }

    public void setWorScore(Object worScore) {
        this.worScore = worScore;
    }

    public String getWorComment() {
        return worComment;
    }

    public void setWorComment(String worComment) {
        this.worComment = worComment;
    }

    /**
     * 获取主键值
     *
     * @return 主键值
     */
    @Override
    protected Serializable pkVal() {
        return this.worId;
    }
}

