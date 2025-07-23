package Collection.List;
import java.util.Arrays;
import java.util.List;

//Find the second-highest number in a list
public class Ex4 {
    public class SecondHighest {
        public static void main(String[] args) {
            int[] numbers = {12, 45, 67, 45, 89, 89, 23};

            Integer first = null;
            Integer second = null;

            for (int number : numbers) {
                if (first == null || number > first) {
                    second = first;
                    first = number;
                } else if ((number != first) && (second == null || number > second)) {
                    second = number;
                }
            }

            if (second != null) {
                System.out.println("Second highest number is: " + second);
            } else {
                System.out.println("There is no second highest number.");
            }
        }
    }


}





