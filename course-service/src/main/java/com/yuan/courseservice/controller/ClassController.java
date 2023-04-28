package com.yuan.courseservice.controller;


import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.api.ApiController;
import com.baomidou.mybatisplus.extension.api.R;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.yuan.courseservice.entity.Class;
import com.yuan.courseservice.service.ClassService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.io.Serializable;
import java.util.List;

/**
 * (Class)表控制层
 *
 * @author makejava
 * @since 2023-04-28 19:45:21
 */
@RestController
@RequestMapping("class")
public class ClassController extends ApiController {
    /**
     * 服务对象
     */
    @Resource
    private ClassService classService;

    /**
     * 分页查询所有数据
     *
     * @param page  分页对象
     * @param class 查询实体
     * @return 所有数据
     */
    @GetMapping
    public R selectAll(Page<Class> page, Class class) {
        return success(this.classService.page(page, new QueryWrapper<>( class)))
    }

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("{id}")
    public R selectOne(@PathVariable Serializable id) {
        return success(this.classService.getById(id));
    }

    /**
     * 新增数据
     *
     * @param class 实体对象
     * @return 新增结果
     */
    @PostMapping
    public R insert(@RequestBody Class class) {
        return success(this.classService.save( class))
    }

    /**
     * 修改数据
     *
     * @param class 实体对象
     * @return 修改结果
     */
    @PutMapping
    public R update(@RequestBody Class class) {
        return success(this.classService.updateById( class))
    }

    /**
     * 删除数据
     *
     * @param idList 主键结合
     * @return 删除结果
     */
    @DeleteMapping
    public R delete(@RequestParam("idList") List<Long> idList) {
        return success(this.classService.removeByIds(idList));
    }
}

