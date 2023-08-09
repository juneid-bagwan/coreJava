

class triangle1{
	void area(int l,int b){
		System.out.println("area of triangle is:"+(l*b));
	}
}
public class Circle_draw extends triangle1{
void area(int r){
		
		System.out.println("area of circle is:"+(3.14*r*r));
		
		
	}
	public static void main(String[] args) {
		Circle_draw d=new Circle_draw();
		d.area(5);
		d.area(7,8);
	}

}
