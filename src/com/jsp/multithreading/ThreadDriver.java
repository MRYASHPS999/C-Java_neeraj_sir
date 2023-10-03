package com.jsp.multithreading;

public class ThreadDriver {
	
	public static void main(String[] args) {
		
		//Custom Thread 1
		MyThread myThread=new MyThread();
		
		Thread thread=new Thread(myThread);
		
		thread.start();
		
		//Custom Thread2
		MyThread2 myThread2=new MyThread2();
		
		myThread2.start();
	}

}
