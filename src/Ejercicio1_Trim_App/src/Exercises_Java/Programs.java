package Exercises_Java;

import java.util.regex.Pattern;

public class Programs {
    public static  void main(String [] args) {
        counterCharacter("esquilo es 12++*-.? 8 ª");
    }

    //1. Write a Java program to count the letters, spaces, numbers and other characters of an input string
    public  static void counterCharacter(String d){
        String space = " ", charac = ".+-*/,¿?=)(/&%$·'!";
        int countL = 0, countS = 0, countN = 0, countO = 0;
        for(char f : d.toCharArray()){
            /*countL = Character.isLetter(f) ? countL+= 1 : countL;
            countS = f == ' ' ? countS+= 1 : countS;
            countN = Character.isDigit(f) ? countN+= 1 : countN;
            countO = (!Character.isLetter(f) && !(f == ' ') && !Character.isDigit(f)) ? countO+= 1 : countO;*/
            int general = Character.isLetter(f) ? (countL+= 1) : ((f == ' ') ? (countS+= 1) : (Character.isDigit(f) ? (countN+= 1) : ((!Character.isLetter(f) && !(f == ' ') && !Character.isDigit(f)) ? countO+= 1 : countO)));
        }
        System.out.println("Letras = " + countL + "\nEspacios =  " + countS + "\nNúmeros =  " + countN + "\nOtro carácter =  " + countO);
    }
}
