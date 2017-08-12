package cn.itcast.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import cn.itcast.domain.User;

@Mapper
public interface UserMapper {
	public List<User> findAll();

}
