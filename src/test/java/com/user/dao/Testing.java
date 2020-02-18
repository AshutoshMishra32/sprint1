package com.user.dao;
import static org.junit.Assert.assertTrue;
import org.junit.jupiter.api.Test;
import com.user.Service.Validation;

class Testing {
	Validation v1=new Validation();
	@Test
	void test1()
	{
		boolean b=Validation.validatePhoneN("8090315933","8090315933");
		assertTrue(b);
	}
	@Test
	void test2()
	{
		boolean b= Validation.validatename("Ashu", "Ashu");
		assertTrue(b);
	}
	@Test
	void test3()
	{
		boolean b= Validation.validateEmail("asdf@gmail.com", "asdf@gmail.com");
		assertTrue(b);
	}
	
	@Test
	void test4()
	{
		boolean b= Validation.validatePassword("Asdf@1234", "Asdf@1234");
		assertTrue(b);
	}
	

}
