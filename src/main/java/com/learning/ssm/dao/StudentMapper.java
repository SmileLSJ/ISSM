package com.learning.ssm.dao;

import org.springframework.stereotype.Repository;

import com.learning.ssm.pojo.Student;


public interface StudentMapper {

	public Student findUser(String name);
}
