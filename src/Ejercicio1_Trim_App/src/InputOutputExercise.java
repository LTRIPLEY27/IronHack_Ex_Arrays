import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class InputOutputExercise {

    public static void main(String[] args) throws IOException {
        var file = new File("oscar_age_female.csv");
        var scanner = new Scanner(file);

        var writer = new FileWriter("result.txt", false);
        scanner.nextLine();
        while(scanner.hasNextLine()) {
            var row = scanner.nextLine();
            var rowValues = row.split(",");
            var name = rowValues[3].trim();
            var year = rowValues[1].trim();
            var age = rowValues[2].trim();
            var movie = rowValues[4].trim();

//            "Name ${name} "

//            System.out.printf("HEllo %s, age: %d", "salva", 13);

            var result =
                    """
                    Name: %s
                    Year: %s
                    Age: %s
                    Movie: %s
                    =====================
                    """.formatted(name, year, age, movie);

            writer.write(result);
        }

        writer.close();
    }
}
