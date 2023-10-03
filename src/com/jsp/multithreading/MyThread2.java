package com.jsp.multithreading;

public class MyThread2 extends Thread{
	
	@Override
	public void run() {
		
		for(int i=100;i>=1;i--) {
			System.out.println(i);
			
			try {
				Thread.sleep(400);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}
		

}
