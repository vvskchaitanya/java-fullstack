package com.vvsk.fullstack.custom;

/**
 * Demonstrate User Defined Exception using Customer Class
 */
public class Customer {
	
	private Integer id;
	
	private String name;
	
	private Integer age;
	
	private Character gender;
	
	private String email;
	
	private String mobile;
	
	private String address;
	
	private Boolean active;

	public Customer(Integer id, String name, Integer age, Character gender, Boolean active) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
		this.gender = gender;
		this.active = active;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public Character getGender() {
		return gender;
	}

	public void setGender(Character gender) {
		this.gender = gender;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}
	
	

	public Boolean getActive() {
		return active;
	}

	public void setActive(Boolean active) {
		this.active = active;
	}

	@Override
	public String toString() {
		return "Customer [id=" + id + ", name=" + name + ", age=" + age + ", gender=" + gender + ", email=" + email
				+ ", mobile=" + mobile + ", address=" + address + "]";
	}
	
	
	
	

}
