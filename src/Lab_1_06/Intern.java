package Lab_1_06;

public class Intern extends Employee{

    final double SALARY = 20000;
    public Intern(String name, String lastName, String id, double salary) { super(name, lastName, id, salary); setSalary(salary);}

    @Override
    public void  setSalary(double salary) {
        this.salary = salary > SALARY ? SALARY : salary;
    }

    @Override
    public String toString() {
        return "Interno{" +
                "name='" + super.name + '\'' +
                ", lastName='" + super.lastName + '\'' +
                ", id='" + super.id + '\'' +
                ", salary=" + this.salary +
                '}';
    }
}
