package qk1022;

import java.util.HashMap;
import java.util.Map;

public class BeSuperApplication {
	
 /*	private static BeSuperApplication instance =new BeSuperApplication();   //饿汉模式
	
	private BeSuperApplication(){
		
	}
	
	public static BeSuperApplication getInstance(){
		return instance;
	}
	
	*/
	
	/*private static synchronized BeSuperApplication instance = null;   //懒汉模式   保证实例化一次 （同步锁保证线程安全）
	
	private BeSuperApplication(){
		
	}
	
	public static BeSuperApplication getInstance(){
		if(instance==null){
			instance=new BeSuperApplication();
		}
		
		
		return instance;
	}   
	*/
	
	
	private static  BeSuperApplication instance = null;   //登记模式

	private static Map<String,BeSuperApplication> instanceMap=new HashMap<>();
	
	private BeSuperApplication(){
		
	}
	
	public static BeSuperApplication getInstance(){
		if(instance==null){
			instance=new BeSuperApplication();
		}
		
		
		return instance;
	}
	
	public static synchronized BeSuperApplication getInstance(String identifier){
		if(instanceMap.get(identifier)==null){
			instanceMap.put(identifier,new BeSuperApplication());
		}
		return instanceMap.get(identifier);
	}
}
