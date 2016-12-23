package strutsFilter;

import java.io.File;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;

public class StrutsFilter implements Filter {

	@Override
	public void destroy() {

	}

	@Override
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {
		// 强转
		HttpServletRequest req = (HttpServletRequest) request;
		HttpServletResponse resp = (HttpServletResponse) response;

		// 操作
		// 1.得到请求资源路径
		String uri = req.getRequestURI();
		String contextPath = req.getContextPath();
		String path = uri.substring(contextPath.length() + 1);

		// System.out.println(path);
		// 使用path去struts.xml文件中查找某一个<action name=path>这个标签
		SAXReader reader = new SAXReader();

		try {
			// 得到struts.xml文件中的document对象
			
			Document document = reader.read(new File(this.getClass().getResource("/struts.xml").getPath()));
			
			// 查找action='hello'的标签
			Element actionElement = (Element) document.selectSingleNode("//action[@name='" + path + "']");

			if (actionElement != null) {
				// 得到<action>标签上的class属性及method的属性
				String className = actionElement.attributeValue("class");
				String methodName = actionElement.attributeValue("method");

				// 通过反射，得到class对象，得到method对象
				Class actionClass = Class.forName(className);
				Method method = actionClass.getDeclaredMethod(methodName);
 
				// 让method执行
				// 让action中的类执行获取返回值
				String returnValue = (String) method.invoke(actionClass.newInstance());
//				System.out.println(returnValue);

				// 使用returnValue去action下查找其子元素result的name属性值，与resultValue对比

				Element resultElement = actionElement.element("result");
				String nameValue = resultElement.attributeValue("name");

				if (returnValue.equals(nameValue)) {
					// 得到要跳转的路径
					String skipPath = resultElement.getText();
					// System.out.println(skipPath);

					req.getRequestDispatcher(skipPath).forward(req, resp);
					return;

				}

			}
		} catch (DocumentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (NoSuchMethodException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SecurityException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalArgumentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InstantiationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		// 放行
		chain.doFilter(req, resp);
	}

	@Override
	public void init(FilterConfig arg0) throws ServletException {

	}

}
