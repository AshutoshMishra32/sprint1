package com.user.bean;

import java.math.BigInteger;

public class User {
	
	private String userRole;
	private String userName;
	private BigInteger contactNo;
	private String userEmail;
	private int userAge;
	private String gender;
	private String Test_centre;
	private String Test_Type; 
	
	public User()
	{
		
	}

	public User(String userName, BigInteger contactNo, String userEmail, int userAge, String gender) {
		super();
		this.userRole="Customer";
		this.userName = userName;
		this.contactNo = contactNo;
		this.userEmail = userEmail;
		this.userAge = userAge;
		this.gender = gender;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public BigInteger getContactNo() {
		return contactNo;
	}

	public void setContactNo(BigInteger contactNo) {
		this.contactNo = contactNo;
	}

	public String getUserEmail() {
		return userEmail;
	}

	public void setUserEmail(String userEmail) {
		this.userEmail = userEmail;
	}

	public int getUserAge() {
		return userAge;
	}

	public void setUserAge(int userAge) {
		this.userAge = userAge;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getTest_centre() {
		return Test_centre;
	}

	public void setTest_centre(String test_centre) {
		Test_centre = test_centre;
	}

	public String getTest_Type() {
		return Test_Type;
	}

	public void setTest_Type(String test_Type) {
		Test_Type = test_Type;
	}
	
	
	
	

}
