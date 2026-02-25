import java.util.Stack;
class PalindromeChecker {
    private String word;
    public PalindromeChecker(String word) {
        this.word = word;
    }
    public boolean checkPalindrome() {
        Stack<Character> stack = new Stack<>();
        for (char ch : word.toCharArray()) {
            stack.push(ch);
        }
        for (char ch : word.toCharArray()) {
            if (ch != stack.pop()) {
                return false;
            }
        }
        return true;
    }
}
public class UseCase11PalindromeCheckerApp {
    public static void main(String[] args) {
        System.out.println("   PALINDROME CHECKER - UC11 (OOP Service)");
        String word = "racecar";
        PalindromeChecker checker = new PalindromeChecker(word);
        boolean result = checker.checkPalindrome();
        if (result) {
            System.out.println("Given Word: " + word + " is a Palindrome");
        } else {
            System.out.println("Given Word: " + word + " is NOT a Palindrome");
        }
        System.out.println("Program Completed Successfully");
    }
}