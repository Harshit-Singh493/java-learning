package oops.superKeyword;

public class superIntro {
    public static void main(String[] args) {
        // super -> Refers to the parent class (subclass <- superclass)
        // Used in constructors and method overriding
        // Calls the parent constructors to initialize attributes
        // Refer to the Student class to see the use of super()

        Person p = new Person("Tom", "Riddle");
        Student s = new Student("Harry", "Potter", 3.25);
        Employee e = new Employee("Harshit", "Singh", 900000);
        p.showName();
        s.showName();
        s.showGPA();
        e.showSalary();

    }


}
