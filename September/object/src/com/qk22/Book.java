package com.qk22;

public class Book {

	public String name;
	public Author author;
	public Author email;
	public double price;
	public int qty = 0;


	public Book(String name, Author author, double price) {
		this.name = name;
		this.author = author;
		this.price = price;
	}

	public Book(String name, Author author, double price, int qty) {
		this.name = name;
		this.author = author;
		this.price = price;
		this.qty = qty;
	}

	public String getName() {
		return name;
	}

	public Author getAuthor() {
		return author;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public int getQty() {
		return qty;
	}

	public String toString() {
		return ("Book[name= " + name + " ,Author[name= " + author.getName() + " ,email= " + author.getEmail() + " ,gender= "
				+ author.getGender() + "],price= " + price + " ,qty= " + qty + "]");
	}

}
