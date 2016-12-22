package com.qk10;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.soap.Node;
import javax.xml.xpath.XPath;
import javax.xml.xpath.XPathConstants;
import javax.xml.xpath.XPathExpression;
import javax.xml.xpath.XPathFactory;

import org.w3c.dom.Document;
import org.w3c.dom.NodeList;

public class DomXpathEvaluator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
//		DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
//		DocumentBuilder builder = factory.newDocumentBuilder();
//		Document document =  builder.parse("sample.xml");
//		XPath xpath = XPathFactory.newInstance().newXPath();
//		XPathExpression xpathExpression = xpath.compile("//student[./gender='Male']");
//		NodeList list = (NodeList) xpathExpression.evaluate(document, XPathConstants.NODESET);
//		for(int index=0;index<list.getLength();index++){
//			//Node node=list.item(index);
//			String id=node.getAttributes().getNamedItem("id").getNodeValue();
//			System.out.println("Student id: "+id);
//			NodeList childNodes=node.getChildNodes();
//			for(int i=0;i<childNodes.getLength();i++){
//				Node childNade=childNodes.item(i);
//				if(childNode.getNadeType() !=Node.ELEMENT_NODE){
//					continue; 
//				}
//			}
//			
//		}
	}

}
