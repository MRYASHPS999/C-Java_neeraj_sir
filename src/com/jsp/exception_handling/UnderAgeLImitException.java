package com.jsp.exception_handling;



public class UnderAgeLImitException extends RuntimeException{
	
	@Override
	public String getMessage() {
		return "Age cannot be below 20";
	}

}
