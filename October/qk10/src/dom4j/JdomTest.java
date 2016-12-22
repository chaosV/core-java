package dom4j;

import java.io.IOException;
import java.util.List;

import org.jdom2.Document;
import org.jdom2.Element;
import org.jdom2.JDOMException;
import org.jdom2.input.SAXBuilder;

public class JdomTest {

	public static void main(String[] args) {
		try {
			long start=System.currentTimeMillis();
			// TODO Auto-generated method stub
			SAXBuilder builder = new SAXBuilder();  //����document����
			Document document = builder.build("src/sample.xml");   
			Element root = document.getRootElement();   //��ȡ���ڵ�
			List<Element> children = root.getChildren();
			for (Element child : children) {
				if (!"student".equals(child.getName())) {
					continue;
				}
				System.out.println(">>>>>>Student<<<<<<<<");
				System.out.println("id" + child.getAttributeValue("id"));
				System.out.println("name" + child.getChildText("name"));
				System.out.println("gender:" + child.getChildText("gender"));
				System.out.println("age:" + child.getChildText("age"));

			}
			long end=System.currentTimeMillis();
			System.out.println("time cost:"+(end-start)+"ms");
		} catch (JDOMException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
