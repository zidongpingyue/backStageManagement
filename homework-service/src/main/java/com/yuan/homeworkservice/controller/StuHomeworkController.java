package com.yuan.homeworkservice.controller;


import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.api.ApiController;
import com.baomidou.mybatisplus.extension.api.R;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.yuan.homeworkservice.entity.StuHomework;
import com.yuan.homeworkservice.service.StuHomeworkService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.io.Serializable;
import java.util.List;

/**
 * (StuHomework)表控制层
 *
 * @author makejava
 * @since 2023-04-28 19:44:02
 */
@RestController
@RequestMapping("stuHomework")
public class StuHomeworkController extends ApiController {
    /**
     * 服务对象
     */
    @Resource
    private StuHomeworkService stuHomeworkService;

    /**
     * 分页查询所有数据
     *
     * @param page        分页对象
     * @param stuHomework 查询实体
     * @return 所有数据
     */
    @GetMapping
    public R selectAll(Page<StuHomework> page, StuHomework stuHomework) {
        return success(this.stuHomeworkService.page(page, new QueryWrapper<>(stuHomework)));
    }

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("{id}")
    public R selectOne(@PathVariable Serializable id) {
        return success(this.stuHomeworkService.getById(id));
    }

    /**
     * 新增数据
     *
     * @param stuHomework 实体对象
     * @return 新增结果
     */
    @PostMapping
    public R insert(@RequestBody StuHomework stuHomework) {
        return success(this.stuHomeworkService.save(stuHomework));
    }

    /**
     * 修改数据
     *
     * @param stuHomework 实体对象
     * @return 修改结果
     */
    @PutMapping
    public R update(@RequestBody StuHomework stuHomework) {
        return success(this.stuHomeworkService.updateById(stuHomework));
    }

    /**
     * 删除数据
     *
     * @param idList 主键结合
     * @return 删除结果
     */
    @DeleteMapping
    public R delete(@RequestParam("idList") List<Long> idList) {
        return success(this.stuHomeworkService.removeByIds(idList));
    }
}

