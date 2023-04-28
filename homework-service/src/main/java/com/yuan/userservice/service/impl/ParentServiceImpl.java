package com.yuan.userservice.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.yuan.userservice.dao.ParentDao;
import com.yuan.userservice.entity.Parent;
import com.yuan.userservice.service.ParentService;
import org.springframework.stereotype.Service;

/**
 * (Parent)表服务实现类
 *
 * @author makejava
 * @since 2023-04-28 18:05:30
 */
@Service("parentService")
public class ParentServiceImpl extends ServiceImpl<ParentDao, Parent> implements ParentService {

}

