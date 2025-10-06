package com.telusko.SpringJDBCEx.service;

import com.telusko.SpringJDBCEx.model.Student;
import com.telusko.SpringJDBCEx.repo.StudentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class StudentService {

    StudentRepo studentRepo;

    public StudentRepo getStudentRepo() {
        return studentRepo;
    }

    @Autowired
    public void setStudentRepo(StudentRepo studentRepo) {
        this.studentRepo = studentRepo;
    }

    public void addStudent(Student s) {
        studentRepo.save(s);
    }

    public List<Student> findAll() {
        List<Student> studentList = new ArrayList<Student>();
        return studentList;
    }
}
