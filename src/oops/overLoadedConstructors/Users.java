package oops.overLoadedConstructors;

public class Users {

    // Let's say these three attributes are optional, we may or may not receive it with the object
    String username;
    String email;
    int age;

    Users(String username) {
        this.username = username;
        this.email = "Not provided";
        this.age = 0;
    }

    Users(String username, String email) {
        this.username = username;
        this.email = email;
        this.age = 0;
    }

    Users(String username, String email, int age) {
        this.username = username;
        this.email = email;
        this.age = age;
    }
}
