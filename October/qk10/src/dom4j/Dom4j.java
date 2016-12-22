package dom4j;


import java.io.File;
import java.util.Iterator;

import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;

public class Dom4j {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SAXReader reader=new SAXReader();
		try {
			long start=System.currentTimeMillis();
			Document document=reader.read(new File("src/sample.xml"));
			Element root=document.getRootElement();
			@SuppressWarnings("unchecked")
			Iterator<Element> iterator=root.elementIterator();
			while(iterator.hasNext()){
				Element child=iterator.next();
				if(!"student".equals(child.getName())){
					continue;
				}
				
				System.out.println(">>>>>>Student<<<<<<<<");
				System.out.println("id:" + child.attributeValue("id"));
				System.out.println("name:" + child.elementText("name"));
				System.out.println("gender:" + child.elementText("gender"));
				System.out.println("age:" + child.elementText("age"));
			}
			long end=System.currentTimeMillis();
			System.out.println("time cost:"+(end-start)+"ms");
		} catch (DocumentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
