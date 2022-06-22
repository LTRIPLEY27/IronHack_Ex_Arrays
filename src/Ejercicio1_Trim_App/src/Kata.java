import java.util.Arrays;

public class Kata {
    public static void main(String arg[]) {
        String k = "olopolo";
        String l = "lopolo";
        System.out.println(katar(k, l));
        int p = 121;
        System.out.println(findNextSquare(p));
        char [] h = new char[] {'n','n','n','s','n','s','n','s','n','s'};
        System.out.println(isValid(h));
        double t = 30.0, bounce = 0.66, window = 1.5;
        System.out.println(bouncingBall(t, bounce, window));

        //String str1 = "katas", str2 = "steak";
        String str1 = "sammoc", str2 = "commas";
        //System.out.println(str1.length() + " " + str2.length());
        System.out.println(scramble(str1, str2));
        //scramble(str1, str2);
    }

    public static boolean katar(String a, String b) {
        boolean g = a.substring(a.length() - b.length()).equals(b) ? true : false;
        return g;
    }

    public static long findNextSquare(long sq) {
        double l = Math.sqrt(sq);
        int g = (int) Math.sqrt(sq);
        int y = g + 1;
        int u = l % 1 == 0 ? y : -1; // VERIFICAMOS SI LA RAIZ ES O NO UN INTEGER Y LUEGO SOLO AUMENTAMOS POR 1 EL VALOR Y LO MULTIPLICAMOS  ESE VALOR +1 * VALOR + 1, ASÍ SERÁ UNA CONSTANTE ÚNICAMENTE AUMENTANDO LA RAIZ PERFECTA Y HALLANDO SU POTENCIA.

        return y * y;
    }

    public static boolean isValid(char[] walk) {
        String x = new String(walk);
        String g = "nsnsnsnsns";
        String h = "snsnsnsnsn";
        String j = "wewewewewe";
        String k = "ewewewewew";

        boolean f = x.length() != 10 ? false : ((g).equals(x) || h.equals(x) || j.equals(x) || k.equals(x) ? true : false);
            return f;
        }

        public static int bouncingBall(double h, double bounce, double window) {
            /*boolean condition = h > 0 && h > window && (bounce > 0 && bounce < 1)  ? true : false;
            float B = (float) 0.66;
            int x = (int) Math.ceil((condition == true ? (h <= 3 ? h * B * window : (h * B * window) / 2) : -1));*/
            int count = -1;
            while (h > 0 && h > window && (bounce > 0 && bounce < 1)) {
                h = bounce * h;
                count += 2;
            }
            return count;
        }

        /*Complete the function scramble(str1, str2) that returns true if a portion of str1 characters can be rearranged to match str2, otherwise returns false.

Notes:

    Only lower case letters will be used (a-z). No punctuation or digits will be included.
    Performance needs to be considered.

    scramble('rkqodlw', 'world') ==> True
scramble('cedewaraaossoqqyt', 'codewars') ==> True
scramble('katas', 'steak') ==> False

       public void test() {
        System.out.println("Fixed Tests scramble");
        testing(Scramblies.scramble("rkqodlw","world"), true);
        testing(Scramblies.scramble("cedewaraaossoqqyt","codewars"),true);
        testing(Scramblies.scramble("katas","steak"),false);
        testing(Scramblies.scramble("scriptjavx","javascript"),false);
        testing(Scramblies.scramble("scriptingjava","javascript"),true);
        testing(Scramblies.scramble("scriptsjava","javascripts"),true);
        testing(Scramblies.scramble("javscripts","javascript"),false);
        testing(Scramblies.scramble("aabbcamaomsccdd","commas"),true);
        testing(Scramblies.scramble("commas","commas"),true);
        testing(Scramblies.scramble("sammoc","commas"),true);
*/

    public static boolean scramble(String str1, String str2){
        int cont = 0;
        for(char i : str1.toCharArray()) {
            for(char j : str2.toCharArray()) {
                if(j == i ) {
                    cont++;
                }
            }
        }
        System.out.println(cont + " " + str2.length());
        boolean f =  str2.length()+1 < cont  ? true : false;

        System.out.println(f);
        return f;

       /* boolean match = Arrays.stream(str1.toLowerCase().split(" ")).anyMatch(str2.toLowerCase()::contains);
        return match;*/
    }
}
