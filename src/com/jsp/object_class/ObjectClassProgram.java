package com.jsp.object_class;

import java.util.Objects;

public class ObjectClassProgram {
	
	int id;
	String name;
	String email;
	
	public ObjectClassProgram(int id, String name, String email) {
		
		this.id = id;
		this.name = name;
		this.email = email;
	}
	
	
	@Override
	public String toString() {
		return "ObjectClassProgram [id=" + id + ", name=" + name + ", email=" + email + "]";
	}


	@Override
	public int hashCode() {
		return Objects.hash(id,name,email);
	}


	@Override
	public boolean equals(Object obj) {
		
		ObjectClassProgram obj1=(ObjectClassProgram) obj;
		
		if(this.id==obj1.id && this.name==obj1.name && this.email==obj1.email ) {
			return true;
			
		}
		return false;
	}
	
	
	

}
