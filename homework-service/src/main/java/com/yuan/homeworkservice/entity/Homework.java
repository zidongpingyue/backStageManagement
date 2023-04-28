package com.yuan.homeworkservice.entity;


import com.baomidou.mybatisplus.extension.activerecord.Model;

import java.io.Serializable;

/**
 * (Homework)表实体类
 *
 * @author makejava
 * @since 2023-04-28 19:44:02
 */
@SuppressWarnings("serial")
public class Homework extends Model<Homework> {

    private Integer homId;

    private Integer couId;

    private String homName;

    private Date homStart;

    private Date homEnd;

    private String homDes;

    private Integer homCommit;

    private Integer homSave;

    private Integer homTotal;


    public Integer getHomId() {
        return homId;
    }

    public void setHomId(Integer homId) {
        this.homId = homId;
    }

    public Integer getCouId() {
        return couId;
    }

    public void setCouId(Integer couId) {
        this.couId = couId;
    }

    public String getHomName() {
        return homName;
    }

    public void setHomName(String homName) {
        this.homName = homName;
    }

    public Date getHomStart() {
        return homStart;
    }

    public void setHomStart(Date homStart) {
        this.homStart = homStart;
    }

    public Date getHomEnd() {
        return homEnd;
    }

    public void setHomEnd(Date homEnd) {
        this.homEnd = homEnd;
    }

    public String getHomDes() {
        return homDes;
    }

    public void setHomDes(String homDes) {
        this.homDes = homDes;
    }

    public Integer getHomCommit() {
        return homCommit;
    }

    public void setHomCommit(Integer homCommit) {
        this.homCommit = homCommit;
    }

    public Integer getHomSave() {
        return homSave;
    }

    public void setHomSave(Integer homSave) {
        this.homSave = homSave;
    }

    public Integer getHomTotal() {
        return homTotal;
    }

    public void setHomTotal(Integer homTotal) {
        this.homTotal = homTotal;
    }

    /**
     * 获取主键值
     *
     * @return 主键值
     */
    @Override
    protected Serializable pkVal() {
        return this.homId;
    }
}

