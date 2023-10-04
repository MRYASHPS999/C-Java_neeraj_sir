package com.jsp.inheritance_programming;

public class UpcastDriver {
	
	public static void main(String[] args) {
		
		
		Upcast1 upcast1=new Upcast2();
		Upcast2 upcast2=(Upcast2) upcast1;
		
		upcast1.m1();
		upcast2.m1();
		
		//upcast1.m2();
		upcast2.m2();
		
		
		
	}
	
	
	
}
