package com.telusko.SpringJDBCEx.repo;

import com.telusko.SpringJDBCEx.model.Student;
import org.springframework.stereotype.Repository;

@Repository
public class StudentRepo {
    public void save(Student s) {
        System.out.println("added");
    }
}
