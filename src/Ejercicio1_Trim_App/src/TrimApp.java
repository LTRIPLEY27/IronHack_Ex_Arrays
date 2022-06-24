public class TrimApp {
    public static void main (String args[]){
        System.out.println("hola");
        System.out.println(toAlternativeString("HoLa"));
    }

    public static String toAlternativeString(String string) {
        String aux = "";
        for(int x = 0; x < string.length(); x++){
            char i = string.charAt(x);
            if(Character.isUpperCase(i)){
                aux += Character.toLowerCase(i);
            } else {
                aux += Character.toUpperCase(i);
            }
        }
        return aux;
    }
}
