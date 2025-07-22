package Map;

import java.util.*;

//Sort a map by values (ascending order).
public class Ex1 {
    public static void main(String[] args) {
        Map<Integer,String> map = new TreeMap<>();
        map.put(14,"Ankush");
        map.put(10,"Ayush");
        map.put(13,"Anku");
        map.put(20,"Hello");
        map.put(12,"World");

        System.out.println("Original map"+ map);
        for(Map.Entry<Integer,String> entry:map.entrySet()){
            System.out.println(entry.getValue());
        }



    }
}
