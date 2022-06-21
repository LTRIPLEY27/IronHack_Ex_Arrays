import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;
import java.util.Scanner;

public class HelloFile {

    public static void main(String[] args) throws IOException {
        System.out.println("Hello File!");

        write();

        File file = new File("demo.csv");
        Scanner scanner = new Scanner(file);
        System.out.println("===================");
        System.out.println("Now we are reading from " + file);
        while(scanner.hasNextLine()){
            String data = scanner.nextLine();
            var line = data.split(", ");
            System.out.println(line[0]);
            System.out.println(line[2]);
        }

        scanner.close();


    }

    private static void write() throws IOException {
        //        Indicate the target file to write on
        FileWriter writer = new FileWriter("demo.txt", true);
        //        Write
        writer.write(LocalDateTime.now() + "Hello from Java \n");


//        Clean up
        writer.close();
    }

}
