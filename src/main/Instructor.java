package main;

import java.util.ArrayList;

public class Instructor extends Person {
    ArrayList<Instructor> instructors = new ArrayList<>();
    private int id;

    public Instructor(String nameSurname, int age, int id) {
        super(nameSurname, age);
        this.id = id;
    }

    public int getId() {
        return id;
    }
    
    public void getInstructors() {
        instructors.forEach((instructor) -> {
            System.out.println(instructor);
        });
    }
    public void removeInstructor(int id) {
        instructors.removeIf((instructor) -> instructor.id == id);
    }
}
