package com.entity;

public class Student {
	
	private int id;
	private String fullName;
	private String email;
	private String contact;
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Student(String fullName, String email, String contact) {
		super();
		this.fullName = fullName;
		this.email = email;
		this.contact = contact;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getFullName() {
		return fullName;
	}
	public void setFullName(String fullName) {
		this.fullName = fullName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getContact() {
		return contact;
	}
	public void setContact(String contact) {
		this.contact = contact;
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", fullName=" + fullName + ", email=" + email + ", contact=" + contact + "]";
	}
	

}
