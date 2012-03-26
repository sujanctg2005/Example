package com.example.springscope;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

@Service("userService")
@Scope("prototype")  // default singleton
public class User {
	private Integer id;
	private String userName;

	public int getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}
   public String toString(){
	   return "[ ID : "+id+" Name :"+userName+"]";
   }
}
