package com.user.dao;

import java.text.SimpleDateFormat;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

import com.user.Collection.CollectionUtil;
import com.user.bean.User;
public class UserDao {
	 Scanner cin=new Scanner(System.in);
	 java.util.Date date2= null;
	 static CollectionUtil colu = new CollectionUtil();
	 User user= new User();
	 SimpleDateFormat myFormat = new SimpleDateFormat("dd MM yyyy");
	
	 public void getdetails()
	 {
		System.out.println("these are diaganostic centers");
		int i=0;
		String st[]=new String[CollectionUtil.TestCentres.size()+1];
		for(String s:CollectionUtil.TestCentres)
		{
			System.out.println("enter "+(++i)+"."+" to select"+" "+s);
			st[i]=s;
		}
		Scanner ss=new Scanner(System.in);
		String input=null;
		int input1=ss.nextInt();
		boolean b=false;
		for (int j = 0; j < st.length; j++) {
			if(j==input1)
			{
				input=st[j];
				b=true;
				break;
			}
		
		}
		if(b==false)
		{
			System.out.println("enter valid input");
		}
		
		i=0;
		for(Map.Entry<String, List<String>> s:CollectionUtil.TestType.entrySet())
		{
			if(s.getKey().equals(input))
			{
				System.out.println(s.getKey());
				for(String s2:s.getValue())
				System.out.println("enter "+(++i)+"."+" to select"+" "+s2);
			}
		}
		System.out.println();
		System.out.println();
		System.out.println("You have Choosen a Test");
	}
	
	public  void makeApp()
	{ 	
		getdetails();
		Scanner s1=new Scanner(System.in);
		try {
		System.out.println("Enter date and time like dd-MMM-yyy-HH:MM");
			SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MMM-yyyy-HH:MM");
			String date=s1.next();
			 date2 = dateFormat.parse(date);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Appointment status is under progress" );
	}
}
