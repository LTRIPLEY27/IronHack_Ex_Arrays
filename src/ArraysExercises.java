public class ArraysExercises {
    //programa con dos métodos que printen

    public  void printArray(String[] x) {
        System.out.println("Array with for each");
        for (String i : x) {
            System.out.println(i);
        }
    }

    public  void printArrayClassic(String[] x) {
        System.out.println("Array with classic for");
        for (int i = 0; i < x.length; i++) {
            System.out.println(x[i]);
        }
    }
}