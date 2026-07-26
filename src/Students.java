public class Students{
    String name;
    int age;
    double cgpa;
    boolean isEnrolled;


    Students(String name, int age, double cgpa) {
        this.name = name;
        this.age = age;
        this.cgpa = cgpa;
        this.isEnrolled = true;

}
void Study () {
        System.out.println(this.name + " is studying");
}
}
