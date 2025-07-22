package Collection.Set;
//Check if two sets are equal.
import java.util.HashSet;
import java.util.Set;

public class SetEx3 {
    public static void main(String[] args) {
        Set<String> set1 = new HashSet<>();
        set1.add("A");
        set1.add("B");
        set1.add("C");
        set1.add("D");

        Set<String> set2 = new HashSet<>();
        set2.add("A");
        set2.add("B");
        set2.add("C");
        set2.add("D");
        // first type check equals set
        boolean equals = set1.equals(set2);
        System.out.println(equals);


    }
}
