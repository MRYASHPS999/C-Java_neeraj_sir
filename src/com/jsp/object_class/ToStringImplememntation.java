package com.jsp.object_class;

public class ToStringImplememntation {
	
	int id;
	String name;
	String email;
	
	
	public ToStringImplememntation(int id, String name, String email) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
	}


	@Override
	public String toString() {
		return "id is = " + id + ", name is=" + name + ", email is=" + email + " ";
	}
	
	
	
	

}
