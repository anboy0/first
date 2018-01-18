package cn.itcast.core.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.itcast.core.dao.UserDao;
import cn.itcast.core.pojo.User;

@Service
public class UserServiceImpl implements UserService {
	
	@Autowired
	private UserDao userDao;
	
	@Override
	public void addUser(User user) throws Exception {
		userDao.addUser(user);
	}

	@Override
	public List<User> findAll() throws Exception {
		List<User> list = userDao.findAll();
		return list;
	}

	

}
