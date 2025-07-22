package Collection.List;

import java.util.ArrayList;
import java.util.List;

//Find the second-highest number in a list.
public class Ex4 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        for(int i=0;i<list.size();i++) {
            if(list.get(i)==4) {
                System.out.println(list.get(i));
            }
        }
    }
}
