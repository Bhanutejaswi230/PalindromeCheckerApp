public class PalindromeCheckerApp {

    public static void main(String[] args) {

        // UC1 – Welcome Message
        System.out.println("   Welcome to Palindrome Checker   ");
        // UC2 – Hardcoded Palindrome Check
        String word = "madam";

        if(word.equals("madam")) {
            System.out.println(word + " is a Palindrome");
        } else {
            System.out.println(word + " is not a Palindrome");
        }
    }
}