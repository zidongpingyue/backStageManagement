package com.yuan.userservice.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.yuan.userservice.dao.TeacherDao;
import com.yuan.userservice.entity.Teacher;
import com.yuan.userservice.service.TeacherService;
import org.springframework.stereotype.Service;

/**
 * (Teacher)表服务实现类
 *
 * @author makejava
 * @since 2023-04-28 19:45:55
 */
@Service("teacherService")
public class TeacherServiceImpl extends ServiceImpl<TeacherDao, Teacher> implements TeacherService {

}

