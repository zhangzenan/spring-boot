package cn.itcast.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import cn.itcast.domain.User;
import cn.itcast.mapper.UserMapper;
import cn.itcast.service.UserService;
import redis.clients.jedis.JedisCluster;

@Service
public class UserServiceImpl implements UserService {

	//注入Mapper接口代理对象
	@Autowired
	private UserMapper userMapper;
	
	//注入REDIS集群对象
	@Autowired
	private JedisCluster jedisCluster;
	
	//测试redis缓存
	@Override
	@Cacheable(value="findAllUsers")
	public List<User> findAll() {
		System.out.println("如果第二次没有打印此文章，说明走了缓存，没有执行此方法！");
		List<User> list=userMapper.findAll();
		return list;
	}
	
	public String findRedis(){
		jedisCluster.set("username", "张三");
		String value=jedisCluster.get("username");
		return value;		
	}

}
