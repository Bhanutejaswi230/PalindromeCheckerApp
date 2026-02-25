public class UseCase4PalindromeCheckerApp {
    public static void main(String[] args) {
        System.out.println("   PALINDROME CHECKER - UC4");
        String word = "racecar";
        char[] chars = word.toCharArray();
        boolean isPalindrome = true;
        int start = 0;
        int end = chars.length - 1;
        while (start < end) {
            if (chars[start] != chars[end]) {
                isPalindrome = false;
                break;
            }
            start++;
            end--;
        }
        if (isPalindrome) {
            System.out.println("Given Word: " + word + " is a Palindrome");
        } else {
            System.out.println("Given Word: " + word + " is NOT a Palindrome");
        }
        System.out.println("Program Completed Successfully");
    }
}