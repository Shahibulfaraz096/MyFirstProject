import java.util.Scanner;

public class circumference {
    public static void main(String[] args) {

        double circumference;
        double radius;
        double area;
        double volume;


        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the radius: ");
        radius = scanner.nextDouble();



        circumference = 2 * 3.1416 * radius;
        area = 3.1416 * radius * radius;
        volume = (4.0/3.0) * 3.1416 * radius * radius * radius;


        System.out.print("The circumference of the circle is: " + circumference);
        System.out.print("\nThe area of the circle is: " + area);
        System.out.print("\nThe volume of the circle is: " + volume);

        scanner.close();
    }
}
