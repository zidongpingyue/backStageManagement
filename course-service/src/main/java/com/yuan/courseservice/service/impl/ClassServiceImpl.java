package com.yuan.courseservice.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.yuan.courseservice.dao.ClassDao;
import com.yuan.courseservice.entity.Class;
import com.yuan.courseservice.service.ClassService;
import org.springframework.stereotype.Service;

/**
 * (Class)表服务实现类
 *
 * @author makejava
 * @since 2023-04-28 19:45:22
 */
@Service("classService")
public class ClassServiceImpl extends ServiceImpl<ClassDao, Class> implements ClassService {

}

