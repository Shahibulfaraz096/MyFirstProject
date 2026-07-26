public class Student extends Person{

    double cgpa;

    Student(String first, String last, double cgpa) {
        super(first, last);

        this.cgpa = cgpa;
    }
    void showGPA() {
        System.out.println(this.first + "'s cgpa is: " + this.cgpa);
    }
}
