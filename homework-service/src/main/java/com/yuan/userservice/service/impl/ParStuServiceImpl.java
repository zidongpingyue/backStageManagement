package com.yuan.userservice.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.yuan.userservice.dao.ParStuDao;
import com.yuan.userservice.entity.ParStu;
import com.yuan.userservice.service.ParStuService;
import org.springframework.stereotype.Service;

/**
 * (ParStu)表服务实现类
 *
 * @author makejava
 * @since 2023-04-28 18:05:44
 */
@Service("parStuService")
public class ParStuServiceImpl extends ServiceImpl<ParStuDao, ParStu> implements ParStuService {

}

