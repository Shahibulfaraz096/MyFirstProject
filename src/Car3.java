public class Car3 {

    String carmodel;
    int year;
    Engine engine;



    Car3(String model, int year, String engineType) {
        this.carmodel = model;
        this.year = year;
        this.engine = new Engine(engineType);
    }

    void start() {
        this.engine.start();
        System.out.println("The " + this.carmodel + " is running");
    }
}
