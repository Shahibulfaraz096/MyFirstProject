import java.util.InputMismatchException;
import java.util.Scanner;

public class Main4 {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);



            try {
                System.out.print("Enter the number: ");
                int num = scanner.nextInt();
                System.out.println(num);
            }

            catch (InputMismatchException e) {
                System.out.println("That wasn't number.");
            }
            catch (ArithmeticException e) {
                System.out.println("You can't divide by zero.");
            }

            catch (Exception e) {
                System.out.println("Something went wrong.");
            }

            finally {
                scanner.close();
                System.out.println("That always executes. ");
            }


    }
}
