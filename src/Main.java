
public class Main {
    public static void main(String args[]) {
        System.out.println("Array");

        int [] numbers = {1, 2, 3};
        System.out.println(numbers[0]);

        extracted(numbers);

        String [] cafe = {"Long", "Capuccino", "Mocaccino", "Américano"};

        ArraysExercises array1 = new ArraysExercises();

        array1.printArray(cafe);
        array1.printArrayClassic(cafe);

    }

    private static void extracted(int[] numbers) {
        for(int i : numbers) {
            System.out.println(i);
       }
    }
}
