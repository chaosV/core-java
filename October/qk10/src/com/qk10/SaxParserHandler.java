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
	//存储正在解析的元素的数据
	private Map<String, String> map = null;
	//存储所有解析的元素
	List<Map<String, String>> lists = null;
	// 正在解析当前元素的名字
	String currentTag = null;
	// 当前元素值
	String currentValue = null;
	// 当前元素名
	String currentName = null;
	// 开始解析的元素
	String nodeName;

	public SaxParserHandler(String nodeName) {
		this.nodeName = nodeName;
	}
	public List<Map<String,String>> getLists(){
		return lists;
	}
	/**
	 * 开始XML文件解析
	 */
	@Override
	public void startDocument() throws SAXException {
		System.out.println("startXml");
		//初始化map
		lists = new ArrayList<Map<String,String>>();
	}

	/**
	 * 每一个元素开始解析
	 * 
	 */
	@Override
	public void startElement(String uri, String localName, String qName, Attributes attributes) throws SAXException {
		// 判断当前的元素是不是要开始解析的元素
		if (qName.equals(nodeName)) {
			map = new HashMap<String,String>();
		}
		// 读取属性
		if (attributes != null && map != null) {
			for (int i = 0; i < attributes.getLength(); i++) {
				map.put(attributes.getQName(i), attributes.getValue(i));
			}
		}

	}

	/**
	 * 解析每个元素的内容
	 */

	@Override
	public void characters(char[] ch, int start, int length) throws SAXException {
		if (currentTag != null && map != null) {
			// 取出内容
			currentValue = new String(ch, start, length);
			// 空格符和换行符去掉
			if (currentValue != null && currentValue.trim().equals("") && !currentValue.trim().equals("\n")) {
				map.put(currentTag, currentValue);

			}
			// 置空，开始下一个
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
