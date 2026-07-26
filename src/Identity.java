public class Identity {
    public static void main(String[] args) {
        Students student1 = new Students("Spongbob", 20, 3.22);
        Students student2 = new Students("Patrick", 18, 1.5);
        Students student3 = new Students("Sandy", 21, 4.00);

       student1.Study();
       student2.Study();
       student3.Study();

    }
}
