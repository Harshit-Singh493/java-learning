package oops.staticKeyword;

public class staticKeyword {
    public static void main(String[] args) {
        // Static -> Makes a variable or method belong to the class rather than to any specify object, Commonly used for utility methods or shared resources

        Friend f1 = new Friend("Spongebob");
        Friend f2 = new Friend("Patrick");
        Friend f3 = new Friend("Squidward");
        Friend f4 = new Friend("Sandy");
        System.out.println(f1.name);
        System.out.println(f2.name);
        System.out.println(f3.name);
        System.out.println(Friend.count);
        Friend.showFriends();
    }
}
