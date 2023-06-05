package com.entity;

public class Student {
	
	private int id;
	private String fullName;
	private String email;
	private String contact;
	private int age;
	
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Student(String fullName, String email, String contact,int age) {
		super();
		this.fullName = fullName;
		this.email = email;
		this.contact = contact;
		this.age = age;
	}
	
	
	public Student(int id, String fullName, String email, String contact, int age) {
		super();
		this.id = id;
		this.fullName = fullName;
		this.email = email;
		this.contact = contact;
		this.age = age;
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
	
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", fullName=" + fullName + ", email=" + email + ", contact=" + contact + ", age="
				+ age + "]";
	}
	

}
