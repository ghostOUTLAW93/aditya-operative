package com.pojo;

import java.util.Iterator;
import java.util.List;

public class Question {

	private int q_id;
	private String q_name;
	private List<Answer> ans;
	
	public Question() {
		super();
	}
	
	public Question(int q_id, String q_name, List<Answer> ans) {
		super();
		this.q_id = q_id;
		this.q_name = q_name;
		this.ans = ans;
	}

	@Override
	public String toString() {
		return "Question [q_id=" + q_id + ", q_name=" + q_name + ", ans=" + ans + "]";
	}
	
	public int getQ_id() {
		return q_id;
	}

	public void setQ_id(int q_id) {
		this.q_id = q_id;
	}

	public String getQ_name() {
		return q_name;
	}

	public void setQ_name(String q_name) {
		this.q_name = q_name;
	}

	public List<Answer> getAns() {
		return ans;
	}

	public void setAns(List<Answer> ans) {
		this.ans = ans;
	}

	public void display() {
		System.out.println("Que: "+q_id+". "+q_name);
		Iterator<Answer> itr = ans.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
	}
}
