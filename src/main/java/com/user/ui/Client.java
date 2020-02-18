package com.user.ui;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.Scanner;

import com.user.Collection.CollectionUtil;
import com.user.Service.UserService;
import com.user.Service.Validation;
import com.user.bean.User;
import com.user.dao.UserDao;

public class Client {
	
	public static void main(String [] args)
	{
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		UserService service= new UserService();
		User user= new User();
		System.out.println("=======Welcome=======");
		System.out.println("Default UserRole Is: Cutomer");
 
		System.out.println("Enter Your Name");
		while(true) {
			try {
				String name= br.readLine();	
				boolean b= Validation.validatename(name, Validation.namepattern);
				if(b==true) {
				user.setUserName(name);
				break;
				}
				else
					System.out.println("Wrong name! Enter avalid name again!");
				} catch (IOException e2) {
				// TODO Auto-generated catch block
				e2.printStackTrace();
				}
			}
			System.out.println("Enter Gender");
			String gender;
			try {
				gender = br.readLine();
				user.setGender(gender);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			System.out.println("Enter your Age");
			try {
					String age= br.readLine();
					user.setUserAge(Integer.parseInt(age));
				
			} catch (IOException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			
			
			while(true) {
				System.out.println("Enter Your Mobile Number");
				String MobileNumber;
				
				try {
					MobileNumber = br.readLine();
					BigInteger big;
					boolean b1= Validation.validatePhoneN(MobileNumber, Validation.phoneNumberpattern);
					if(b1==true)
					{ 
						big= new BigInteger(MobileNumber);
						user.setContactNo(big);
						break;
					}
					else
					{
						System.out.println("Enter Again");
					}
					} catch (IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
			
			}
			while(true) {
					System.out.println("Enter your EmailId");
					String email;
					try {
						email = br.readLine();
						boolean b2= Validation.validateEmail(email, Validation.emailpattern);
						if(b2==true)
						{
							user.setUserEmail(email);
							break;
						}
						else
							System.out.println("Enter Again");
					} catch (IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
			}
			while(true) {
				System.out.println("Enter your Password");
				String password;
				try {
					password = br.readLine();
					boolean b3= Validation.validatePassword(password, Validation.passwordpattern);
					if(b3==true)
					{
						break;}
					else
						System.out.println("Enter Again");
					}
				catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			System.out.println();
			System.out.println("---Congrats! You are In---");
	
			System.out.println("System is Sending you to apointment Module..... ");
			UserService s=new UserService();
			s.makeAppointment();
	}
}
