package Map;
import java.util.HashMap;
import java.util.Map;
public class Ex2 {
    public static class DuplicateCounter {
        public static void main(String[] args) {
            int[] numbers = {4, 5, 6, 4, 5, 6, 7, 4, 5};

            Map<Integer, Integer> countMap = new HashMap<>();

            // Count occurrences
            for (int number : numbers) {
                countMap.put(number, countMap.getOrDefault(number, 0) + 1);
            }

            // Print duplicates with counts
            System.out.println("Duplicate elements and their counts:");
            for (Map.Entry<Integer, Integer> entry : countMap.entrySet()) {
                if (entry.getValue() > 1) {
                    System.out.println("Number: " + entry.getKey() + ", Count: " + entry.getValue());
                }
            }
        }
    }

}
