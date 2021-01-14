/**
 * 
 */
package common.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.joda.time.DateTime;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

/**
 * @Description
 * @author 可凡
 * @date 2013年12月11日 下午2:06:16
 * @mail liukefan@gmail.com
 * @version v1.0.0
 */
public class HelloWorldController implements Controller {

	@Override
	public ModelAndView handleRequest(HttpServletRequest request,
			HttpServletResponse response) throws Exception {
		ModelAndView mv = new ModelAndView();
		String mvMsgFlg = "msg";
		String mvMsg = "hello world!";
		String mvName = "HelloWorldPage";
		DateTime date = new DateTime();
		mvMsg += " " + date.toString("yyyy/MM/dd HH:mm:ss EE");
		//System.out.println(mvMsgFlg + " " + mvMsg + " " + mvName);
		mv.addObject(mvMsgFlg, mvMsg);
		mv.setViewName(mvName);
		return mv;
	}

}
