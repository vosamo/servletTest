package com.vosamo.serv;

import java.io.IOException;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

/**
 * Servlet Filter implementation class DisplayHeaderFilter
 */
public class DisplayHeaderFilter implements Filter {

    /**
     * Default constructor. 
     */
    public DisplayHeaderFilter() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see Filter#destroy()
	 */
	public void destroy() {
		// TODO Auto-generated method stub
	}

	/**
	 * 该方法完成实际的过滤操作，当客户端请求与过滤设置匹配的URL时，Servlet容器将先调用
	 * 过滤器的doFilter方法；FilterChain用于访问后续过滤器
	 * @see Filter#doFilter(ServletRequest, ServletResponse, FilterChain)
	 */
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		// TODO Auto-generated method stub
		// place your code here
	    System.out.println("网站地址： http://www.runoob.com");
		// pass the request along the filter chain
		chain.doFilter(request, response);
	}

	/**
	 * init方法只在web应用启动时执行一次,使用FilterConfig对象获取参数
	 * @see Filter#init(FilterConfig)
	 */
	public void init(FilterConfig fConfig) throws ServletException {
		// TODO Auto-generated method stub
	    String site = fConfig.getInitParameter("Site");
	    System.out.println("网站名称： " + site);
	}

}
