public class PalindromeCheckerApp {
    static class Node {
        char data;
        Node next;

        Node(char data) {
            this.data = data;
            this.next = null;
        }
    }
    public static void main(String[] args) {
        // UC8: Linked List Based Palindrome Checker
        String original = "madam";
        Node head = null;
        Node tail = null;
        for (int i = 0; i < original.length(); i++) {
            Node newNode = new Node(original.charAt(i));
            if (head == null) {
                head = newNode;
                tail = newNode;
            } else {
                tail.next = newNode;
                tail = newNode;
            }
        }
        Node slow = head;
        Node fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        Node prev = null;
        Node current = slow;
        while (current != null) {
            Node next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        Node first = head;
        Node second = prev;
        boolean isPalindrome = true;
        while (second != null) {
            if (first.data != second.data) {
                isPalindrome = false;
                break;
            }
            first = first.next;
            second = second.next;
        }
        if (isPalindrome) {
            System.out.println(original + " is a Palindrome");
        } else {
            System.out.println(original + " is NOT a Palindrome");
        }
    }
}