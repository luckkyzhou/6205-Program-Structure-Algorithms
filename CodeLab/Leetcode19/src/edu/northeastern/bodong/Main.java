package edu.northeastern.bodong;

public class Main {

    public static void main(String[] args) {
	// write your code here
    }

    public static ListNode removeNthNode(ListNode head, int n){
        ListNode node = new ListNode(0);
        node.next = head;
        ListNode first = node;
        ListNode second = node;
        for(int i=0;i<=n;i++){
            second = second.next;
        }
        while(second != null){
            first = first.next;
            second = second.next;
        }
        second.next = second.next.next;
        return head;
    }
}

