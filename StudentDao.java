package com.lti.dao;

import java.util.List;
import java.util.Map.Entry;
import java.util.Set;

import com.lti.model.Student;
import com.lti.model.Course;


public interface StudentDao {
 boolean addStudent(Student student);
 void updateStudent(Student student);
 void removeStudent(int id);
 Student findAStudent(int id);
 List<Student> viewAllStudent();
 void enroll(int studentId,int courseId);
 Set<Entry<Student,Course>> viewEnrollments();

}

