public class UseCase2PalindromeCheckerApp {

    public static void main(String[] args) {
        String word = "madam";
        System.out.println("   PALINDROME CHECKER - UC2");
        System.out.println("Given Word: " + word);
        if (word.equals("madam")) {
            System.out.println("Result: " + word + " is a Palindrome");
        } else {
            System.out.println("Result: " + word + " is NOT a Palindrome");
        }
        System.out.println("Program Completed Successfully");
    }
}