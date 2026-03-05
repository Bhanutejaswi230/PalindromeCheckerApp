import java.util.Deque;
import java.util.LinkedList;
public class PalindromeCheckerApp {
    public static void main(String[] args) {
        // UC7: Deque-Based Optimized Palindrome Checker
        String original = "madam";
        Deque<Character> deque = new LinkedList<>();
        for (int i = 0; i < original.length(); i++) {
            deque.addLast(original.charAt(i));
        }
        boolean isPalindrome = true;
        while (deque.size() > 1) {
            char front = deque.removeFirst();
            char rear = deque.removeLast();

            if (front != rear) {
                isPalindrome = false;
                break;
            }
        }
        if (isPalindrome) {
            System.out.println(original + " is a Palindrome");
        } else {
            System.out.println(original + " is NOT a Palindrome");
        }
    }
}