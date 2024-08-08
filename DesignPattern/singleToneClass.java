package DesignPattern;

public class singleToneClass {

	public static void main(String[] args) {
		abc obj1=abc.getdata();
		abc obj2=abc.getobject();
		System.out.println(obj1+"   "+obj2);
	}

	static class abc {
		static abc obj = new abc();

		private abc() {

		}

		public static abc getdata() {
			System.out.println("get data");
			return obj;
		}

		public static abc getobject() {
			System.out.println("get object");
			return obj;
		}

	}

}
