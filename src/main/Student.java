/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import java.util.ArrayList;

/**
 *
 * @author User
 */
public class Student extends Person {
    public static ArrayList<Student> students = new ArrayList<>();
    public int studentNo;
    public int entranceYear;
    
    public Student(String nameSurname, int age, int studentNo, int entranceYear) {
        super(nameSurname, age);
        this.studentNo = studentNo;
        this.entranceYear = entranceYear;
    }

    public int getStudentNo() {
        return studentNo;
    }

    public int getEntranceYear() {
        return entranceYear;
    }
    
    static void getStudents() {
        students.forEach((student) -> {
            System.out.println(student);
        });
    }
    
    static void getStudentInfo() {
        students.forEach((student) -> {
            System.out.println(student.toString());
        });
    }
    
    static void removeStudent(int studentNo) {
        students.removeIf((student) -> student.studentNo == studentNo);
    }

    @Override
    public String toString() {
        return "\nStudent " +"\nName and Surname: " + nameSurname + "\nAge: " + age + "\nStudent id: " + studentNo + "\nEntrance Year: " + entranceYear;
    }
    
}
