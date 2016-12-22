package qk1022;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

public class PropertyManager1 {
	//用登记模式改写
	private static Map<String,PropertyManager1> propsMap=new HashMap<>();
	
	public static synchronized PropertyManager1 getInstance(String propsFile){
		if(!propsMap.containsKey(propsFile)){
			propsMap.put(propsFile, new PropertyManager1(propsFile));
		}
		
		return propsMap.get(propsFile);
	}
	
	private Properties props;
	
	private PropertyManager1(String propFile){
		
		try {
			props=new Properties();
			props.load(new FileInputStream(propFile));
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
	
	public String getProperty(String key){
		return null;
	}
	
	public String[] getPropertyList(String key){
		return null;
	}
}
