package com.yuan.courseservice.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.yuan.courseservice.dao.CourseDao;
import com.yuan.courseservice.entity.Course;
import com.yuan.courseservice.service.CourseService;
import org.springframework.stereotype.Service;

/**
 * (Course)表服务实现类
 *
 * @author makejava
 * @since 2023-04-28 19:45:22
 */
@Service("courseService")
public class CourseServiceImpl extends ServiceImpl<CourseDao, Course> implements CourseService {

}

