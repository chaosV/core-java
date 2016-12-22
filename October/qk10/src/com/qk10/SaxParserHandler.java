package com.qk10;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.xml.namespace.QName;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;

import org.xml.sax.Attributes;
import org.xml.sax.InputSource;
import org.xml.sax.Locator;
import org.xml.sax.SAXException;
import org.xml.sax.SAXNotRecognizedException;
import org.xml.sax.SAXNotSupportedException;
import org.xml.sax.SAXParseException;
import org.xml.sax.helpers.DefaultHandler;

public class SaxParserHandler extends DefaultHandler {
	//�洢���ڽ�����Ԫ�ص�����
	private Map<String, String> map = null;
	//�洢���н�����Ԫ��
	List<Map<String, String>> lists = null;
	// ���ڽ�����ǰԪ�ص�����
	String currentTag = null;
	// ��ǰԪ��ֵ
	String currentValue = null;
	// ��ǰԪ����
	String currentName = null;
	// ��ʼ������Ԫ��
	String nodeName;

	public SaxParserHandler(String nodeName) {
		this.nodeName = nodeName;
	}
	public List<Map<String,String>> getLists(){
		return lists;
	}
	/**
	 * ��ʼXML�ļ�����
	 */
	@Override
	public void startDocument() throws SAXException {
		System.out.println("startXml");
		//��ʼ��map
		lists = new ArrayList<Map<String,String>>();
	}

	/**
	 * ÿһ��Ԫ�ؿ�ʼ����
	 * 
	 */
	@Override
	public void startElement(String uri, String localName, String qName, Attributes attributes) throws SAXException {
		// �жϵ�ǰ��Ԫ���ǲ���Ҫ��ʼ������Ԫ��
		if (qName.equals(nodeName)) {
			map = new HashMap<String,String>();
		}
		// ��ȡ����
		if (attributes != null && map != null) {
			for (int i = 0; i < attributes.getLength(); i++) {
				map.put(attributes.getQName(i), attributes.getValue(i));
			}
		}

	}

	/**
	 * ����ÿ��Ԫ�ص�����
	 */

	@Override
	public void characters(char[] ch, int start, int length) throws SAXException {
		if (currentTag != null && map != null) {
			// ȡ������
			currentValue = new String(ch, start, length);
			// �ո���ͻ��з�ȥ��
			if (currentValue != null && currentValue.trim().equals("") && !currentValue.trim().equals("\n")) {
				map.put(currentTag, currentValue);

			}
			// �ÿգ���ʼ��һ��
			currentTag = null;
			currentValue = null;
		}

	}

	@Override
	public void endDocument() throws SAXException {
		
	}

	@Override
	public void endElement(String uri, String localName, String qName) throws SAXException {
		if (qName.equals(nodeName)) {
			lists.add(map);
			map=null;
		}
	}



}
