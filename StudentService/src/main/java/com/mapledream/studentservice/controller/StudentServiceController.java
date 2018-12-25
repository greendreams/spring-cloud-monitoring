package com.mapledream.studentservice.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.mapledream.studentservice.model.Student;

@RestController
public class StudentServiceController {

	private static final Map<Integer, Student> studentData = new HashMap<Integer,Student>();
		 
    @RequestMapping(value = "/findStudentDetails/{studentId}", method = RequestMethod.GET)
    public Student getStudentDetails(@PathVariable int studentId) {
        System.out.println("Getting Student details for " + studentId);
        
        studentData.put(111,new Student(111,"Student1"));
    	studentData.put(222,new Student(222,"Student2"));
  
        Student student = studentData.get(studentId);
        if (student == null) {
             
        	student = new Student(0, "N/A");
        }
        return student;
    }
}
