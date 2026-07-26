public class Employees extends Person{
    int Salary;

    Employees(String first, String last, int Salary) {
        super(first, last);
        this.Salary = Salary;
    }

    void ShowSalary() {
        System.out.println(this.first + "'s salary is $: " + this.Salary);
    }
}
