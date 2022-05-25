package com.cjc.web.crud.service;

import java.util.Iterator;


import com.cjc.web.crud.model.Student;

public interface HomeService {

	public Iterable<Student> displayAllData();
	public Student loginCheck(String un, String ps);
	public Student saveData(Student s);
	public void deleleData(int uid);
	
	

	


	

}