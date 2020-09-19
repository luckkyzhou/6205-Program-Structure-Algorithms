package edu.northeastern.bodong;

public class Main {

    public static void main(String[] args) {
	// write your code here
    }

    public static ListNode partitionList(ListNode head, int x){
        ListNode firstHead = new ListNode(0);
        ListNode first = firstHead;
        ListNode secondHead = new ListNode(0);
        ListNode second = secondHead;

        while(head != null){
            if(head.val<x){
                first.next = head;
                first = first.next;
            } else {
                second.next = head;
                second = second.next;
            }
            head = head.next;
        }

        second.next = null;
        first.next = secondHead.next;
        return firstHead.next;
    }
}

