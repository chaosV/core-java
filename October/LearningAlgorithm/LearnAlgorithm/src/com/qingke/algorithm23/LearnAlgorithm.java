package com.qingke.algorithm23;


public class LearnAlgorithm {
	
	public static void main(String[] args) {
		LinkTable link = constructLinkTable();
		System.out.println(link);
		
		System.out.println(checkLoop(link));
		System.out.println(reverseLinkTable(link));
	}
	
	public static LinkTable constructLinkTable() {
		return new LinkTable();
	}
	
	/**
	 * 判断链表是否有环
	 */
	public static boolean checkLoop(LinkTable link) {
		return false;
	}

	/**
	 * 倒置链表
	 * @return
	 */
	public static LinkTable reverseLinkTable(LinkTable link) {
		return link;
	}

}
