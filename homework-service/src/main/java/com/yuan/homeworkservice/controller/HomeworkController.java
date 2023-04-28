package com.yuan.homeworkservice.controller;


import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.api.ApiController;
import com.baomidou.mybatisplus.extension.api.R;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.yuan.homeworkservice.entity.Homework;
import com.yuan.homeworkservice.service.HomeworkService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.io.Serializable;
import java.util.List;

/**
 * (Homework)表控制层
 *
 * @author makejava
 * @since 2023-04-28 19:44:02
 */
@RestController
@RequestMapping("homework")
public class HomeworkController extends ApiController {
    /**
     * 服务对象
     */
    @Resource
    private HomeworkService homeworkService;

    /**
     * 分页查询所有数据
     *
     * @param page     分页对象
     * @param homework 查询实体
     * @return 所有数据
     */
    @GetMapping
    public R selectAll(Page<Homework> page, Homework homework) {
        return success(this.homeworkService.page(page, new QueryWrapper<>(homework)));
    }

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("{id}")
    public R selectOne(@PathVariable Serializable id) {
        return success(this.homeworkService.getById(id));
    }

    /**
     * 新增数据
     *
     * @param homework 实体对象
     * @return 新增结果
     */
    @PostMapping
    public R insert(@RequestBody Homework homework) {
        return success(this.homeworkService.save(homework));
    }

    /**
     * 修改数据
     *
     * @param homework 实体对象
     * @return 修改结果
     */
    @PutMapping
    public R update(@RequestBody Homework homework) {
        return success(this.homeworkService.updateById(homework));
    }

    /**
     * 删除数据
     *
     * @param idList 主键结合
     * @return 删除结果
     */
    @DeleteMapping
    public R delete(@RequestParam("idList") List<Long> idList) {
        return success(this.homeworkService.removeByIds(idList));
    }
}

