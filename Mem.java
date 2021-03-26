package com.mona.servlets;


public class Mem 
{
	 String uname;
	 String password;
	 String cno;
	 String email;

	public Mem() {
		super();
	}

	public Mem(String uname, String password, String cno, String email) {
		super();
		this.uname = uname;
		this.password = password;
		this.cno = cno;
		this.email = email;
	}

	public String getUname() {
		return uname;
	}

	public void setUname(String uname) {
		this.uname = uname;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getContact() {
		return cno;
	}

	public void setContact(String cno) {
		this.cno = cno;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
	
	

}

