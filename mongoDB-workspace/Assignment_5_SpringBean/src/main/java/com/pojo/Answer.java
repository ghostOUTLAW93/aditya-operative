package com.pojo;

public class Answer {

	private int a_id;
	private String a_name;
	private String a_by;
	
	public Answer() {
		super();
	}
	
	public Answer(int a_id, String a_name, String a_by) {
		super();
		this.a_id = a_id;
		this.a_name = a_name;
		this.a_by = a_by;
	}

	@Override
	public String toString() {
		return "Ans: " + a_id + ". " + a_name + " \n--" + a_by;
	}

	
	
}
