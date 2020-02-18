package com.user.Service;

import com.user.dao.UserDao;

public class UserService {
	
	UserDao dao= new UserDao();
	public int details()
	{
		dao.getdetails();
		return 0;
	}
	public int makeAppointment()
	{
		new UserDao().makeApp();
		return 0;
	}
}