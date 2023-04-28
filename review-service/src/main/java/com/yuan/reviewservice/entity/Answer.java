package com.yuan.reviewservice.entity;


import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.extension.activerecord.Model;

import java.io.Serializable;

/**
 * (Answer)表实体类
 *
 * @author makejava
 * @since 2023-04-28 19:43:11
 */
@SuppressWarnings("serial")
public class Answer extends Model<Answer> {
    @TableId
    private Integer ansId;

    private Integer stuHomId;

    private Integer ansNum;

    private String ansTxt;


    public Integer getAnsId() {
        return ansId;
    }

    public void setAnsId(Integer ansId) {
        this.ansId = ansId;
    }

    public Integer getStuHomId() {
        return stuHomId;
    }

    public void setStuHomId(Integer stuHomId) {
        this.stuHomId = stuHomId;
    }

    public Integer getAnsNum() {
        return ansNum;
    }

    public void setAnsNum(Integer ansNum) {
        this.ansNum = ansNum;
    }

    public String getAnsTxt() {
        return ansTxt;
    }

    public void setAnsTxt(String ansTxt) {
        this.ansTxt = ansTxt;
    }

    /**
     * 获取主键值
     *
     * @return 主键值
     */
    @Override
    protected Serializable pkVal() {
        return this.ansId;
    }
}

