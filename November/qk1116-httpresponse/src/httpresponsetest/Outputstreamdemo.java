package httpresponsetest;

import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/Outputstream")
public class Outputstreamdemo extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Outputstreamdemo() {
        super();
        // TODO Auto-generated constructor stub
    }


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		outputChineseByOutputStream(response);
		//outputChineseByPrintwriter(response);
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}
	
	public void outputChineseByOutputStream(HttpServletResponse response) throws IOException{
		String data="赵超";
		//获取输出流OutputStream
		response.setCharacterEncoding("utf-8");
		OutputStream os=response.getOutputStream();
		//设置响应头content-type
		response.setHeader("content-type", "text/html;charset:utf-8");
		response.setDateHeader("date",System.currentTimeMillis());
		//将字符转以utf-8的形式换成字节数组
		byte[] dataByteArr=data.getBytes("utf-8");
		//向客户端输出字节数组
		os.write(dataByteArr);
	}
	
	public void outputChineseByPrintwriter(HttpServletResponse response) throws IOException{
		String data="很帅";
		
		response.setCharacterEncoding("utf-8");
		//获取输出流PrintWriter
		PrintWriter out=response.getWriter();
		
		response.setHeader("content-type","text/html;charset=utf-8");
		//out.write("<meta http-equiv='content-type' content='text/html;charset=utf-8' />");
		out.write(data);
		
	
	}

}
