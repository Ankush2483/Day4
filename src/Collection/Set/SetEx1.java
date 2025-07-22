package Collection.Set;

import java.util.HashSet;
import java.util.Set;

//Find common elements between two sets.
public class SetEx1 {
    public static void main(String[] args) {
         Set<String> set1 = new HashSet<>();
         Set<String> set2 = new HashSet<>();
         set1.add("A");
         set1.add("B");
         set1.add("C");
         set1.add("D");
        System.out.println(set1);
         set2.add("A");
         set2.add("B");
         set2.add("H");
         set2.add("K");
        System.out.println(set2);
        set1.retainAll(set2);
        System.out.println("Common element"+set1);
    }
}
