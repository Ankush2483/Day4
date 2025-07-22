package Map;

import java.util.HashMap;
import java.util.Map;

public class Ex2 {
    public static void main(String[] args) {
        Map<Integer,String> map = new HashMap<>();
        map.put(15,"World");
        map.put(21,"hello");
        map.put(11,"java");
        map.put(22,"php");
        map.put(14,"world");
        System.out.println("Original map"+ map);

        for(Map.Entry<Integer,String> entry:map.entrySet()){
            if(entry.getValue().equals("World")){
                System.out.println(entry.getValue());
            }
        }
    }
}
