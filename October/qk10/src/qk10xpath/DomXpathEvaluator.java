package qk10xpath;


import java.io.IOException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import javax.xml.xpath.XPath;
import javax.xml.xpath.XPathConstants;
import javax.xml.xpath.XPathExpression;
import javax.xml.xpath.XPathExpressionException;
import javax.xml.xpath.XPathFactory;

import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

public class DomXpathEvaluator {

	public static void main(String[] args) {
	
		 
		try {
			//建立一个文件构建工厂
			DocumentBuilderFactory factory=DocumentBuilderFactory.newInstance();
			//产生一个文件构造器的实例
			DocumentBuilder builder = factory.newDocumentBuilder();
			//通过构造器解析文件 到document对象中
			Document document=builder.parse("src/sample.xml");
			
			//使用xpath的工厂类将它实例化后产生一个xpath的实例
			XPath xpath=XPathFactory.newInstance().newXPath();
			//使用实例编译一个xpath的路径
			XPathExpression xPathExpression=xpath.compile("//student[./gender='Male' and ./age=20]");
			
			
			NodeList list=(NodeList)xPathExpression.evaluate(document, XPathConstants.NODESET);
			
			//打印nodelist
			for (int i = 0; i < list.getLength(); i++) {
				Node node =list.item(i);
				String id=node.getAttributes().getNamedItem("id").getNodeValue();
				System.out.println("Student id= "+id);
				
				NodeList childNodes=node.getChildNodes();
				for (int j = 0; j < childNodes.getLength(); j++) {
					Node childNode=childNodes.item(j);
					
					if (childNode.getNodeType()!=Node.ELEMENT_NODE) {
						continue;
					}
					String nodeName=childNode.getNodeName();
					String nodeValue=childNode.getFirstChild().getNodeValue();
					
					System.out.println(" node:"+nodeName+"="+nodeValue);
				}
				
			}
			
		} catch (ParserConfigurationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SAXException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (XPathExpressionException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

}
