package com.yuan.courseservice.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.yuan.courseservice.dao.MessageDao;
import com.yuan.courseservice.entity.Message;
import com.yuan.courseservice.service.MessageService;
import org.springframework.stereotype.Service;

/**
 * (Message)表服务实现类
 *
 * @author makejava
 * @since 2023-04-28 19:45:23
 */
@Service("messageService")
public class MessageServiceImpl extends ServiceImpl<MessageDao, Message> implements MessageService {

}

