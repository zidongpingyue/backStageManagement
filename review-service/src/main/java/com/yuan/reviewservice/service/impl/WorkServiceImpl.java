package com.yuan.reviewservice.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.yuan.reviewservice.dao.WorkDao;
import com.yuan.reviewservice.entity.Work;
import com.yuan.reviewservice.service.WorkService;
import org.springframework.stereotype.Service;

/**
 * (Work)表服务实现类
 *
 * @author makejava
 * @since 2023-04-28 19:43:12
 */
@Service("workService")
public class WorkServiceImpl extends ServiceImpl<WorkDao, Work> implements WorkService {

}

