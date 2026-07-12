package oops.constructor;

public class Students {
    String name;
    int age;
    double gpa;
    boolean isEnrolled;

    Students(String name, int age, double gpa) {
        // "this" keyword is a reference to the current object
        this.name = name;
        this.age = age;
        this.gpa = gpa;
        this.isEnrolled = true;
    }

    void study() {
        System.out.println(this.name + " is studying SHUSH! don't disturb");
    }
}
