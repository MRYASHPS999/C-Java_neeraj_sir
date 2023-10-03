package com.jsp.pattern_programming;

public class Pattern7 {
	
	//E D C B A 
	//E D C B A 
	//E D C B A 
	//E D C B A 
	//E D C B A 
	
	public static void main(String[] args) {
		int n=5;
		for(int i=1;i<=n;i++) {
			for(int j=n;j>=1;j--) {
				System.out.print((char)(j+64)+" ");
			}
			System.out.println(" ");
		}
	}

}
