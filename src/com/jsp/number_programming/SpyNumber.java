package com.jsp.number_programming;

import java.util.Scanner;

public class SpyNumber {
	
	public boolean isSpyNum(int n) {
		
		int sum=0;
		int pro=1;
		
		while(n>0) {
			int lastDigit=n%10;
			sum=sum+lastDigit;
			pro=pro*lastDigit;
			
			n=n/10;
		}
		
		if(sum==pro) {
			return true;
		}else {
			return false;
		}
		
		
	}
	
	public static void main(String[] args) {
		
		SpyNumber spyNumber=new SpyNumber();
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter a number ");
		int num=sc.nextInt();
		sc.close();
		
		System.out.println(spyNumber.isSpyNum(num));
		
		
	}

}
