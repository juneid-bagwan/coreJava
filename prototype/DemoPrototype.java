package prototype;

public class DemoPrototype {

	public static void main(String[] args) throws CloneNotSupportedException {
		bookShop b = new bookShop();
		b.setShopName("azad book shop");
		b.loadData();
		bookShop b1 = (bookShop) b.clone();
		b1.setShopName("dff book shop");

		b.getBooks().remove(0);
		System.out.println(b);
		System.out.println(b1);
	}

}
