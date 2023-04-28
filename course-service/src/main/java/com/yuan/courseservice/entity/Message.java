package com.yuan.courseservice.entity;


import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.extension.activerecord.Model;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
import java.util.Date;

/**
 * (Message)表实体类
 *
 * @author makejava
 * @since 2023-04-28 19:45:23
 */
@SuppressWarnings("serial")
public class Message extends Model<Message> {
    @TableId
    private Integer mesId;

    private Integer couId;

    //出参的格式化
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss",timezone="GMT+8")
    //入参的格式化
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date mesTime;

    private String mesContent;

    private Integer mesAuther;


    public Integer getMesId() {
        return mesId;
    }

    public void setMesId(Integer mesId) {
        this.mesId = mesId;
    }

    public Integer getCouId() {
        return couId;
    }

    public void setCouId(Integer couId) {
        this.couId = couId;
    }

    public Date getMesTime() {
        return mesTime;
    }

    public void setMesTime(Date mesTime) {
        this.mesTime = mesTime;
    }

    public String getMesContent() {
        return mesContent;
    }

    public void setMesContent(String mesContent) {
        this.mesContent = mesContent;
    }

    public Integer getMesAuther() {
        return mesAuther;
    }

    public void setMesAuther(Integer mesAuther) {
        this.mesAuther = mesAuther;
    }

    /**
     * 获取主键值
     *
     * @return 主键值
     */
    @Override
    protected Serializable pkVal() {
        return this.mesId;
    }
}

