package Java.Collections;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetDemo {
    public static void main(String[] args){

        Set<Integer> valuesTree = new TreeSet<>();
        Set<Integer> valuesHash = new HashSet<>();

        valuesHash.add(24);
        valuesTree.add(24);
        valuesHash.add(14);
        valuesTree.add(14);
        valuesHash.add(54);
        valuesTree.add(54);
        valuesHash.add(22);
        valuesTree.add(22);

        // Add duplicate
        valuesHash.add(22);
        valuesTree.add(22);
        // Set cannot have duplicate values

        // HASH set is random order
        for(Integer i : valuesHash){
            System.out.println(i);
        }

        // Treeset is increasing order
        for(Integer i : valuesTree){
            System.out.println(i);
        }

        // Check if contains an element
        valuesHash.contains(123);
    }
}
