package prototype;

import java.util.ArrayList;
import java.util.List;

public class bookShop implements Cloneable{
	private String shopName;
	List<bookPojo> books = new ArrayList<bookPojo>();

	@Override
	public String toString() {
		return "bookShop [shopName=" + shopName + ", books=" + books + "]";
	}

	public String getShopName() {
		return shopName;
	}

	public void setShopName(String shopName) {
		this.shopName = shopName;
	}

	public List<bookPojo> getBooks() {
		return books;
	}

	public void setBooks(List<bookPojo> books) {
		this.books = books;
	}

	public void loadData() {
		for(int i=0;i<10;i++) {
			bookPojo b=new bookPojo();
			b.setBid(i);
			b.setBname("book"+i);
			getBooks().add(b);
		}
	}

	@Override
//	protected Object clone() throws CloneNotSupportedException {
//		return super.clone();
//	}
	
	
	
	protected bookShop clone() {
		bookShop shop=new bookShop();
		for(bookPojo b:this.getBooks()) {
			shop.getBooks().add(b);
		}
		return shop;
		
	}
}
