public class PalindromeCheckerApp {

    // UC1 - Welcome Message
    public static void UC1() {
        System.out.println("Welcome to Palindrome Checker App!");
    }

    // UC2 - Hardcoded Palindrome
    public static void UC2() {
        String word = "madam";
        if(word.equals("madam")) {
            System.out.println(word + " is a Palindrome");
        } else {
            System.out.println(word + " is not a Palindrome");
        }
    }

    // UC3 - String Reverse
    public static void UC3() {
        String word = "racecar";
        String reversed = "";
        for(int i = word.length()-1; i >=0; i--) {
            reversed += word.charAt(i);
        }
        System.out.println(word + " is " + (word.equals(reversed) ? "" : "NOT ") + "Palindrome");
    }

  