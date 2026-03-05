import java.util.Deque;
import java.util.LinkedList;
import java.util.Stack;
public class PalindromeCheckerApp {
    public static boolean stackPalindrome(String str) {
        Stack<Character> stack = new Stack<>();
        for (char ch : str.toCharArray()) stack.push(ch);
        for (char ch : str.toCharArray()) if (ch != stack.pop()) return false;
        return true;
    }
    public static boolean dequePalindrome(String str) {
        Deque<Character> deque = new LinkedList<>();
        for (char ch : str.toCharArray()) deque.addLast(ch);
        while (deque.size() > 1) if (deque.removeFirst() != deque.removeLast()) return false;
        return true;
    }
    public static boolean recursivePalindrome(String str, int start, int end) {
        if (start >= end) return true;
        if (str.charAt(start) != str.charAt(end)) return false;
        return recursivePalindrome(str, start + 1, end - 1);
    }
    public static void main(String[] args) {
        String testString = "A man a plan a canal Panama".replaceAll("\\s+", "").toLowerCase();
        long start = System.nanoTime();
        stackPalindrome(testString);
        long end = System.nanoTime();
        System.out.println("Stack strategy time: " + (end - start) + " ns");
        start = System.nanoTime();
        dequePalindrome(testString);
        end = System.nanoTime();
        System.out.println("Deque strategy time: " + (end - start) + " ns");
        start = System.nanoTime();
        recursivePalindrome(testString, 0, testString.length() - 1);
        end = System.nanoTime();
        System.out.println("Recursive strategy time: " + (end - start) + " ns");
    }
}