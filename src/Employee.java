public class Employee {
    public static void main(String[] args) {
        String name = "Spongbob";
        char firstletter = 'S';
        int age = 20;
        double height = 60.5;
        boolean isEmployee = true;

        System.out.printf("Hello %s\n",  name);
        System.out.printf("Your first character is %c\n",  firstletter);
        System.out.printf("You are %d years old \n",  age);
        System.out.printf("Your height is  %f\n",  height);
        System.out.printf("You are %b employed\n ", isEmployee);


        System.out.printf("%S is %d years old. ", name, age);


    }
}
