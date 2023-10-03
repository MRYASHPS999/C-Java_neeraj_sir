package com.jsp.number_programming;

import java.util.Scanner;

public class FactorsOfNum {
	
	public void factors(int n) {
		
		for(int i=1;i<=n;i++) {
			
			if(n%i==0) {
				System.out.println(i);
			}
			
		}
		
		
		
	}
	
	public static void main(String[] args) {
		
		FactorsOfNum factorsOfNum=new FactorsOfNum();
		
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number");
		
		int num=sc.nextInt();
		sc.close();
		
		factorsOfNum.factors(num);
		
	}

}
