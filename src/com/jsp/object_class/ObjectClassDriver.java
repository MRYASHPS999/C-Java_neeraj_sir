package com.jsp.object_class;

public class ObjectClassDriver   {
	
	public static void main(String[] args) {
		
		
		
		ObjectClassProgram objectClassProgram=new ObjectClassProgram(1, "abc", "abc@mail.com");
		
		ObjectClassProgram objectClassProgram2=new ObjectClassProgram(1, "abc", "abc@mail.com");
		
		System.out.println(objectClassProgram.hashCode());
		System.out.println(objectClassProgram2.hashCode());
		
		System.out.println(objectClassProgram.equals(objectClassProgram2));
		
		
	}

}
