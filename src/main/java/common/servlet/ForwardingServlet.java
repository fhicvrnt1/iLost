/**
 * 
 */
package common.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @Description
 * @author 可凡
 * @date 2013年12月20日 下午7:31:14
 * @mail
 * @version v1.0.0
 */
public class ForwardingServlet extends HttpServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = -8175662333237917028L;

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		resp.getWriter().write("Controller forward to Servlet");
	}
}
