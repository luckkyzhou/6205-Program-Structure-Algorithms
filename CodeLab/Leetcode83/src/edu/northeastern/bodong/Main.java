package edu.northeastern.bodong;

public class Main {

    public static void main(String[] args) {
	// write your code here
    }

    public static ListNode removeDuplicatesFromSortedList(ListNode head){
        if(head == null){
            return null;
        }
        if(head.next == null){
            return head;
        }

        while(head.next != null){
            if(head.val == head.next.val){
                head.next = head.next.next;
                continue;
            }
            head = head.next;
        }
        return head;
    }
}
