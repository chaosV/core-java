package qktravel;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

import com.google.gson.Gson;

public class Testtrival {

	public static void main(String[] args) {
		String httpUrl ="http://apis.baidu.com/qunartravel/travellist/travellist";
		String httpArg ="query=%22%22&page=1";
		String jsonResult = request(httpUrl, httpArg);
		Gson gson=new Gson();
		TravelDate td=gson.fromJson(jsonResult, TravelDate.class);
		System.out.println(td);
		

	}

	public static String request(String httpUrl, String httpArg) {
		BufferedReader reader = null;
		String result = null;
		StringBuffer sbf = new StringBuffer();
		httpUrl = httpUrl + "?" + httpArg;

		try {
			URL url = new URL(httpUrl);
			HttpURLConnection connection = (HttpURLConnection) url.openConnection();  	//打开链接
			connection.setRequestMethod("GET");   //设置请求方式
			connection.setRequestProperty("apikey", "6b1d6a0dc0e0b230a96148077c45bd93");   //设置通用属性
			connection.connect();   //建立连接
			InputStream is = connection.getInputStream();		//获取输入流并处理
			reader = new BufferedReader(new InputStreamReader(is, "UTF-8"));		//读取流内容
			String strRead = null;
			while ((strRead = reader.readLine()) != null) {
				sbf.append(strRead);
				sbf.append("\r\n");
			}
			reader.close();
			result = sbf.toString();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return result;
	}
	public static String unicode2String(String unicode){
		StringBuffer string=new StringBuffer();
		int index=0;
		index=unicode.indexOf("\\u");
		while(index>=0){
			string.append(unicode.substring(0,index));
			String hex=unicode.substring(index+2, index+6);
			string.append((char)Integer.parseInt(hex,16));
			unicode=unicode.substring(index+6);
			index=unicode.indexOf("\\u");
		}
		string.append(unicode);
		return string.toString();
	}
}
