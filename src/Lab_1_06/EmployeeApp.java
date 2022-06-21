package Lab_1_06;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

import static java.nio.file.Files.write;

public class EmployeeApp {
    public static void main(String args[]) throws IOException {
        Employee [] emple = new Employee[10];
        emple[0] = new Intern("Luis", "Carrillo", "123A", 25000);
        emple[1] = new Employee("Petrus", "Londre", "123D", 90000);
        emple[2] = new Intern("Olga", "Estevez", "123A", 25000);
        emple[3] = new Employee("Ludwig", "Van Beethoven", "123D", 80000);
        emple[4] = new Intern("Ernest", "Hemingway", "123A", 25000);
        emple[5] = new Employee("Sole", "Londre", "123D", 70000);
        emple[6] = new Intern("Arthur", "Schopenhauer", "123A", 25000);
        emple[7] = new Employee("Stella", "MacCartney", "123D", 50000);
        emple[8] = new Intern("Paul", "MacCartney", "123A", 25000);
        emple[9] = new Employee("Ringo", "Star", "123D", 100000);

        escribano(emple);

    }

    public  static void escribano(Employee [] emple) throws IOException {
        FileWriter file = new FileWriter("employees.txt");

        file.write("Listado de Empleados contenidos en el programa \n\n");
        for(Employee x : emple) {
            file.write(x.toString() + "\n");
        }
        file.close();
    }
}
