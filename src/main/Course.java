package main;

import java.util.ArrayList;
import static main.Student.students;

public class Course {

    public static ArrayList<Course> courses = new ArrayList<>();
    public String courseName;
    Instructor instructor;
    public int courseCode;
    public int numberOfStudent = 0;

    public Course(String courseName, Instructor instructor, int courseCode) {
        this.courseName = courseName;
        this.instructor = instructor;
        this.courseCode = courseCode;
    }

    public String getCourseName() {
        return courseName;
    }

    public Instructor getInstructor() {
        return instructor;
    }

    public int getCourseCode() {
        return courseCode;
    }

    public int getNumberOfStudent() {
        return numberOfStudent;
    }

    //Student Section
    public void addStudent(String nameSurname, int age, int studentNo, int entranceYear) {
        students.add(new Student(nameSurname, age, studentNo, entranceYear));
        numberOfStudent++;
    }
    
    public void dropStudent(int studentNo) {
        Student.removeStudent(studentNo);
        numberOfStudent--;
    }
    
    public void getStudents() {
        Student.getStudents();
    }
    
    public void getCouses() {
        courses.forEach((course) -> {
            System.out.println(course);
        });
    }

    public void removeCourse(int courseCode) {
        courses.removeIf((course) -> course.courseCode == courseCode);
    }
    @Override
    public String toString() {
        return "\nCourse" + "\nCourse Name: " + courseName + "\nInstructor: " + instructor.nameSurname + "\nCourse Code: " + courseCode + "\nNumber Of Student: " + numberOfStudent;
    }
    
    
}
