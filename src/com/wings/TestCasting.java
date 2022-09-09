package com.wings;

public class TestCasting {
	
	public static void main(String[] args) {
		
		Parent obj1 = new Parent();
		obj1.show();
		
		Child obj2 = new Child();
		obj2.show();
		
		Parent obj3 = new Child();
		obj3.show();
		
//		Child obj4 = (Child) new Parent();  //downcasting is not possible
//		obj4.show();
		
//		Child obj6 = (Child) obj1;   //downcasting is not possible
//		obj6.show();
		
		Child obj5 = (Child) obj3;
		obj5.show();
	}

}
