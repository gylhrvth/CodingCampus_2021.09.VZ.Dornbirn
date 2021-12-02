package Ingo.oopObjektorientiert.oopAbstractInterface;

public class Friend extends Human{

    private String name;
    static int numberOfFriends;

    public Friend(String name) {
        this.name = name;
        numberOfFriends++;
    }
    static void displayFriends() {
        System.out.println("You have" + numberOfFriends + "friends !");
    }
//     ---> in der Main aufrufen !!
//        System.out.println(Friend.numberOfFriends);
//            Friend.displayFriends();

}
