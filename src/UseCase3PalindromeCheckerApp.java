public class UseCase3PalindromeCheckerApp {

    public static void main(String[] args) {
        System.out.println("   PALINDROME CHECKER - UC3");
        String original = "level";
        String reversed = "";
        System.out.println("Given Word: " + original);
        for (int i = original.length() - 1; i >= 0; i--) {
            reversed = reversed + original.charAt(i);
        }
        System.out.println("Reversed Word: " + reversed);
        if (original.equals(reversed)) {
            System.out.println("Result: " + original + " is a Palindrome");
        } else {
            System.out.println("Result: " + original + " is NOT a Palindrome");
        }
        System.out.println("Program Completed Successfully");
    }
}