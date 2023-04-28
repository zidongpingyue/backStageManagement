package com.yuan.homeworkservice.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.yuan.homeworkservice.dao.HomeworkDao;
import com.yuan.homeworkservice.entity.Homework;
import com.yuan.homeworkservice.service.HomeworkService;
import org.springframework.stereotype.Service;

/**
 * (Homework)表服务实现类
 *
 * @author makejava
 * @since 2023-04-28 19:44:02
 */
@Service("homeworkService")
public class HomeworkServiceImpl extends ServiceImpl<HomeworkDao, Homework> implements HomeworkService {

}

