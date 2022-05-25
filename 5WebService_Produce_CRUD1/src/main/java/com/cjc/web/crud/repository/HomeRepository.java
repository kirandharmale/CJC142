package com.cjc.web.crud.repository;




import javax.transaction.Transactional;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.cjc.web.crud.model.Student;

@Repository
public interface HomeRepository   extends CrudRepository<Student, Integer> {
	
	public Student findAllByunameAndPass(String uname, String pass);
	@Transactional   
	//without this annotation getting following error hence added this annotation @transactional
	// No EntityManager with actual transaction available for current thread - cannot reliably process 'remove' call
	public void deleteByUid(int uid);
	
	
	
}
