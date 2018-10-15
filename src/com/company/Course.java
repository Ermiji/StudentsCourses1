package com.company;

import java.util.ArrayList;
import java.util.List;

public class Course {
    private String idNumber;
    private String courseName;

    private List<Student> studentsTakingThisCourse;

    private Teacher teachersForThisCourse;




    //default consturctor
    public Course() {
        studentsTakingThisCourse = new ArrayList<>();



    }

    //overloaded constructor
    public Course(String idNumber, String courseName) {
        this.idNumber = idNumber;
        this.courseName = courseName;
    }

    public void addStudent(String idNumber, String firstName, String lastName, String emailAddress)
    {
        Student s = new Student();
        s.setIdNumber(idNumber);
        s.setFirstName(firstName);
        s.setLastName(lastName);
        s.setEmail(emailAddress);
        studentsTakingThisCourse.add(s);
    }


    public void addTeacher(String idNumber, String firstName, String lastName){
        Teacher t = new Teacher();
        t.setIdNumber(idNumber);
        t.setFirstName(firstName);
        t.setLastName(lastName);
        teachersForThisCourse = t;
    }

    public String getIdNumber() {
        return idNumber;
    }

    public void setIdNumber(String idNumber) {
        this.idNumber = idNumber;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public Teacher getTeachersForThisCourse() {
        return teachersForThisCourse;
    }

    public void setTeachersForThisCourse(Teacher teachersForThisCourse) {
        this.teachersForThisCourse = teachersForThisCourse;
    }

    public List<Student> getStudentsTakingThisCourse() {
        return studentsTakingThisCourse;
    }

    public void setStudentsTakingThisCourse(List<Student> studentsTakingThisCourse) {
        this.studentsTakingThisCourse = studentsTakingThisCourse;
    }
}