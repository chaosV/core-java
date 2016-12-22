package qk1022;

public class PropertyManager {
	
	public static void main(String[] args) {
		
	}
	private static int count=0;
	private static PropertyManager manager=null;
	
	private PropertyManager(){
		count++;
	}
	
	public static synchronized PropertyManager getInstance(){
		if(manager==null){
			manager=new PropertyManager();
			
		}
		System.out.println(count);
		return manager;
	}
	
	public String getProperty(String key){
		return null;
	}
	
	public String[] getPropertyList(String key){
		return null;
	}
}
