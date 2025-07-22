package Collection.Set;
//Remove all duplicates from a list using a set.
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class SetEx2 {
    public static void main(String[] args) {
        List<String> lst = new ArrayList<>();
        lst.add("K");
        lst.add("J");
        lst.add("N");
        lst.add("L");
        lst.add("M");
        lst.add("K");
        lst.add("J");
        System.out.println("original list "+lst);
        Set<String> set = new HashSet<>(lst);
        System.out.println("without duplicate list "+set);




    }
}
