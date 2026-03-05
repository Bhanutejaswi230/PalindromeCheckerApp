public class PalindromeCheckerApp {
    public static void main(String[] args) {
        // UC10: Case-Insensitive & Space-Ignored Palindrome
        String original = "A man a plan a canal Panama";
        String normalized = original.replaceAll("\\s+", "").toLowerCase();
        boolean isPalindrome = true;
        int n = normalized.length();
        for (int i = 0; i < n / 2; i++) {
            if (normalized.charAt(i) != normalized.charAt(n - 1 - i)) {
                isPalindrome = false;
                break;
            }
        }
        if (isPalindrome) {
            System.out.println("\"" + original + "\" is a Palindrome (ignoring spaces and case)");
        } else {
            System.out.println("\"" + original + "\" is NOT a Palindrome (ignoring spaces and case)");
        }
    }
}