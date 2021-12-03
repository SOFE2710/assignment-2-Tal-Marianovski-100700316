package com.company;
import java.util.*;
import java.util.Vector;
public class Department extends Main{
    private String name; // the name of school “Dept of Computing and Info Science.”
    private String id; // short name for courses “SOFE”, “ELEE”, “STAT”, etc
    private Vector <Course> courseList; // all courses offered by the department
    private Vector <Student> registerList; // all students taking courses in the department.

    public String getName()
    {
        return this.name;
    }
    //fill in get methods
    public String getId()
    {
        return this.id;
    }

    public Department(String name, String id)
    {
        // also initialize the vectors
        this.name = name;
        this.id = id;
        this.courseList = new Vector<Course>();
        this.registerList = new Vector<Student>();
    }

    public String toString()
    {
        // returns a string representation of department name, number
        // of courses offered and number of students registered in the
        // department. Use the format:
        // ECSE: 53 courses, 460 students
        return this.name + ": " + (this.courseList.size())
                + " courses, " + (this.registerList.size()) + " students";
    }
    //question 1
    public void offerCourse(Course course)
    {
        //add course to the department
        this.courseList.add(course);
    }
    //question 2
    public void printCoursesOffered()
    {
        System.out.println("courses offered in this department are: ");
        for(Course course: this.courseList)
        {
            System.out.println(course);
        }
    }
    //question 4
    public void printStudentsByName()
    {
        System.out.println("List of Students in this department: ");
        //use for loop to output all students
        for(Student student: registerList)
        {
            System.out.println(student);
        }
    }
    //Question 6
    public boolean isStudentRegistered(Student student)
    {
        //Checks whether student is registered in class
        return this.registerList.contains(student);
    }
}
