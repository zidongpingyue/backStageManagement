package com.yuan.homeworkservice.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.yuan.homeworkservice.dao.PictureDao;
import com.yuan.homeworkservice.entity.Picture;
import com.yuan.homeworkservice.service.PictureService;
import org.springframework.stereotype.Service;

/**
 * (Picture)表服务实现类
 *
 * @author makejava
 * @since 2023-04-28 19:44:03
 */
@Service("pictureService")
public class PictureServiceImpl extends ServiceImpl<PictureDao, Picture> implements PictureService {

}

