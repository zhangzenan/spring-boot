package cn.itcast.controller;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import cn.itcast.domain.User;
import cn.itcast.service.UserService;

@RestController
public class UserController {
	
	//注入Service对象
	@Autowired
	private UserService userService;

	/**
	 * 需求：返回基本类型json格式数据
	 */
	@RequestMapping("hello")
	public String showHello() {
		return "hello world";
	}

	/**
	 * 返回pojo对象
	 */
	@RequestMapping("pojo")
	public User showUser() {
		User u = new User();
		u.setId(1);
		u.setUsername("张三");
		u.setSex("男");
		u.setBirthday(new Date());
		u.setAddress("武当山");
		return u;
	}

	/**
	 * 返回map集合对象
	 */
	@RequestMapping("maps")
	public Map<String, Object> showMaps() {
		Map<String, Object> maps = new HashMap<String, Object>();
		maps.put("username", "张三");
		maps.put("age", 19);

		return maps;
	}

	/**
	 * 返回list集合对象
	 */
	@RequestMapping("list")
	public List<User> showList() {
		// 创建一个list集合对象
		List<User> uList = new ArrayList<User>();

		// 创建user对象
		User u1 = new User();
		u1.setUsername("张三");
		u1.setBirthday(new Date());
		uList.add(u1);

		User u2 = new User();
		u2.setUsername("李四");
		u2.setBirthday(new Date());
		uList.add(u2);

		return uList;
	}
	
	/**
	 * 整合SSM
	 */
	@RequestMapping("ssm")
	public List<User> findAll(){
		List<User> list=userService.findAll();
		return list;
	}
}
