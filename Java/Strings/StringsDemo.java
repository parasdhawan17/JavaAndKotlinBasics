package Java.Strings;

import java.util.Arrays;

public class StringsDemo {
    public static void main(String[] args){

        int a[] = {1,2,3,4,5};

        // ------  3 Ways to deep copy one array to another ----------
        // 1- use clone method to copy an array
        int b[] = a.clone();

        // 2- Java.Strings.arraycopy to clone an array
        System.arraycopy(a,0,b,0,3);

        // 3- Java.Arrays.copyOf
        int c[]= Arrays.copyOf(a,3);


        String s = "hello";
        // -------- Convert string to char array -----------------------
        char chr[]= s.toCharArray();

        // Convert char array to string
        String str = new String(chr);

        // Convert char array to string
        String str1 = Arrays.toString(chr);

        // ------------- Reverse a string --------------------------------
        StringBuilder stringBuilder = new StringBuilder(str);
        stringBuilder.reverse();

        // ------------- Find a character in a string --------------------
        String xyz ="xyz";

        // returns bool
        boolean hasElement = xyz.contains("x");

        // get index of returns -1 if not contains
        xyz.indexOf('x',2);


        //  ------------- Split string ---------------------------

        String demo = " hello guys, how are you?";
        // Java.Regrex and limit
        demo.split(", ?",5);
    }
}
