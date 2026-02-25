import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;
public class UseCase6PalindromeCheckerApp {
    public static void main(String[] args) {
        System.out.println("   PALINDROME CHECKER - UC6 (Queue + Stack)");
        String word = "level";
        Queue<Character> queue = new LinkedList<>();
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < word.length(); i++) {
            char ch = word.charAt(i);
            queue.add(ch);  // enqueue
            stack.push(ch); // push
        }
        boolean isPalindrome = true;
        while (!queue.isEmpty()) {
            if (!queue.remove().equals(stack.pop())) {
                isPalindrome = false;
                break;
            }
        }
        if (isPalindrome) {
            System.out.println("Given Word: " + word + " is a Palindrome");
        } else {
            System.out.println("Given Word: " + word + " is NOT a Palindrome");
        }
        System.out.println("Program Completed Successfully");
    }
}