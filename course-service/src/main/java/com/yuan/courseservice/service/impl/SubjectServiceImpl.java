package com.yuan.courseservice.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.yuan.courseservice.dao.SubjectDao;
import com.yuan.courseservice.entity.Subject;
import com.yuan.courseservice.service.SubjectService;
import org.springframework.stereotype.Service;

/**
 * (Subject)表服务实现类
 *
 * @author makejava
 * @since 2023-04-28 19:45:23
 */
@Service("subjectService")
public class SubjectServiceImpl extends ServiceImpl<SubjectDao, Subject> implements SubjectService {

}

