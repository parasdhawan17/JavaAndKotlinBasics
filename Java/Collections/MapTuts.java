package Java.Collections;

import java.util.*;

public class MapTuts {
    public static void main(String[] args){
        Map<String,String> values = new HashMap<>();
        values.put("Age","28");
        values.put("Name","Paras");
        values.put("Weight","65");
        values.put("Name","Dhawan");

        Set<String> keys = values.keySet();
        for(String key : keys){
            System.out.println(key + " "+values.get(key));
        }

        Set<Map.Entry<String,String>> entrsets = values.entrySet();

        for(Map.Entry<String,String> e : entrsets){
            System.out.println(e.getKey()+" : "+e.getValue());
        }

    }
}
