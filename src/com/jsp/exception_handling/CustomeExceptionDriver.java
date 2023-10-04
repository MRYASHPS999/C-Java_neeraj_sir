package com.jsp.exception_handling;

import java.util.Scanner;

public class CustomeExceptionDriver {
	
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter age: ");
		
		int age=sc.nextInt();
		sc.close();
		
		
			
			if(age<20) {
				try {
					throw new UnderAgeLImitException();
				} catch (UnderAgeLImitException e) {
				e.printStackTrace();
				System.out.println(e.getMessage());
				}
			}
			
			else 
				if(age>40) {
					try {
						throw new OverAgeLimitException();
					} catch (OverAgeLimitException e) {
						e.printStackTrace();
						System.out.println(e.getMessage());
					}
			}else
				System.out.println("Eligible,good to go");
		}
		
		
	}


