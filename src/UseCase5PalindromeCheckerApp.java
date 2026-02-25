import java.util.Stack;

public class UseCase5PalindromeCheckerApp {
    public static void main(String[] args) {
        System.out.println("   PALINDROME CHECKER - UC5 (Stack)");
        String word = "madam";
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < word.length(); i++) {
            stack.push(word.charAt(i));
        }
        String reversed = "";
        while (!stack.isEmpty()) {
            reversed += stack.pop();
        }
        System.out.println("Given Word: " + word);
        System.out.println("Reversed using Stack: " + reversed);
        if (word.equals(reversed)) {
            System.out.println("Result: " + word + " is a Palindrome");
        } else {
            System.out.println("Result: " + word + " is NOT a Palindrome");
        }
        System.out.println("Program Completed Successfully");
    }
}
