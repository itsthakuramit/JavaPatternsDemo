package com.stackroute.patterns.builder;


public class User {
	
	
	private String firstName;
	private String lastName;
	private int age;
	private String mobile;
	private String address;
	
	
	public User(UserBuilder userBuilder) {
		this.firstName = userBuilder.firstName;
		this.lastName = userBuilder.lastName;
		this.age = userBuilder.age;
		this.mobile = userBuilder.mobile;
		this.address = userBuilder.address;
		
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
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
	@Override
	public String toString() {
		return "User [firstName=" + firstName + ", lastName=" + lastName + ", age=" + age + ", mobile=" + mobile
				+ ", address=" + address + "]";
	}
	
	public static class UserBuilder{
		
		private String firstName;
		private String lastName;
		private int age;
		private String mobile;
		private String address;

		public UserBuilder(String firstName,String lastName) {
			this.firstName = firstName;
			this.lastName = lastName;
		}
		
		public UserBuilder age(int age) {
			this.age = age;
			return this;
		}
		
		public UserBuilder mobile(String mobile) {
			this.mobile = mobile;
			return this;
		}
		
		public UserBuilder address(String address) {
			this.address = address;
			return this;
		}
		
		public User build() {
			User user = new User(this);
			validateUserObject(user);
			return user;
		}
		
		private void validateUserObject(User user) {
			
			
		}
		
	}
	
	    
}
