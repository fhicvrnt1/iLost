/**
 * 
 */
package me.second_life.ilost.controller;

import me.second_life.ilost.pojo.User;
import me.second_life.ilost.service.IUserService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;


/**
 * <p> 登录控制器
 * @author 可凡
 * @date 2014年4月8日 下午2:23:21
 * @version 1.0.0
 */
@Controller
public class SignController {

	/**
	 * 自动注入用户业务类
	 */
	@Autowired
	IUserService userServiceImpl;

	/**
	 * 登录请求方法，必须GET类型
	 * @return 登录视图
	 */
	@RequestMapping(value = "/signin", method = RequestMethod.GET)
	public ModelAndView signin() {
		ModelAndView mv = new ModelAndView();
		String mvName = "SignIn";
		mv.setViewName(mvName);
		return mv;
	}

	/**
	 * 登录验证方法，必须POST类型
	 * @param user 登录用户
	 * @return 是否登录成功的视图
	 */
	@RequestMapping(value = "/signin", method = RequestMethod.POST)
	public ModelAndView Login(User user) {

		ModelAndView mv = new ModelAndView();
		String mvName = "index";
		if (user != null) {
			if (user.getUserName() != null && user.getUserPassword() != null) {
				User newUser = userServiceImpl.getUser(user);
				if (newUser != null) {
					mvName = "index";
					mv.setViewName(mvName);
					return mv;
				} else {
					mvName = "SignIn";
					mv.setViewName(mvName);
					return mv;
				}
			} else {
				mvName = "SignIn";
				mv.setViewName(mvName);
				return mv;
			}
		} else {
			mvName = "SignIn";
			mv.setViewName(mvName);
			return mv;
		}
	}
}
