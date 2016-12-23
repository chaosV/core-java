package httpresponsedownfile;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Responcedownfile
 */
@WebServlet("/Responcedownfile")
public class Responcedownfile extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

    public Responcedownfile() {
        super();
        // TODO Auto-generated constructor stub
    }


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		downloadFileByOutputStream(response);
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		doGet(request, response);
	}
	
	private void downloadFileByOutputStream(HttpServletResponse response) throws IOException{
		//获取目标文件的绝对路径
		String realpath=this.getServletContext().getRealPath("\\CoreJava.png");
		//获取目标文件名
		String fileName=realpath.substring(realpath.lastIndexOf("\\")+1);
		//设置content-disposition响应头控制浏览器以下载的形式打开文件
		response.setHeader("content-disposition","attachment;filename="+fileName);
		//获取要下载的文件输入流
		InputStream in=new FileInputStream(realpath);
		int len=0;
		//创建数据缓存区
		byte[] buffer=new byte[1024];
		//通过response对象获取outputstream流
		OutputStream out=response.getOutputStream();
		//将outputstream流写入到buffer缓存区
		while((len=in.read(buffer))>0){
			out.write(buffer, 0, len);
		}
		in.close();
	}

}
