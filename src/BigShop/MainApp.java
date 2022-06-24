package BigShop;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Scanner;

public class MainApp {
    private static final Scanner ASK = new Scanner(System.in);
    private static ArrayList < User > users = new ArrayList < User >();

    public static void main(String x []) {

        System.out.println("Hello, give me your name in the list of users, please?");
        usersArrays();
        String name = ASK.next();
        System.out.println(userVerified(name));
    }

    public  static void usersArrays() {
        /*users.add(new User("Arthur", new BigDecimal("8546.545")));
        users.add(new User("Peter", new BigDecimal("74.256")));
        users.add(new User("Lewis", new BigDecimal("123.589")));*/
        String name [] = {"Arthur", "Peter", "Lewis"};
        BigDecimal [] balances = {new BigDecimal("8546.545"),new BigDecimal("74.256"), new BigDecimal("123.589")};

        for(int i = 0; i < name.length; i++){
            users.add(new User(name[i], balances[i]));
        }
        printUsers(users);
    }

    public static void printUsers(ArrayList < User > users) {
        System.out.println("Listado de Usuarios registrados");
        for (User i : users) {
            System.out.println(i.getName());
        }
    }

    public static boolean userVerified(String name) {
        boolean resp = false;
        for(var i : users) {
            if(i.getName().equals(name)){
                resp = true;
            }
        }
        return resp;
    }



}
