package me.second_life.ilost.controller;

import me.second_life.ilost.pojo.User;
import me.second_life.ilost.service.IUserService;

import org.joda.time.DateTime;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * <p>
 * Spring MVC 简单测试类
 * 
 * @author 可凡
 * @date 2013年12月11日 下午2:06:16
 * @version 1.0.0
 */
@Controller
@RequestMapping(value = "/hello/**")
public class HelloWorldController {

	/**
	 * 自动注入用户业务类
	 */
	@Autowired
	IUserService userServiceImpl;

	/**
	 * 访问控制器和返回视图
	 * 
	 * @return 视图
	 */
	@RequestMapping(value = "/welcome", method = RequestMethod.GET)
	public String helloWorld(Model model) {
		String msgKey = "msg";
		String msgValue = "hello world!";
		String viewName = "HelloWorldPage";
		DateTime date = new DateTime();
		msgValue += " " + date.toString("yyyy/MM/dd HH:mm:ss EE");
		model.addAttribute(msgKey, msgValue);
		return viewName;
	}

	/**
	 * 检查用户是否存在
	 * 
	 * @param username
	 *            用户名
	 * @return 返回是否存在的视图
	 */
	@RequestMapping(value = "/user", method = RequestMethod.GET)
	public String helloUser(
			@RequestParam(value = "username", required = true) String username,
			Model model) {

		User user = new User();
		user.setUserName(username);
		boolean exist = userServiceImpl.exsit(user);
		String msgKey = "msg";
		String msgValue = username;
		String viewName = "HelloWorldPage";
		DateTime date = new DateTime();

		if (!exist) {
			msgValue = "Wrong name : " + msgValue + " "
					+ date.toString("yyyy/MM/dd HH:mm:ss EE");
			model.addAttribute(msgKey, msgValue);
		} else {
			msgValue = "Hello : " + msgValue + " "
					+ date.toString("yyyy/MM/dd HH:mm:ss EE");
			model.addAttribute(msgKey, msgValue);
		}

		return viewName;

	}

}
