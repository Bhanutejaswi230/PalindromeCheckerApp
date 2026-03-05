import java.util.Deque;
import java.util.LinkedList;
import java.util.Stack;
public class PalindromeCheckerApp {
    interface PalindromeStrategy {
        boolean isPalindrome(String str);
    }
    static class StackStrategy implements PalindromeStrategy {
        @Override
        public boolean isPalindrome(String str) {
            Stack<Character> stack = new Stack<>();
            for (char ch : str.toCharArray()) stack.push(ch);
            for (char ch : str.toCharArray()) {
                if (ch != stack.pop()) return false;
            }
            return true;
        }
    }
    static class DequeStrategy implements PalindromeStrategy {
        @Override
        public boolean isPalindrome(String str) {
            Deque<Character> deque = new LinkedList<>();
            for (char ch : str.toCharArray()) deque.addLast(ch);

            while (deque.size() > 1) {
                if (deque.removeFirst() != deque.removeLast()) return false;
            }
            return true;
        }
    }
    public static void main(String[] args) {
        String original = "madam";
        PalindromeStrategy strategy;
        strategy = new StackStrategy();
        System.out.println("Using StackStrategy:");
        if (strategy.isPalindrome(original)) {
            System.out.println(original + " is a Palindrome");
        } else {
            System.out.println(original + " is NOT a Palindrome");
        }
        strategy = new DequeStrategy();
        System.out.println("\nUsing DequeStrategy:");
        if (strategy.isPalindrome(original)) {
            System.out.println(original + " is a Palindrome");
        } else {
            System.out.println(original + " is NOT a Palindrome");
        }
    }
}