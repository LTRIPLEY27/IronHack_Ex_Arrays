package Lab_1_06;

public class Intern extends Employee{

    final double SALARY = 20000;
    public Intern(String name, String lastName, String id, double salary) {
        super(name, lastName, id, salary);
    }

    @Override
    public void  setSalary(double salary) {
        this.salary = super.getSalary() > SALARY ? SALARY : super.getSalary();
    }

}
