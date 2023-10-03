package com.jsp.arrays_programming;

import java.util.Scanner;

public class BubbleSort {
	
	public static int[] bubbleSort(int arr[]) {
		
		
		for(int i=0;i<arr.length;i++) {
			for(int j=0;i<arr.length-1-i;i++) {
				
				if(arr[j]<arr[j+1]) {
					int temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
					
					
				}
				
			}
		}
		
			
			return arr;
		}
	

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int a[]=new int[6];
		
		for(int i=0;i<a.length;i++) {
			System.out.println("Enter Elements: ");
			a[i]=sc.nextInt();
			
		}
		
		
	int res[]=bubbleSort(a);
		
		for(int i=0;i<a.length;i++) {
			System.out.println(res+" ");
		}
	}

}
