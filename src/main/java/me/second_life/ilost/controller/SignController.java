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
 * @Description
 * @author 可凡
 * @date 2014年4月8日 下午2:23:21
 * @mail
 * @version v1.0.0
 */

@Controller
public class SignController {

	@Autowired
	IUserService userServiceImpl;

	@RequestMapping(value = "/signin", method = RequestMethod.GET)
	public ModelAndView signin() {
		ModelAndView mv = new ModelAndView();
		String mvName = "SignIn";
		mv.setViewName(mvName);
		return mv;
	}

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
