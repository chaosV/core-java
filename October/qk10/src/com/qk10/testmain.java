package com.qk10;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class testmain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			InputStream input=new FileInputStream("sample.xml");
			List<Map<String,String>>
			lists=SaxParserHandler.getXML(input,"student");
			for(Map<String,String> map:lists){
				for(Entry<String, String> entry:map.entrySet()){
					System.out.println("key:"+entry.getKey()+",value="+entry.getValue());
				}
			}
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
