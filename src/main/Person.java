package main;

public class Person {
    public String nameSurname;
    public int age;

    public Person(String nameSurname, int age) {
        this.nameSurname = nameSurname;
        this.age = age;
    }

    public String getNameSurname() {
        return nameSurname;
    }

    public int getAge() {
        return age;
    }
     
}
