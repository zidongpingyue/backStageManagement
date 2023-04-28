package com.yuan.courseservice.controller;


import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.api.ApiController;
import com.baomidou.mybatisplus.extension.api.R;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.yuan.courseservice.entity.StuMes;
import com.yuan.courseservice.service.StuMesService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.io.Serializable;
import java.util.List;

/**
 * (StuMes)表控制层
 *
 * @author makejava
 * @since 2023-04-28 19:45:24
 */
@RestController
@RequestMapping("stuMes")
public class StuMesController extends ApiController {
    /**
     * 服务对象
     */
    @Resource
    private StuMesService stuMesService;

    /**
     * 分页查询所有数据
     *
     * @param page   分页对象
     * @param stuMes 查询实体
     * @return 所有数据
     */
    @GetMapping
    public R selectAll(Page<StuMes> page, StuMes stuMes) {
        return success(this.stuMesService.page(page, new QueryWrapper<>(stuMes)));
    }

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("{id}")
    public R selectOne(@PathVariable Serializable id) {
        return success(this.stuMesService.getById(id));
    }

    /**
     * 新增数据
     *
     * @param stuMes 实体对象
     * @return 新增结果
     */
    @PostMapping
    public R insert(@RequestBody StuMes stuMes) {
        return success(this.stuMesService.save(stuMes));
    }

    /**
     * 修改数据
     *
     * @param stuMes 实体对象
     * @return 修改结果
     */
    @PutMapping
    public R update(@RequestBody StuMes stuMes) {
        return success(this.stuMesService.updateById(stuMes));
    }

    /**
     * 删除数据
     *
     * @param idList 主键结合
     * @return 删除结果
     */
    @DeleteMapping
    public R delete(@RequestParam("idList") List<Long> idList) {
        return success(this.stuMesService.removeByIds(idList));
    }
}

