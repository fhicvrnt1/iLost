/**
 * 
 */
package common.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.AbstractController;

/**
 * @Description
 * @author 可凡
 * @date 2013年12月20日 下午6:44:41
 * @mail liukefan@gmail.com
 * @version v1.0.0
 */
public class HelloWorldWithoutReturnModelAndViewController extends
		AbstractController {

	@Override
	protected ModelAndView handleRequestInternal(HttpServletRequest request,
			HttpServletResponse response) throws Exception {
		response.getWriter().write("Hello World");
		return null;
	}

}
