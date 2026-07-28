import java.util.Scanner;

public class Guessing {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);



        System.out.println("Would you like a dog or a cat(1 = dog, 2 = cat): ");
        int choice = scanner.nextInt();


        if (choice == 1) {
        Dog1   mike = new Dog1();
           mike.speak();
        }
        else if (choice == 2) {
         Cat1   bella = new Cat1();
            bella.speak();

        }
    }
}
