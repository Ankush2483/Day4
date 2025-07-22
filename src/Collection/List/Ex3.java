package Collection.List;

import java.util.ArrayList;
import java.util.List;

//Sort a list of integers in descending order.
public class Ex3 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        List<Integer> list2 = new ArrayList<>();

            for(int i =5;i>0;i--){
                list2.add(i);
            }
        System.out.println("list in descending order:"+list2);
    }
}
