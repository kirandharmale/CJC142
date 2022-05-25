package com.cjc.web.crud.serviceIMPL;

import java.util.Iterator;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cjc.web.crud.model.Student;
import com.cjc.web.crud.repository.HomeRepository;
import com.cjc.web.crud.service.HomeService;

@Service
public class HomeServiceIMPL implements HomeService {
@Autowired
HomeRepository hr;

@Override
public Iterable<Student> displayAllData() {
	
	return  hr.findAll();
}

@Override
public Student loginCheck(String un, String ps) {
	return hr.findAllByunameAndPass(un,ps);
	
}

@Override
	public Student saveData(Student s) {
		return hr.save(s);
		
	}

@Override
public void deleleData(int uid) {
 hr.deleteByUid(uid);
	
}
}