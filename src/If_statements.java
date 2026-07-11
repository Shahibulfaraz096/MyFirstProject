import java.util.Scanner;

public class If_statements {
public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);


    String name;
    int age;
    boolean isStudent;

    System.out.print("Enter your name: ");
    name = scanner.nextLine();
    System.out.print("Enter your age: ");
    age = scanner.nextInt();
    System.out.print("Are you a student(true/false): ");
    isStudent = scanner.nextBoolean();

    if(name.isEmpty()) {
        System.out.print("You didn't given your name.");
    }
    else {
        System.out.println("Hello " + name + "! 😎");
    }

    if ( age >= 65) {
        System.out.println("You are a senior! 👴🏼");
    }
    else if ( age >= 18) {
        System.out.println("You are an adult");
    }
    else if ( age == 0) {
        System.out.println("You haven't born yet!");
    }

    if(isStudent) {
        System.out.println("You are a student! 🏫");
    }
    else {
        System.out.println("You are not a student! 🏢");
    }

    scanner.close();

}
}
