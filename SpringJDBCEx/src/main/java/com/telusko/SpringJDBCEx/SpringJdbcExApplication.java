package com.telusko.SpringJDBCEx;

import com.telusko.SpringJDBCEx.model.Student;
import com.telusko.SpringJDBCEx.service.StudentService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import java.util.List;

@SpringBootApplication
public class SpringJdbcExApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(SpringJdbcExApplication.class, args);

		Student student = context.getBean(Student.class);
		student.setName("Tabassum");
		student.setRollNo(7);
		student.setMarks(95);

		StudentService studentService = context.getBean(StudentService.class);

		studentService.addStudent(student);

		List<Student> studentList = studentService.findAll();
		System.out.println(studentList);
	}

}
