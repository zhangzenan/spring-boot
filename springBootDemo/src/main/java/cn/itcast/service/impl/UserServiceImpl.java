package cn.itcast.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.itcast.domain.User;
import cn.itcast.mapper.UserMapper;
import cn.itcast.service.UserService;

@Service
public class UserServiceImpl implements UserService {

	//注入Mapper接口代理对象
	@Autowired
	private UserMapper userMapper;
	
	@Override
	public List<User> findAll() {
		List<User> list=userMapper.findAll();
		return list;
	}

}
