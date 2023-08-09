class application{
	void app1() {
		System.out.println("whatsapp");
	}
}
class iphone extends application{
 void app() {
	 System.out.println("safari");
 }
}
public class android_inheritance extends application {
void app() {
	System.out.println("playstore");
}
	public static void main(String[] args) {
iphone i=new iphone();
android_inheritance a=new android_inheritance();
i.app();
i.app1();
a.app();
	}

}
