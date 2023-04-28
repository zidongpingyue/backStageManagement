package com.yuan.reviewservice.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.yuan.reviewservice.dao.AnswerDao;
import com.yuan.reviewservice.entity.Answer;
import com.yuan.reviewservice.service.AnswerService;
import org.springframework.stereotype.Service;

/**
 * (Answer)表服务实现类
 *
 * @author makejava
 * @since 2023-04-28 19:43:11
 */
@Service("answerService")
public class AnswerServiceImpl extends ServiceImpl<AnswerDao, Answer> implements AnswerService {

}

