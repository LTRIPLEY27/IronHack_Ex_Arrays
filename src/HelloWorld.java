import java.util.Scanner;

public class HelloWorld {
    public static void main(String args[]) {

        Scanner ask = new Scanner(System.in);
        System.out.println("What is your name");
        String name = ask.next();

        System.out.println("What is your age");
        int age = ask.nextInt();
        do {
            System.out.println("What is your age");
            age = ask.nextInt();
        }while( age < 18);

        System.out.println("What is your favorite colour");
        String color = ask.next();

        System.out.println("Your name is " + name + "\nAge : " + age +  "\nColour : " + color);
    }
}
