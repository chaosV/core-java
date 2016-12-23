package qktravel;

import java.util.Set;

public class Data {
	
	private Set<travelBooks> books;
	private String count;
	
	public String getCount() {
		return count;
	}
	public void setCount(String count) {
		this.count = count;
	}
	public Set<travelBooks> getBooks() {
		return books;
	}
	public void setBooks(Set<travelBooks> books) {
		this.books = books;
	}
	@Override
	public String toString() {
		return "Data [books=" + books + ",count=" + count + "]";
	}
	
	
}
