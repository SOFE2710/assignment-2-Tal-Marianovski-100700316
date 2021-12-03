package com.company;
import java.util.*;
import java.util.Vector;
public class Course extends Main{
    private Department dept;
    private String title; // title of the course (e.g. “Intro to programming”);
    private String code; // course code, e.g. SOFE, ELEE, MANE, etc.
    private int number; // course number, e.g. 1200, 2710, 2800, etc.
    private Vector <Student> classList; // contains all students registered in this course

    public Course(String code, int number, Department dept, String title)
    {
        // also initialize the classList;
        this.code = code;
        this.number = number;
        this.dept = dept;
        this.title = title;
        this.classList = new Vector<Student>();
    }
    public Department getDept()
    {
        return this.dept;
    }
    //fill in get methods
    public String getCode()
    {
        return this.code;
    }
    public int getnumber()
    {
        return this.number;
    }

    public String toString()
    {
        // return a string representation of the course with the course code,
        // name, and number of people registered in the course in the following
        // format:
        // SOFE 2710 Object Oriented Programming and Design, Enrollment = 260
        return this.code + " " + this.number + " " + this.title
                + ", Enrollment = " + (this.classList.size());
    }


}
