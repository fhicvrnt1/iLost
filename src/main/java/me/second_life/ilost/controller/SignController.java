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
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

/**
 * <p>
 * 登录控制器
 * 
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
	 * 
	 * @return 登录视图
	 */
	@RequestMapping(value = "/signin", method = RequestMethod.GET)
	public String signInGet() {
		String viewName = "/signIn";
		return viewName;
	}

	/**
	 * 登录验证方法，必须POST类型
	 * 
	 * @param user
	 *            登录用户
	 * @return 是否登录成功的视图
	 */
	@RequestMapping(value = "/signin", method = RequestMethod.POST)
	public String signInPost(User user, RedirectAttributes redirectAttributes) {
		String viewName = "/index";
		String msg = "用户名或密码错误";
		if (user != null) {
			if (user.getUserName() != null && user.getUserPassword() != null) {
				User newUser = userServiceImpl.getUser(user);
				if (newUser != null) {
					redirectAttributes.addFlashAttribute("user", newUser);
					viewName = "/index";
				} else {
					redirectAttributes.addFlashAttribute("msg", msg);
					viewName = "redirect:/signin";
				}
			} else {
				redirectAttributes.addFlashAttribute("msg", msg);
				viewName = "redirect:/signin";
			}
		} else {
			redirectAttributes.addFlashAttribute("msg", msg);
			viewName = "redirect:/signin";
		}
		return viewName;
	}
	
	@RequestMapping(value="/signup", method=RequestMethod.GET)
	public String signUpGet(){
		String viewName = "/signUp";
		return viewName;
		
	}
	
	@RequestMapping(value="/signup", method=RequestMethod.POST)
	public String signUpPost(User user, RedirectAttributes redirectAttributes){
		String viewName = "/index";
		String msg = "注册失败";
		if (user != null) {
			if (user.getUserName() != null && user.getUserPassword() != null) {
				User newUser = userServiceImpl.addUser(user);
				if (newUser != null) {
					redirectAttributes.addFlashAttribute("user", newUser);
					viewName = "/index";
				} else {
					redirectAttributes.addFlashAttribute("msg", msg);
					viewName = "redirect:/signup";
				}
			} else {
				redirectAttributes.addFlashAttribute("msg", msg);
				viewName = "redirect:/signup";
			}
		} else {
			redirectAttributes.addFlashAttribute("msg", msg);
			viewName = "redirect:/signup";
		}
		return viewName;
		
	}
}
