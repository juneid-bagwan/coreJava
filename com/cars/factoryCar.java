package com.cars;



public class factoryCar {

	 coreCar  getcar(int a) {
		 if(a==1) {
				return new lamborgini();
			}
			else if(a==2) {
				return new porshe();
			}
			else if(a==3) {
				return new pagani();
			}
			else {
				System.out.println("type someting");
			}
		return null;

	}

}
