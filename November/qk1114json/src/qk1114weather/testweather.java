package qk1114weather;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class testweather {

	public static void main(String[] args) {
		String httpUrl = "http://apis.baidu.com/apistore/weatherservice/citylist";
		String httpArg = "cityname=%E6%9C%9D%E9%98%B3";
		String jsonResult = request(httpUrl, httpArg);
		
		System.out.println(unicode2String(jsonResult));
		
	}

	public static String request(String httpUrl, String httpArg) {
		BufferedReader reader = null;
		String result = null;
		StringBuffer sbf = new StringBuffer();
		httpUrl = httpUrl + "?" + httpArg;

		try {
			URL url = new URL(httpUrl);
			HttpURLConnection connection = (HttpURLConnection) url.openConnection();
			connection.setRequestMethod("GET");
			connection.setRequestProperty("apikey", "6b1d6a0dc0e0b230a96148077c45bd93");
			connection.connect();
			InputStream is = connection.getInputStream();
			reader = new BufferedReader(new InputStreamReader(is, "UTF-8"));
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