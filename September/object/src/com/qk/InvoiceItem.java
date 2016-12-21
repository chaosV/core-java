package com.qk;

public class InvoiceItem {
	public static String id;


	public static String desc;
	int qty;
	double unitPrice;
	
	
	public InvoiceItem(String id,String desc){
		this.id=id;
		this.desc=desc;
	}
	
	public InvoiceItem(String id,String desc,int qty,double unitPrice){
		this.id=id;
		this.desc=desc;
		this.qty=qty;
		this.unitPrice=unitPrice;
	}
	
	
	public String getId() {
		return id;
	}
	
	
	public String getDesc() {
		return desc;
	}
	
	public int getQty() {
		return qty;
	}
	
	public void setQty(int qty){
		this.qty=qty;
	}
	
	public double getUnitPrice(double unitprice){
		return unitPrice;
	}
	
	public void setUnitprice(double unitPrice){
		this.unitPrice=unitPrice;
	}
	
	public double getTotal(int qty,double unitPrice){
		return qty*unitPrice;
	}
	
	public String toString(){
		return "InvoiceItem[id=?,desc=?,qty=?,unitprice=?]";
	}
}
