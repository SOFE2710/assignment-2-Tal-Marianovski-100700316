package com.company;
import java.util.*;
import java.util.Vector;
public class Student extends Main{
    private String id;
    private Vector <Course> courses; // contains all courses the student is registered in

    public String getName()
    {
        return this.name;
    }

    public String getId()
    {
        return this.id;
    }

    // constructor
    public Student(String id, String name)
    {
        // initialize name and id. Also initialize the Vector
        this.name = name;
        this.id = id;
        this.courses = new Vector<Course>();

    }
    //Question 3
    public void registerFor(Course course)
    {
        //check if the course is there
        if(!this.courses.contains(course))
        {
            //If it isnt then add the coarse
            this.courses.add(course);
        }
    }
    //Question 5
    public boolean isRegisteredInCourse(Course course)
    {
        //determine if student is in the course
        return this.courses.contains(course);
    }

    public String toString()
    {
        // return a string representation of a student using the following format:
        // 100234546 John McDonald
        // Registered courses: ELEE 2110, ELEE 2790, SOFE 2710, SOFE 2800, SOFE 2850
        System.out.println(this.id + " " + this.name + "\n\n");
        //create variable for course
        String course_code = "";
        for(Course course: this.courses)
        {
            course_code = course_code + course.getCode() +
                    " " + course.getnumber() + "\n";
        }
        return this.id + " " + this.name + "courses: " + course_code;
    }

}
