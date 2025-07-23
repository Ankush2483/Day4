package Collection.List;
import java.util.Arrays;
import java.util.List;
//Check if a list is a palindrome
public class Ex5 {
        public static boolean isPalindrome(List<Integer> list) {
            int left = 0;
            int right = list.size() - 1;

            while (left < right) {
                if (!list.get(left).equals(list.get(right))) {
                    return false;
                }
                left++;
                right--;
            }
            return true;
        }
        public static void main(String[] args) {
            List<Integer> testList1 = Arrays.asList(1, 2, 3, 2, 1);
            List<Integer> testList2 = Arrays.asList(1, 2, 3, 4, 5);

            System.out.println("List 1 is palindrome: " + isPalindrome(testList1)); // true
            System.out.println("List 2 is palindrome: " + isPalindrome(testList2)); // false
        }
    }
















