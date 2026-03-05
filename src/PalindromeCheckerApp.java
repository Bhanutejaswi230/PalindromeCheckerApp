public class PalindromeCheckerApp {
    // UC11: Object-Oriented Palindrome Service
    static class PalindromeChecker {
        public boolean checkPalindrome(String str) {
            java.util.Stack<Character> stack = new java.util.Stack<>();
            for (int i = 0; i < str.length(); i++) {
                stack.push(str.charAt(i));
            }
            for (int i = 0; i < str.length(); i++) {
                if (str.charAt(i) != stack.pop()) {
                    return false;
                }
            }

            return true;
        }
    }
    public static void main(String[] args) {
        String original = "madam";
        PalindromeChecker checker = new PalindromeChecker();
        boolean result = checker.checkPalindrome(original);
        if (result) {
            System.out.println(original + " is a Palindrome");
        } else {
            System.out.println(original + " is NOT a Palindrome");
        }
    }
}