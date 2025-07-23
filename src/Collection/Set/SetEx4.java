package Collection.Set;

import java.util.HashSet;
import java.util.Set;

//Count the number of unique characters in a string using a set.
public class SetEx4 {
        public static int countUniqueCh(String input) {
            Set<Character> uniqueCh = new HashSet<>();

            for (char c : input.toCharArray()) {
                uniqueCh.add(c);
            }
            return uniqueCh.size();
        }
        public static void main(String[] args) {
            String input = "hello world";
            int count = countUniqueCh(input);
            System.out.println("Number of unique characters: " + count);
        }
    }


