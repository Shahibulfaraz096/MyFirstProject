public class Friends {


    String name;
    static int numofFriends;

    Friends(String name) {
        this.name = name;
        numofFriends++;
    }

    static void ShowFriends() {
        System.out.println("You have " + numofFriends + " friends");
    }
}
