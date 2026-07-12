package oops.staticKeyword;

public class Friend {
    // Let's say we want to keep the track of how many friend objects we have, but if we do int count; and increment it in constructor it won't work because each object created will have its own separate count which will be zero always, hence we can use "static" keyword
    String name;
    static int count = 0;
    Friend(String name) {
        this.name = name;
        count++;
    }

    static void showFriends() {
        System.out.println("You have " + count + " total friends");
    }
}
