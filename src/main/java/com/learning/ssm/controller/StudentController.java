package com.learning.ssm.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.learning.ssm.pojo.Student;
import com.learning.ssm.service.StudentService;


@Controller
@RequestMapping("/student")
public class StudentController {

	@Autowired
	private StudentService service;
	
	@RequestMapping("/{name}")
	@ResponseBody
	public Student findStudentByName(@PathVariable("name") String name){
		System.out.println("ÄãºÃ");
		Student student = service.findUserByName(name);
		System.out.println(student.toString());
		return student;
	}
	
}
