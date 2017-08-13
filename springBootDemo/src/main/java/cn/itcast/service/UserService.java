package cn.itcast.service;

import java.util.List;

import cn.itcast.domain.User;

public interface UserService {
	
	public List<User> findAll();
	
	
	/**
	 * 查询redis集群服务
	 * @return
	 */
	public String findRedis();

}
