public class UseCase13PalindromeCheckerApp {
    public static boolean simpleReverse(String word) {
        String reversed = new StringBuilder(word).reverse().toString();
        return word.equals(reversed);
    }
    public static boolean stackCheck(String word) {
        java.util.Stack<Character> stack = new java.util.Stack<>();
        for (char ch : word.toCharArray()) stack.push(ch);
        for (char ch : word.toCharArray()) if (ch != stack.pop()) return false;
        return true;
    }
    public static boolean dequeCheck(String word) {
        java.util.Deque<Character> deque = new java.util.LinkedList<>();
        for (char ch : word.toCharArray()) deque.add(ch);
        while (deque.size() > 1) if (!deque.removeFirst().equals(deque.removeLast())) return false;
        return true;
    }
    public static void main(String[] args) {
        System.out.println("   PALINDROME CHECKER - UC13 (Performance Comparison)");
        String word = "racecar";
        long start = System.nanoTime();
        simpleReverse(word);
        long end = System.nanoTime();
        System.out.println("[Simple Reverse] Time: " + (end - start) + " ns");
        start = System.nanoTime();
        stackCheck(word);
        end = System.nanoTime();
        System.out.println("[Stack Check] Time: " + (end - start) + " ns");
        start = System.nanoTime();
        dequeCheck(word);
        end = System.nanoTime();
        System.out.println("[Deque Check] Time: " + (end - start) + " ns");
        System.out.println("Program Completed Successfully");
    }
}