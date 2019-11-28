package com.qf.service.impl;

import com.baomidou.mybatisplus.extension.service.IService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.qf.entity.Student;
import com.qf.mapper.StuMapper;
import com.qf.service.IStuService;
import org.springframework.stereotype.Service;

/**
 * @author zqq
 * @version 1.0
 * @Date 2019/11/27
 */
@Service
public class StuServiceImpl extends ServiceImpl<StuMapper,Student> implements IStuService {
}
