public class UseCase9PalindromeCheckerApp {
    public static boolean isPalindrome(String word, int start, int end) {
        if (start >= end) return true; // Base condition
        if (word.charAt(start) != word.charAt(end)) return false;
        return isPalindrome(word, start + 1, end - 1); // Recursive call
    }
    public static void main(String[] args) {
        System.out.println("   PALINDROME CHECKER - UC9 (Recursive)");
        String word = "level";
        boolean result = isPalindrome(word, 0, word.length() - 1);
        if (result) {
            System.out.println("Given Word: " + word + " is a Palindrome");
        } else {
            System.out.println("Given Word: " + word + " is NOT a Palindrome");
        }
        System.out.println("Program Completed Successfully");
    }
}