package edu.northeastern.bodong;

public class Main {

    public static void main(String[] args) {
	// write your code here
    }

    public ListNode swapPairs(ListNode head) {
        ListNode dummy = head;
        while(head != null & head.next != null){
            int temp = head.val;
            head.val = head.next.val;
            head.next.val = temp;
            head = head.next.next;
        }
        return dummy;
    }
}

