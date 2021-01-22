/**
 * 
 */
package common.controller;

//import javax.servlet.http.HttpServletRequest;
//import javax.servlet.http.HttpServletResponse;

import org.joda.time.DateTime;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

//import org.springframework.web.servlet.mvc.AbstractController;

/**
 * @Description
 * @author 可凡
 * @date 2013年12月11日 下午2:06:16
 * @mail liukefan@gmail.com
 * @version v1.0.0
 */
@Controller
@RequestMapping(value = "/hello/**")
public class HelloWorldController {

	@RequestMapping(value = "/welcome", method = RequestMethod.GET)
	public ModelAndView helloWorld() {
		// 1、收集参数
		// 2、绑定参数到命令对象
		// 3、调用业务对象
		// 4、选择下一个页面
		ModelAndView mv = new ModelAndView();
		String mvMsgFlg = "msg";
		String mvMsg = "hello world!";
		String mvName = "HelloWorldPage";
		DateTime date = new DateTime();
		mvMsg += " " + date.toString("yyyy/MM/dd HH:mm:ss EE");
		mv.addObject(mvMsgFlg, mvMsg);
		mv.setViewName(mvName);
		return mv;
	}

	@RequestMapping(value = "/user", method = RequestMethod.GET)
	public ModelAndView helloUser(
			@RequestParam(value = "username", required = true) String username) {
		
		// 1、收集参数
		// 2、绑定参数到命令对象
		// 3、调用业务对象
		// 4、选择下一个页面

		ModelAndView mv = new ModelAndView();
		String mvMsgFlg = "msg";
		String mvMsg = "hello " + username;
		String mvName = "HelloWorldPage";
		DateTime date = new DateTime();
		mvMsg += " " + date.toString("yyyy/MM/dd HH:mm:ss EE");
		mv.addObject(mvMsgFlg, mvMsg);
		mv.setViewName(mvName);
		return mv;
	}

}
