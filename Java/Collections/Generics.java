package Java.Collections;

import java.util.ArrayList;

class Container<T extends Number>{
    T value;
    public void show(){
        System.out.println(value.getClass().getName());
    }

    public void demo(ArrayList<? super T> arrayList){

    }
    // A Generic method example
    static <T> void genericDisplay (T element)
    {
        System.out.println(element.getClass().getName() +
                " = " + element);
    }
}

public class Generics {

    // https://www.geeksforgeeks.org/generics-in-java/
    public static void main(String[] args)
    {
        Container<Double> c = new Container<>();
        c.value = 20.00;
        c.demo(new ArrayList<Number>());
        c.show();
    }
}
