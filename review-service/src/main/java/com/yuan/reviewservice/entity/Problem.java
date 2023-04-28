package com.yuan.reviewservice.entity;


import com.baomidou.mybatisplus.extension.activerecord.Model;

import java.io.Serializable;

/**
 * (Problem)表实体类
 *
 * @author makejava
 * @since 2023-04-28 19:43:10
 */
@SuppressWarnings("serial")
public class Problem extends Model<Problem> {

    private Integer proId;

    private Integer homId;

    private Integer proNum;

    private String proTxt;

    private String proAns;


    public Integer getProId() {
        return proId;
    }

    public void setProId(Integer proId) {
        this.proId = proId;
    }

    public Integer getHomId() {
        return homId;
    }

    public void setHomId(Integer homId) {
        this.homId = homId;
    }

    public Integer getProNum() {
        return proNum;
    }

    public void setProNum(Integer proNum) {
        this.proNum = proNum;
    }

    public String getProTxt() {
        return proTxt;
    }

    public void setProTxt(String proTxt) {
        this.proTxt = proTxt;
    }

    public String getProAns() {
        return proAns;
    }

    public void setProAns(String proAns) {
        this.proAns = proAns;
    }

    /**
     * 获取主键值
     *
     * @return 主键值
     */
    @Override
    protected Serializable pkVal() {
        return this.proId;
    }
}

