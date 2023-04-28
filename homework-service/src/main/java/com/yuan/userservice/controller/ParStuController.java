package com.yuan.userservice.controller;


import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.api.ApiController;
import com.baomidou.mybatisplus.extension.api.R;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.yuan.userservice.entity.ParStu;
import com.yuan.userservice.service.ParStuService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.io.Serializable;
import java.util.List;

/**
 * (ParStu)表控制层
 *
 * @author makejava
 * @since 2023-04-28 18:05:31
 */
@RestController
@RequestMapping("parStu")
public class ParStuController extends ApiController {
    /**
     * 服务对象
     */
    @Resource
    private ParStuService parStuService;

    /**
     * 分页查询所有数据
     *
     * @param page   分页对象
     * @param parStu 查询实体
     * @return 所有数据
     */
    @GetMapping
    public R selectAll(Page<ParStu> page, ParStu parStu) {
        return success(this.parStuService.page(page, new QueryWrapper<>(parStu)));
    }

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("{id}")
    public R selectOne(@PathVariable Serializable id) {
        return success(this.parStuService.getById(id));
    }

    /**
     * 新增数据
     *
     * @param parStu 实体对象
     * @return 新增结果
     */
    @PostMapping
    public R insert(@RequestBody ParStu parStu) {
        return success(this.parStuService.save(parStu));
    }

    /**
     * 修改数据
     *
     * @param parStu 实体对象
     * @return 修改结果
     */
    @PutMapping
    public R update(@RequestBody ParStu parStu) {
        return success(this.parStuService.updateById(parStu));
    }

    /**
     * 删除数据
     *
     * @param idList 主键结合
     * @return 删除结果
     */
    @DeleteMapping
    public R delete(@RequestParam("idList") List<Long> idList) {
        return success(this.parStuService.removeByIds(idList));
    }
}

