package Map;
// Group a list of names by their starting character.
import java.util.Map;
import java.util.TreeMap;

public class Ex3 {
    public static void main(String[] args) {
        Map<Integer,String> map = new TreeMap<>();
        map.put(13,"java");
        map.put(11,"Hello");
        map.put(14,"android");
        map.put(12,"World");
        for(Map.Entry<Integer,String> entry:map.entrySet()){
            System.out.println(entry.getValue());
        }
    }
}
