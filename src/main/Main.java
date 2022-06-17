
package main;

public class Main {

    public static void main(String[] args) {
        Instructor i = new Instructor("Jack", 28, 264);
        Course c = new Course("English", i, 123); 
        Course c1 = new Course("Comp org", i, 126); 
        
        c.addStudent("Asim Mahmudov", 18, 482, 2020);
//        c.dropStudent(254);
        c.getStudents();
        Course.courses.add(c);
        c.getCouses();
        c.removeCourse(123);
        c.getCouses();
        
        
        
    }
    
}
