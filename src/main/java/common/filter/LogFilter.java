package common.filter;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;

//import org.apache.log4j.Logger;

/**
 * @Description 日志Filter
 * @author 可凡
 * @date 2013-08-21 21:55
 * 
 */
public class LogFilter implements Filter {

	// FilterConfig 可用于访问Filter的配置信息
	private FilterConfig filterConfig = null;

	// static Logger logger = Logger.getLogger(LogFilter.class);

	/**
	 * 实现销毁方法
	 * 
	 */
	@Override
	public void destroy() {
		this.filterConfig = null;
	}

	/**
	 * 核心方法，记录request，session，
	 * 
	 */
	@Override
	public void doFilter(ServletRequest request, ServletResponse response,
			FilterChain chain) throws IOException, ServletException {
		// ---下面代码用于用户请求执行预处理---
		// 获取ServletContext对象，用于记录日志
		ServletContext context = this.filterConfig.getServletContext();
		long before = System.currentTimeMillis();
		// logger.info("-----log filter begin-----");
		System.out.println("-------------------------------------");
		System.out.println("log filter begin...");
		// 将请求转换成HttpServletRequest请求
		HttpServletRequest hsrequset = (HttpServletRequest) request;
		// 输出提示信息
		// logger.info("request getted : " + hsrequset.getServletPath());
		System.out.println("request getted:" + hsrequset.getServletPath());
		// Filter请求只是链式处理，请求依然放行到目的地址
		chain.doFilter(request, response);
		// --- 下面的代码用于对服务器响应执行后处理---
		long after = System.currentTimeMillis();
		// System.out.println("log filter end.");
		// logger.info("request url : " + hsrequset.getRequestURL());
		// logger.info("cost time : " + (after - before) + "ms");
		// logger.info("-----log filter end-----");
		System.out.println("request url:" + hsrequset.getRequestURL()
				+ " cost time:" + (after - before) + "ms");
		System.out.println("-------------------------------------");
	}

	/**
	 * 实现初始化方法
	 */
	@Override
	public void init(FilterConfig config) throws ServletException {
		this.filterConfig = config;
	}

}
