package Collection.Set;
import java.util.*;

//Find the first repeated element in a list
public class SetEx5 {
    public static Integer findFirstRepeated(List<Integer> list) {
        Set<Integer> seen = new HashSet<>();
        for (Integer num : list) {
            if (seen.contains(num)) {
                return num;  // First repeated element
            }
            seen.add(num);
        }
        return null;
    }
            public static void main(String[] args) {
                List<Integer> numbers = Arrays.asList(3, 5, 4, 3, 2, 5, 1);
                Integer result = findFirstRepeated(numbers);
                if (result != null) {
                    System.out.println("First repeated element: " + result);
                } else {
                    System.out.println("No repeated elements found.");
                }
            }
        }


