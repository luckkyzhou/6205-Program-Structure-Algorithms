package edu.northeastern.bodong;

public class Main {

    public static void main(String[] args) {
	// write your code here
    }

    public static ListNode oddEvenLinkedList(ListNode head){
        ListNode odd = new ListNode(0);
        ListNode oddHead = odd.next;
        ListNode even = new ListNode(0);
        ListNode evenHead = even.next;
        int index = 1;

        while(head != null){
            if(index % 2 == 1) {
                odd.next = head;
                odd = odd.next;
            }else{
                even.next = head;
                even = even.next;
            }
            head = head.next;
            index++;
        }
        even.next = null;
        odd.next = evenHead.next;
        return oddHead.next;
    }
}

