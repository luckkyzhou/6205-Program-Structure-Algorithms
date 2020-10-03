package edu.northeastern.bodong;

public class Main {

    public static void main(String[] args) {
	// write your code here
    }
    public ListNode deleteDuplicates(ListNode head) {
        if(head==null || head.next==null) {
            return head;
        }

        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode slow = dummy;
        ListNode quick = dummy.next;

        while(quick != null && quick.next != null){
            while(slow.next.val == quick.next.val){
                quick = quick.next;
            }
            slow.next = quick.next;
            slow = slow.next;
            quick = quick.next;
        }
        return dummy.next;
    }
}

