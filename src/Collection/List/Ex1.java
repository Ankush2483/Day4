package Collection.List;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

//Remove duplicates from a list of strings.
public class Ex1 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("a");
        list.add("b");
        list.add("c");
        list.add("d");
        list.add("a");
        list.add("b");
        System.out.println("original list "+list);
        Set<String> set = new HashSet<>(list);
        System.out.println("without duplicate list "+set);




    }
}
