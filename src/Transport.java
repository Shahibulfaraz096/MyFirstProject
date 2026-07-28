public class Transport {
    public static void main(String[] args) {

        Car2 car2 = new Car2("Charger", "Yellow", 10000);


        car2.setColor("Blue");
        car2.setPrice(5000);

        System.out.println(car2.getModel() + " " + car2.getColor() + " " + car2.getPrice());

    }
}
