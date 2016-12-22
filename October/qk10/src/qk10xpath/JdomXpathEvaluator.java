package qk10xpath;

import java.io.IOException;
import java.util.List;

import org.jdom2.Document;
import org.jdom2.Element;
import org.jdom2.JDOMException;
import org.jdom2.input.SAXBuilder;
import org.jdom2.xpath.XPathExpression;
import org.jdom2.xpath.XPathFactory;
import org.jdom2.xpath.jaxen.JaxenXPathFactory;

public class JdomXpathEvaluator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
			SAXBuilder builder=new SAXBuilder();
			Document document=builder.build("src/sample.xml");
		
			Element root=document.getRootElement();
			XPathFactory factory=JaxenXPathFactory.instance();
			XPathExpression<Object> xpathExp=factory.compile("//student[./gender='Male']");
			List<Object> objectlist=xpathExp.diagnose(root, false).getResult();
			
			for (Object obj:objectlist) {
				Element element=(Element)obj;
				
				System.out.println("id :"+element.getAttributeValue("id"));
				System.out.println("name:"+element.getChildText("name"));
				System.out.println("gender:"+element.getChildText("gender"));
				System.out.println("age:"+element.getChildText("age"));
			}
			
			
			
			
		} catch (JDOMException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
