package Java.Arrays;

import java.util.Arrays;

public class ArrayDemo {
    public static void main(String[] args){
        int[] arr = new int[]{1,2,3,4,5};

        // https://www.geeksforgeeks.org/array-copy-in-java/
        // ----------- HOW TO CREATE A COPY ----------------

        // Using Java.Arrays class
        int[] copy = Arrays.copyOf(arr, arr.length);

        // Using clone method
        int[] copy1 = arr.clone();

        // Using System class
        int[] copy2 = new int[arr.length];
        System.arraycopy(arr, 0, copy2, 0, arr.length);

        // Using Java.Arrays Class
        int[] copy3 = Arrays.copyOfRange(arr,0,arr.length);
    }
}
