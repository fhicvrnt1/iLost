/**
 * 
 */
package common.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.joda.time.DateTime;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.AbstractController;

/**
 * @Description
 * @author 可凡
 * @date 2013年12月11日 下午2:06:16
 * @mail liukefan@gmail.com
 * @version v1.0.0
 */
public class HelloWorldController extends AbstractController {

	@Override
	protected ModelAndView handleRequestInternal(HttpServletRequest request,
			HttpServletResponse response) throws Exception {
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

}
