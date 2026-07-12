package oops.overLoadedConstructors;

public class OverLoadedConstructors {
    public static void main(String[] args) {
        // Overloaded Constructors -> Allow a class to have multiple constructors with different parameter lists, Enables objects to be initialized in various ways
        Users u1 = new Users("patrick123@xy");
        Users u2 = new Users("spongebob@kraby", "spongbob@krabypatties.com");
        Users u3 = new Users("sandy123", "spongbob@krabypatties.com", 34);
        System.out.println(u1.username + " " + u1.email + " " + u1.age);
        System.out.println(u2.username + " " + u2.email + " " + u2.age);
        System.out.println(u3.username + " " + u3.email + " " + u3.age);
    }
}
