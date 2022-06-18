import java.util.ArrayList;

public class RetoApp {
    /*

    1.- Write a method in Java to get the difference between the largest and smallest values in an array of integers. The length of the array must be 1 and above.
*/

    public  void diferencia() {
        int [] numbers = {7, 78, 96, 12, 4, 7};
        int menor = numbers[0];
        int mayor = numbers[0];

        for(int i : numbers) {
            if(mayor < i) {
                mayor = i;
            }
        }
        System.out.println("Mayor " + mayor);

        for(int j : numbers) {
            if(menor > j) {
                menor = j;
            }
        }
        System.out.println("Menor " + menor);
        System.out.println("La diferencia entre el menor y el mayor en el array es : " + (mayor - menor));
    }

    /* 2. Write a method in Java to find the smallest and second smallest elements of a given array and print it in the console.*/

    public void smallest() {
        int  [] values = {7, 89, 24, 15, 63, 14};
        int [] arreglo = new int [values.length];
        int menor = values[0];

        for(int i = 0; i < values.length; i++){
            for(int j = 0; j <  values.length; j++){
                int aux = 0;
                if(values[i] < values[j]) {
                    aux = values[i];
                    values[i] = values[j];
                    values[j] = aux;
                }
            }
        }
            System.out.println("El primer elemento menor del array es : " + values[0] + " Segundo elmento menor : " + values[1]);
    }

    /*3. Write a method in Java that resolves this mathematical expression where x and y are two variables pre-set in your code.*/
    public void fracciones() {

        double x = 7;
        double y = 4;

        //x2 + ((4.y/5) - x)2;
        double z =  Math.pow(x, 2);
        double k =  ((4 * y) / 5) - x;
        double l = Math.pow(k, 2);
        double suma = z + l;

        System.out.println("El resultado es igual a : " +suma);
    }
}
