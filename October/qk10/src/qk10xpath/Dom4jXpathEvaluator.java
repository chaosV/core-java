package qk10xpath;



import java.util.Iterator;
import java.util.List;

import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;


public class Dom4jXpathEvaluator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
			SAXReader reader=new SAXReader();
			Document document=reader.read("src/sample.xml");
			Element root=document.getRootElement();
			
			List malelist=root.selectNodes("//student[@id='001']");
			Iterator<?> iterator=malelist.iterator();
			
			while(iterator.hasNext()){
				Element child=(Element) iterator.next();
				
				
				System.out.println(child.getStringValue());
				
//				System.out.println(">>>>>>Student<<<<<<<<");
//				System.out.println("id:" + child.attributeValue("id"));
//				System.out.println("name:" + child.elementText("name"));
//				System.out.println("gender:" + child.elementText("gender"));
//				System.out.println("age:" + child.elementText("age"));
			}
			
			
			
		} catch (DocumentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
