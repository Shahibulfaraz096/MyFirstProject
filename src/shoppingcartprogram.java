import java.util.Scanner;

public class shoppingcartprogram {
    public static void main(String[] args) {

        String item;
        double price;
        int quantity;
        char currency = '$';
        double total;

        Scanner scanner = new Scanner(System.in);

        System.out.print("What item would you like to buy: ");
        item = scanner.nextLine();
        System.out.print("What is the price of the item: ");
        price = scanner.nextDouble();
        System.out.print("How many items you take: ");
        quantity = scanner.nextInt();

        total = price * quantity;



        System.out.println("\nYou have bought " + quantity + " " + item +"/s");
        System.out.println("Your total payment is : " + currency + total);


        scanner.close();





    }
}
