package com.yuan.reviewservice.controller;


import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.api.ApiController;
import com.baomidou.mybatisplus.extension.api.R;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.yuan.reviewservice.entity.Problem;
import com.yuan.reviewservice.service.ProblemService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.io.Serializable;
import java.util.List;

/**
 * (Problem)表控制层
 *
 * @author makejava
 * @since 2023-04-28 19:43:10
 */
@RestController
@RequestMapping("problem")
public class ProblemController extends ApiController {
    /**
     * 服务对象
     */
    @Resource
    private ProblemService problemService;

    /**
     * 分页查询所有数据
     *
     * @param page    分页对象
     * @param problem 查询实体
     * @return 所有数据
     */
    @GetMapping
    public R selectAll(Page<Problem> page, Problem problem) {
        return success(this.problemService.page(page, new QueryWrapper<>(problem)));
    }

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("{id}")
    public R selectOne(@PathVariable Serializable id) {
        return success(this.problemService.getById(id));
    }

    /**
     * 新增数据
     *
     * @param problem 实体对象
     * @return 新增结果
     */
    @PostMapping
    public R insert(@RequestBody Problem problem) {
        return success(this.problemService.save(problem));
    }

    /**
     * 修改数据
     *
     * @param problem 实体对象
     * @return 修改结果
     */
    @PutMapping
    public R update(@RequestBody Problem problem) {
        return success(this.problemService.updateById(problem));
    }

    /**
     * 删除数据
     *
     * @param idList 主键结合
     * @return 删除结果
     */
    @DeleteMapping
    public R delete(@RequestParam("idList") List<Long> idList) {
        return success(this.problemService.removeByIds(idList));
    }
}

