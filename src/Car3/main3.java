package Car3;

public class main3 {
    public static void main(String[] args) {

        Car3 car = new Car3("Corvette", 2025, "V8");

        System.out.println(car.model);
        System.out.println(car.year);
        System.out.println(car.engine.type);

        car.start();
    }
}