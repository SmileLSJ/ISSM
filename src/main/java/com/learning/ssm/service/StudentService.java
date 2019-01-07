package com.learning.ssm.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.learning.ssm.dao.StudentMapper;
import com.learning.ssm.pojo.Student;


@Service
public class StudentService {

	@Autowired
	private StudentMapper mapper;
	
	public Student findUserByName(String name){
		return mapper.findUser(name);
	}
}
