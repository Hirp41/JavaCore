package tops.core;

class Student {
    int id;
    String name;

    // 1. this keyword to refer current object variables
    Student(int id, String name) {
        this.id = id;       // differentiates instance variable from parameter
        this.name = name;
    }

    // 2. this keyword to call another method
    void display() {
        this.show();   // calling method using this
    }

    void show() {
        System.out.println("ID: " + id + ", Name: " + name);
    }

    // 3. this keyword to return current object
    Student getStudent() {
        return this;
    }

    // 4. this() to call another constructor
    Student() {
        this(0, "Default");   // calls parameterized constructor
        System.out.println("Default constructor called");
    }
}

public class thisKeyword {
    public static void main(String[] args) {
        
        // using parameterized constructor
        Student s1 = new Student(101, "Hir");
        s1.display();

        // using default constructor
        Student s2 = new Student();
        s2.display();

        // using this as return
        Student s3 = s1.getStudent();
        s3.display();
    }
}