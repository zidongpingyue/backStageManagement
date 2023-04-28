package com.yuan.reviewservice.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.yuan.reviewservice.dao.ProblemDao;
import com.yuan.reviewservice.entity.Problem;
import com.yuan.reviewservice.service.ProblemService;
import org.springframework.stereotype.Service;

/**
 * (Problem)表服务实现类
 *
 * @author makejava
 * @since 2023-04-28 19:43:11
 */
@Service("problemService")
public class ProblemServiceImpl extends ServiceImpl<ProblemDao, Problem> implements ProblemService {

}

