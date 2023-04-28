package com.yuan.courseservice.entity;


import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.extension.activerecord.Model;

import java.io.Serializable;

/**
 * (StuMes)表实体类
 *
 * @author makejava
 * @since 2023-04-28 19:45:24
 */
@SuppressWarnings("serial")
public class StuMes extends Model<StuMes> {
    @TableId
    private Integer stuMesId;

    private Integer stuId;

    private Integer mesId;


    public Integer getStuMesId() {
        return stuMesId;
    }

    public void setStuMesId(Integer stuMesId) {
        this.stuMesId = stuMesId;
    }

    public Integer getStuId() {
        return stuId;
    }

    public void setStuId(Integer stuId) {
        this.stuId = stuId;
    }

    public Integer getMesId() {
        return mesId;
    }

    public void setMesId(Integer mesId) {
        this.mesId = mesId;
    }

    /**
     * 获取主键值
     *
     * @return 主键值
     */
    @Override
    protected Serializable pkVal() {
        return this.stuMesId;
    }
}

