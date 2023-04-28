package com.yuan.homeworkservice.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.yuan.homeworkservice.dao.StuHomeworkDao;
import com.yuan.homeworkservice.entity.StuHomework;
import com.yuan.homeworkservice.service.StuHomeworkService;
import org.springframework.stereotype.Service;

/**
 * (StuHomework)表服务实现类
 *
 * @author makejava
 * @since 2023-04-28 19:44:02
 */
@Service("stuHomeworkService")
public class StuHomeworkServiceImpl extends ServiceImpl<StuHomeworkDao, StuHomework> implements StuHomeworkService {

}

