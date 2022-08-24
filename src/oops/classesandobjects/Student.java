package oops.classesandobjects;

public class Student {
    private int rollNumber;
    private String name;
    private int standard;
    private char section;

    // Default constructor
    public Student(){

    }

    // Polymorphism as same name but different functionality
    // Constructor overloading
    public Student(String s, int r, int st, char se){
        name = s;
        rollNumber = r;
        standard = st;
        section = se;
    }

    // Constructor overloading
    public Student(String s, int st){
        name = s;
        standard = st;
    }
}
