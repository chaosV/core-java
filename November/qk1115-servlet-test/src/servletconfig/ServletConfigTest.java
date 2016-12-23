package servletconfig;

import java.io.IOException;
import java.util.Enumeration;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ServletConfigTest extends HttpServlet {

	// 定义servletconfig对象接受配置的初始化参数
	private ServletConfig config;

	/**
	 * 当servlet配置了初始化参数后，web容器在创建servlet实例对象时，
	 * 会自动将这些初始化参数封装到ServletConfig对象中，并在调用servlet的init方法时，
	 * 将ServletConfig对象传递给servlet。进而，程序员通过ServletConfig对象就可以
	 * 得到当前servlet的初始化参数信息。
	 */

	public void init(ServletConfig config) {
		this.config = config;
	}

	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException,IOException {
		//获取指定的初始化参数
	
		String paramVal = this.config.getInitParameter("name");
		response.getWriter().print(paramVal);
		response.getWriter().print("<hr/>");
		//获取所有初始化参数
		Enumeration<String> e = config.getInitParameterNames();

		while (e.hasMoreElements()) {
			String name = e.nextElement();
			String value = config.getInitParameter(name);
			response.getWriter().print(name + "=" + value + "<br/>");
		}
	}

	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		this.doGet(request, response);
	}
}
