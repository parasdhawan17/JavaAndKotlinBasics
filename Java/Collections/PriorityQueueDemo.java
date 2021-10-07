package Java.Collections;

import java.util.Comparator;
import java.util.Iterator;
import java.util.PriorityQueue;

class Property{
    public Property(int area,String name){
        this.area = area;
        this.name = name;
    }
    int area;
    String name;

    @Override
    public String toString() {
        return "Property{" +
                "area=" + area +
                ", name='" + name + '\'' +
                '}';
    }


}

public class PriorityQueueDemo {
    public static void main(String[] args){
        PriorityQueue<String> priorityQueue = new PriorityQueue<>();
        priorityQueue.add("Geek");
        priorityQueue.add("For");
        priorityQueue.add("Geeks");

        // Order is sorted in ascending/increasing order
        // String increasing ASCII Values
        System.out.println(priorityQueue);


        PriorityQueue<Property> pq = new PriorityQueue<Property>(10, new Comparator<Property>() {
            public int compare(Property n1, Property n2) {
                if(n1.area>n2.area) return -1;
                else if(n1.area<n2.area) return 1;
                else return 0;
            }
        });

        pq.add(new Property(40,"Villah"));
        pq.add(new Property(20,"Ghar"));
        pq.add(new Property(15,"Kothi"));

        // No role of Comparator
        Iterator iterator = pq.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }

        // Order by which it is polled is done by Comparator
        while (!pq.isEmpty()){
            System.out.println(pq.poll());
        }
    }
}
