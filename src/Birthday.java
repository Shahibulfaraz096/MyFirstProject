public class Birthday {
    public static void main(String[] args) {

        String name = "Shahibul";
        int age = 20;

        if (ageCheck(age)) {
            System.out.println("You may sign up");
        }
        else {
            System.out.println("You must be 18+ to sign up");
        }


        System.out.println(square(3));
        System.out.println(cube(3));

        String fullname = getfullname("Shahibul", "Faraz");
        System.out.println(fullname);






    }
    static void  happybirthday(String name, int age) {
        System.out.println("Happy Birthday to you");
        System.out.printf("Happy Birthday dear %s\n", name);
        System.out.printf("Your are %d age now\n", age);
        System.out.println("Happy Birthday to you!\n");
    }
    static double square (double number) {return number * number;}
    static double cube (double number) {return number * number * number;}
    static String getfullname (String first, String last) {return first + " " + last; }
    static boolean ageCheck (int age) {
        if (age >= 18) {
            return true;
        }
        else {
            return false;
        }
    }
}
