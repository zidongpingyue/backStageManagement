package com.yuan.userservice.controller;


import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.api.ApiController;
import com.baomidou.mybatisplus.extension.api.R;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.yuan.userservice.entity.Parent;
import com.yuan.userservice.service.ParentService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.io.Serializable;
import java.util.List;

/**
 * (Parent)表控制层
 *
 * @author makejava
 * @since 2023-04-28 18:04:41
 */
@RestController
@RequestMapping("parent")
public class ParentController extends ApiController {
    /**
     * 服务对象
     */
    @Resource
    private ParentService parentService;

    /**
     * 分页查询所有数据
     *
     * @param page   分页对象
     * @param parent 查询实体
     * @return 所有数据
     */
    @GetMapping
    public R selectAll(Page<Parent> page, Parent parent) {
        return success(this.parentService.page(page, new QueryWrapper<>(parent)));
    }

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("{id}")
    public R selectOne(@PathVariable Serializable id) {
        return success(this.parentService.getById(id));
    }

    /**
     * 新增数据
     *
     * @param parent 实体对象
     * @return 新增结果
     */
    @PostMapping
    public R insert(@RequestBody Parent parent) {
        return success(this.parentService.save(parent));
    }

    /**
     * 修改数据
     *
     * @param parent 实体对象
     * @return 修改结果
     */
    @PutMapping
    public R update(@RequestBody Parent parent) {
        return success(this.parentService.updateById(parent));
    }

    /**
     * 删除数据
     *
     * @param idList 主键结合
     * @return 删除结果
     */
    @DeleteMapping
    public R delete(@RequestParam("idList") List<Long> idList) {
        return success(this.parentService.removeByIds(idList));
    }
}

