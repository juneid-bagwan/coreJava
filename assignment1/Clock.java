package assignment1;

class Clock {
	int hr;
	int min;
	int sec;
	@Override
	public String toString() {
		return "Clock [hr=" + hr + ", min=" + min + ", sec=" + sec + "]";
	}
	Clock(){
//		setClock(0,0,0);
	}
	Clock(int hr, int min, int sec) {
		this.hr = hr;
		this.min = min;
		this.sec = sec;
	}

	
	
	public static void main(String[] args) {
		Clock k=new Clock(1,20,12);
		System.out.println(k.toString());
	}

}
