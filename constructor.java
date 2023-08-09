
public class constructor {
constructor(){
	System.out.println("i am default constructor");
}
constructor(int a,int b){
	System.out.println(a+b);
}
void dispaly(){
	System.out.println("i am method ");
}
	public static void main(String[] args) {
		constructor c=new constructor();
		constructor c1=new constructor(4,5);		
		c.dispaly();
		c1.dispaly();
	}

}
