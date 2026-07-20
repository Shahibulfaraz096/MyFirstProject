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


        circumference = 2 * Math.PI * radius;
        area = Math.PI * Math.pow(radius, 2);
        volume = (4.0/3.0) * Math.PI * Math.pow(radius, 3);


        System.out.print("The circumference of the circle is: " + circumference + "cm");
        System.out.print("\nThe area of the circle is: " + area + "cm2");
        System.out.print("\nThe volume of the circle is: " + volume + "cm3");

        scanner.close();
    }
}
