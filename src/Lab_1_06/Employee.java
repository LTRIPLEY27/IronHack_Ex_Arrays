package Lab_1_06;

public abstract class Employee {
    protected String name;
    protected String lastName;
    protected String id;
    protected double salary;

    //final double SALARY = 20000;

    public Employee(String name, String lastName, String id, double salary) {
        this.name = name;
        this.lastName = lastName;
        this.id = id;
        //setSalary(salary);
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public abstract void setSalary(double salary);

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", lastName='" + lastName + '\'' +
                ", id='" + id + '\'' +
                ", salary=" + salary +
                '}';
    }


}
