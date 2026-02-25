import java.util.Deque;
import java.util.LinkedList;
public class UseCase7PalindromeCheckerApp {
    public static void main(String[] args) {
        System.out.println("   PALINDROME CHECKER - UC7 (Deque)");
        String word = "radar";
        Deque<Character> deque = new LinkedList<>();
        for (char ch : word.toCharArray()) {
            deque.add(ch);
        }
        boolean isPalindrome = true;
        while (deque.size() > 1) {
            if (!deque.removeFirst().equals(deque.removeLast())) {
                isPalindrome = false;
                break;
            }
        }
        if (isPalindrome) {
            System.out.println("Given Word: " + word + " is a Palindrome");
        } else {
            System.out.println("Given Word: " + word + " is NOT a Palindrome");
        };
        System.out.println("Program Completed Successfully");
    }
}
