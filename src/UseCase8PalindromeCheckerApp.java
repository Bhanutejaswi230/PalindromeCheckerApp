public class UseCase8PalindromeCheckerApp {
    static class Node {
        char data;
        Node next;
        Node(char data) {
            this.data = data;
            this.next = null;
        }
    }
    public static boolean isPalindrome(Node head) {
        if (head == null || head.next == null) return true;
        Node slow = head, fast = head;
        while (fast.next != null && fast.next.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        Node secondHalf = reverseList(slow.next);
        Node firstHalf = head;
        Node tempSecond = secondHalf;
        boolean palindrome = true;
        while (tempSecond != null) {
            if (firstHalf.data != tempSecond.data) {
                palindrome = false;
                break;
            }
            firstHalf = firstHalf.next;
            tempSecond = tempSecond.next;
        }
        slow.next = reverseList(secondHalf);
        return palindrome;
    }
    private static Node reverseList(Node head) {
        Node prev = null, curr = head, next = null;
        while (curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        return prev;
    }
    public static Node buildLinkedList(String word) {
        if (word.length() == 0) return null;
        Node head = new Node(word.charAt(0));
        Node current = head;
        for (int i = 1; i < word.length(); i++) {
            current.next = new Node(word.charAt(i));
            current = current.next;
        }
        return head;
    }
    public static void main(String[] args) {
        System.out.println("   PALINDROME CHECKER - UC8 (LinkedList)");
        String word = "level";
        Node head = buildLinkedList(word);
        boolean result = isPalindrome(head);
        if (result) {
            System.out.println("Given Word: " + word + " is a Palindrome");
        } else {
            System.out.println("Given Word: " + word + " is NOT a Palindrome");
        }
        System.out.println("Program Completed Successfully");
    }
}