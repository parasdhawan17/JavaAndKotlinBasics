package Java.Strings;

public class OutputFormatting {
    public static void main(String[] args){

        System.out.printf("Printing simple integer: x = %d\n", 100); // 100

        System.out.printf("Formatted with precison: PI = %.2f\n", Math.PI); // 3.14

        System.out.printf("Formatted to specific width: n = %.4f\n", 5.2f); // 5.2000

        // here number is formatted from right margin and occupies a
        // width of 20 characters
        System.out.printf("Formatted to right margin: n = %20.4f\n", 2324435.3f); //          2324435.2500
    }
}
