package cn.itcast.core.controller;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import cn.itcast.core.pojo.User;
import cn.itcast.core.service.UserService;

@Controller
public class UserController {
	
	@Autowired
	private UserService userService;
	
	@RequestMapping("/add")
	public String add() throws Exception{
		
		
		return "insert";
		
	}
	
	@RequestMapping("/insert")
	public String addUser(String name,String birthday) throws Exception{
		Date date = new SimpleDateFormat("yyyy-MM-dd").parse(birthday);
		User user = new User();
		user.setName(name);
		user.setBirthday(date);
		userService.addUser(user);
		
		return "success";
		
	}
	
	@RequestMapping("/findAll")
	public String findAll(Model model) throws Exception{
		List<User> list = userService.findAll();
		model.addAttribute("userList", list);
		return "list";
	}
	
	
}
