package com.cjc.web.crud.controller;

import java.util.Iterator;


import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.cjc.web.crud.model.Student;
import com.cjc.web.crud.service.HomeService;

@RestController
public class HomeController {
@Autowired
HomeService hs;


//get All Data
@RequestMapping(value="/getAllData",method = RequestMethod.GET)
public Iterable<Student> getAllData( )
{
	
	Iterable<Student> itr =hs.displayAllData();
	
	return  itr;
}

//To get Single data

@RequestMapping(value="/login/{uname}/{pass}",method = RequestMethod.GET)
public Student loginCheck(@PathVariable("uname") String un, @PathVariable("pass") String ps)
{
	Student st=hs.loginCheck(un, ps);
	return st;
}

@RequestMapping(value="/saveData" ,method = RequestMethod.POST)
public Student registerData(@RequestBody Student s)
{
	Student st=	hs.saveData(s);
	return st;
	
	
}

@RequestMapping(value="/deleteData/{uid}", method=RequestMethod.DELETE)
public Iterable<Student> deleteData(@PathVariable("uid")int uid)
{
	hs.deleleData(uid);
	Iterable<Student> itr =hs.displayAllData();
	return itr;
}

@RequestMapping(value="/updateData/{uid}",method = RequestMethod.PUT)
public Iterable<Student> updatePage(@PathVariable("uid")int uid, @RequestBody Student s)
{   
	System.out.println(uid);
	System.out.println(s.getUid());
	hs.saveData(s);
	Iterable<Student>itr=hs.displayAllData();
	return itr;
	
}

}




	

