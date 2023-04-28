package com.yuan.courseservice.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.yuan.courseservice.dao.StuMesDao;
import com.yuan.courseservice.entity.StuMes;
import com.yuan.courseservice.service.StuMesService;
import org.springframework.stereotype.Service;

/**
 * (StuMes)表服务实现类
 *
 * @author makejava
 * @since 2023-04-28 19:45:24
 */
@Service("stuMesService")
public class StuMesServiceImpl extends ServiceImpl<StuMesDao, StuMes> implements StuMesService {

}

