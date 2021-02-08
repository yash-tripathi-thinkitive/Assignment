package com.thinkitive;

public class User {
	private int id;
	private String name;
	private String password;
	private String designation;

	public User() {
		// TODO Auto-generated constructor stub
	}

	public User(int id, String name, String password, String designation) {
		super();
		this.id = id;
		this.name = name;
		this.password = password;
		this.designation = designation;
	}
	

	public User(String name, String password , String designation) {
		super();
		this.name = name;
		this.password = password;
		this.designation = designation;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

	@Override
	public String toString() {
		return "User [id=" + id + ", name=" + name + ", password=" + password + ", designation=" + designation + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		User other = (User) obj;
		if (id != other.id)
			return false;
		return true;
	}
	void user() {
		System.out.println("hello from user");
	}

}
