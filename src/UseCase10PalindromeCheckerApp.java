import java.util.Deque;
import java.util.LinkedList;
public class UseCase10PalindromeCheckerApp {
    public static boolean isPalindrome(String word) {
        Deque<Character> deque = new LinkedList<>();
        for (char ch : word.toCharArray()) {
            deque.add(ch);
        }
        while (deque.size() > 1) {
            if (!deque.removeFirst().equals(deque.removeLast())) {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        System.out.println("   PALINDROME CHECKER - UC10 (Advanced)");
        String word = "deed";
        boolean result = isPalindrome(word);
        if (result) {
            System.out.println("Given Word: " + word + " is a Palindrome");
        } else {
            System.out.println("Given Word: " + word + " is NOT a Palindrome");
        }
        System.out.println("Program Completed Successfully");
    }
}