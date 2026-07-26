public class Livings {
    public static void main(String[] args) {

        Dogs dog = new Dogs();
        Cats cat = new Cats();
        Plant plant = new Plant();

        System.out.println(dog.isAlive);
        System.out.println(cat.isAlive);

        dog.eat();
        cat.eat();

        System.out.println(dog.lives);
        System.out.println(cat.lives);

        dog.Speak();
        cat.Speak();



        plant.photosinthesize();

    }
}
