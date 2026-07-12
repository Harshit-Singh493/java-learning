package oops.superKeyword;

public class Student extends Person{
    double gpa;

    Student(String first, String last, double gpa) {
        super(first, last); // Since the parent class "Person" also requires a first and last name we use super() which refers to the parent class
        this.gpa = gpa;
    }

    void showGPA() {
        System.out.println(this.first + "'s gpa is " + this.gpa);
    }
}
