package com.servletcurd;

public class Student {
	private int id1;
	private String name1, age1, coures1, city1;

	public int getId1() {
		return id1;
	}

	public void setId1(int id1) {
		this.id1 = id1;
	}

	public String getName1() {
		return name1;
	}

	public void setName1(String name1) {
		this.name1 = name1;
	}

	public String getAge1() {
		return age1;
	}

	public void setAge1(String age1) {
		this.age1 = age1;
	}

	public String getCoures1() {
		return coures1;
	}

	public void setCoures1(String coures1) {
		this.coures1 = coures1;
	}

	public String getCity1() {
		return city1;
	}

	public void setCity1(String city1) {
		this.city1 = city1;
	}

	public Student(int id1, String name1, String age1, String coures1, String city1) {
		super();
		this.id1 = id1;
		this.name1 = name1;
		this.age1 = age1;
		this.coures1 = coures1;
		this.city1 = city1;
	}

	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Student [id1=" + id1 + ", name1=" + name1 + ", age1=" + age1 + ", coures1=" + coures1 + ", city1="
				+ city1 + "]";
	}

}