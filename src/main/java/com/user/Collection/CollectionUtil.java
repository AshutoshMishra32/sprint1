package com.user.Collection;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

import com.user.bean.DiagnosticCenter;
import com.user.bean.User;

public class CollectionUtil {
	
	public static ArrayList<String>TestCentres= new ArrayList<String>();
	static {
		//TestCentres.add(new DiagnosticCenter("abc"));
		TestCentres.add("Apex Diagnostic");
		TestCentres.add("Mishra Diagnostic");
		TestCentres.add("MediLife Diagnostic");
		TestCentres.add("Medica Superspecialty");
		TestCentres.add("Remedy Multispeciallity");
	}
	
	public static Map<String,List<String>> TestType=new HashMap<String, List<String>>();
	static
	{	
		List<String> s=new ArrayList<String>();
		s.add("Biopsy");
		s.add("Blood Pressure");
		s.add("Blood Tests");
		s.add("Breathing Rate");
		List<String> s1=new ArrayList<String>();
		s1.add("Hemoglobin A1c");
		s1.add("Kidney Tests");
		s1.add("MRI Scans");
		s1.add("Blood Tests");
		List<String> s2= new ArrayList<String>();
		s2.add("X-Rays");
		s2.add("Nuclear Scans");
		s2.add("Colonoscopy");
		s2.add("Thyroid Tests");
		List<String> s3= new ArrayList<String>();
		s3.add("X-Rays");
		s3.add("Blood Pressure");
		s3.add("Breathing Rate");
		s3.add("Kidney Tests");
		List<String> s4= new ArrayList<String>();
		s4.add("X-Rays");
		s4.add("Colonoscopy");
		s4.add("MRI Scans");
		s4.add("Breathing Rate");
			TestType.put(TestCentres.get(0), s);
			TestType.put(TestCentres.get(1), s1);
			TestType.put(TestCentres.get(2), s2);
			TestType.put(TestCentres.get(3), s3);
			TestType.put(TestCentres.get(4), s4);
	}
}

	

