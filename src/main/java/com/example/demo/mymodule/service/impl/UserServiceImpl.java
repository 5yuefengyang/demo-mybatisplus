package com.example.demo.mymodule.service.impl;

import com.example.demo.mymodule.entity.User;
import com.example.demo.mymodule.mapper.UserMapper;
import com.example.demo.mymodule.service.IUserService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author aufengyang
 * @since 2019-06-16
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements IUserService {

}
