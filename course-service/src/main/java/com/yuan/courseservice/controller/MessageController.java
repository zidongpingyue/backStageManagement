package com.yuan.courseservice.controller;


import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.api.ApiController;
import com.baomidou.mybatisplus.extension.api.R;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.yuan.courseservice.entity.Message;
import com.yuan.courseservice.service.MessageService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.io.Serializable;
import java.util.List;

/**
 * (Message)表控制层
 *
 * @author makejava
 * @since 2023-04-28 19:45:23
 */
@RestController
@RequestMapping("message")
public class MessageController extends ApiController {
    /**
     * 服务对象
     */
    @Resource
    private MessageService messageService;

    /**
     * 分页查询所有数据
     *
     * @param page    分页对象
     * @param message 查询实体
     * @return 所有数据
     */
    @GetMapping
    public R selectAll(Page<Message> page, Message message) {
        return success(this.messageService.page(page, new QueryWrapper<>(message)));
    }

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("{id}")
    public R selectOne(@PathVariable Serializable id) {
        return success(this.messageService.getById(id));
    }

    /**
     * 新增数据
     *
     * @param message 实体对象
     * @return 新增结果
     */
    @PostMapping
    public R insert(@RequestBody Message message) {
        return success(this.messageService.save(message));
    }

    /**
     * 修改数据
     *
     * @param message 实体对象
     * @return 修改结果
     */
    @PutMapping
    public R update(@RequestBody Message message) {
        return success(this.messageService.updateById(message));
    }

    /**
     * 删除数据
     *
     * @param idList 主键结合
     * @return 删除结果
     */
    @DeleteMapping
    public R delete(@RequestParam("idList") List<Long> idList) {
        return success(this.messageService.removeByIds(idList));
    }
}

