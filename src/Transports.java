public class Transports {
    public static void main(String[] args) {

        Cars car = new Cars();
        Bike bike = new Bike();
        Boat boat = new Boat();

        car.go();
        bike.go();
        boat.go();

        Vehicles[] vehicle = {car, bike, boat};

        for (Vehicles vehicles: vehicle) {
            vehicles.go();
        }






    }
}
