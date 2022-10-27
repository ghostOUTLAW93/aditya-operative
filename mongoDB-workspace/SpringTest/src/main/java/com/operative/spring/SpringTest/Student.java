package com.operative.spring.SpringTest;

public class Student {

	private String name;
	private Address address;
	private int marks;
	
	Student(){
		super();
	}

	public Student(String name, Address address, int marks) {
		super();
		this.name = name;
		this.address = address;
		this.marks = marks;
	}

	

	void show() {
		System.out.println(name+" "+marks+""+address);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public int getMarks() {
		return marks;
	}

	public void setMarks(int marks) {
		this.marks = marks;
	}

	@Override
	public String toString() {
		return "Student [ address=" + address.toString() + "]";
	}

}
	
	

