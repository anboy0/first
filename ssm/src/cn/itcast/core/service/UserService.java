package cn.itcast.core.service;

import java.util.List;

import cn.itcast.core.pojo.User;

public interface UserService {
	
	//添加
	public void addUser(User user) throws Exception;
	//查询所有
	public List<User> findAll() throws Exception;
	
}
