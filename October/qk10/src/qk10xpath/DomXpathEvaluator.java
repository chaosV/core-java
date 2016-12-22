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
			//����һ���ļ���������
			DocumentBuilderFactory factory=DocumentBuilderFactory.newInstance();
			//����һ���ļ���������ʵ��
			DocumentBuilder builder = factory.newDocumentBuilder();
			//ͨ�������������ļ� ��document������
			Document document=builder.parse("src/sample.xml");
			
			//ʹ��xpath�Ĺ����ཫ��ʵ���������һ��xpath��ʵ��
			XPath xpath=XPathFactory.newInstance().newXPath();
			//ʹ��ʵ������һ��xpath��·��
			XPathExpression xPathExpression=xpath.compile("//student[./gender='Male' and ./age=20]");
			
			
			NodeList list=(NodeList)xPathExpression.evaluate(document, XPathConstants.NODESET);
			
			//��ӡnodelist
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
