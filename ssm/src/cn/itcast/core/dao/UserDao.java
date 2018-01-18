package cn.itcast.core.dao;

import java.util.List;

import cn.itcast.core.pojo.User;

public interface UserDao {
	
	//添加
	public void addUser(User user) throws Exception;
	//查询所有
	public List<User> findAll() throws Exception;
	
}
