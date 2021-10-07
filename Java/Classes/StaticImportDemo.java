package Java.Classes;
import static java.lang.Math.*;

public class StaticImportDemo {
    public static void main(String[] args){

        // Without static import
        System.out.println(Math.sqrt(4));
        System.out.println(Math.pow(2, 2));
        System.out.println(Math.abs(6.3));

        // import static java.lang.Math.*;
        // With static import
        System.out.println(sqrt(4));
        System.out.println(pow(2, 2));
        System.out.println(abs(6.3));
    }
}
