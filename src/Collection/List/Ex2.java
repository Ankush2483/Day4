package Collection.List;
//Find the frequency of each element in a list.
import java.util.*;
public class Ex2 {
        public static void main(String[] args) {
            List<String> items = Arrays.asList("apple", "banana", "apple", "orange", "banana", "apple");
            Map<String, Integer> frequencyMap = new HashMap<>();
            for (String item : items) {
                frequencyMap.put(item, frequencyMap.getOrDefault(item, 0) + 1);
            }
            for (Map.Entry<String, Integer> entry : frequencyMap.entrySet()) {

                System.out.println(entry.getKey() + ": " + entry.getValue());
            }
        }
    }





