package cn.itcast.controller;

import java.util.Date;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import cn.itcast.domain.User;

@RestController
public class UserController {

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
	
	/*public Map<String,Object> showMaps(){
		Map<>
	}*/
}
