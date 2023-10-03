package com.jsp.number_programming;

import java.util.Scanner;

public class PrimeNum {

	public boolean primeNum(int n) {

		int count=0;
		
		for (int i = 1; i <= n; i++) {
			if (n % i == 0 && n % 1 == 0) {
				
				count++;
			}
		}
        
		if(count==2) {
			return true;
		}
		return false;
		
	}

	public static void main(String[] args) {

		PrimeNum primeNum1 = new PrimeNum();

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number ");
		int num=sc.nextInt();
		sc.close();
		
		System.out.println(primeNum1.primeNum(num));

	}

}
