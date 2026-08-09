import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Arraylist {
    public static void main(String[] args) {



        //fruits.add("Apple");
        //fruits.add("Banana");
        //fruits.add("Orange");
        //fruits.add("Coconut");


        //fruits.remove(0);
        //fruits.set(1, "pineapple");

        //System.out.println(fruits.get(3));

        //System.out.println(fruits.size());

        //Collections.sort(fruits);

        //fruits.sort(Collections.reverseOrder());

        //for (String fruit : fruits) {

            //System.out.println(fruit);
        //}

        Scanner scanner = new Scanner(System.in);

        ArrayList <String> foods = new ArrayList<>();

        System.out.print("Enter the # of food: ");
        int numOfFood = scanner.nextInt();
        scanner.nextLine();

        for (int i = 1; i <= numOfFood; i++) {
            System.out.print("Enter food #" + i + ": ");
            String food = scanner.nextLine();
            foods.add(food);
        }

        System.out.println(foods);


     scanner.close();
    }
}
