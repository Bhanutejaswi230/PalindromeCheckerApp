interface PalindromeStrategy {
    boolean check(String word);
}
class StackStrategy implements PalindromeStrategy {
    public boolean check(String word) {
        java.util.Stack<Character> stack = new java.util.Stack<>();
        for (char ch : word.toCharArray()) {
            stack.push(ch);
        }
        for (char ch : word.toCharArray()) {
            if (ch != stack.pop()) return false;
        }
        return true;
    }
}
class DequeStrategy implements PalindromeStrategy {
    public boolean check(String word) {
        java.util.Deque<Character> deque = new java.util.LinkedList<>();
        for (char ch : word.toCharArray()) {
            deque.add(ch);
        }
        while (deque.size() > 1) {
            if (!deque.removeFirst().equals(deque.removeLast())) return false;
        }
        return true;
    }
}
class PalindromeContext {
    private PalindromeStrategy strategy;

    public PalindromeContext(PalindromeStrategy strategy) {
        this.strategy = strategy;
    }

    public boolean executeStrategy(String word) {
        return strategy.check(word);
    }
}
public class UseCase12PalindromeCheckerApp {
    public static void main(String[] args) {
        System.out.println("   PALINDROME CHECKER - UC12 (Strategy Pattern)");
        String word = "deed";
        PalindromeContext context = new PalindromeContext(new StackStrategy());
        boolean resultStack = context.executeStrategy(word);
        System.out.println("[Stack Strategy] " + word + " is " + (resultStack ? "Palindrome" : "NOT Palindrome"));
        context = new PalindromeContext(new DequeStrategy());
        boolean resultDeque = context.executeStrategy(word);
        System.out.println("[Deque Strategy] " + word + " is " + (resultDeque ? "Palindrome" : "NOT Palindrome"));
        System.out.println("Program Completed Successfully");
    }
}