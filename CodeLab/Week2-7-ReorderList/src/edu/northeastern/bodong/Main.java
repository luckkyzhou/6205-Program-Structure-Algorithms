package edu.northeastern.bodong;

import java.util.Stack;

public class Main {

    public static void main(String[] args) {
	// write your code here
    }

    public static ListNode reverse(ListNode head){
        ListNode dummy = new ListNode(0);
        ListNode dummyHead = dummy;
        Stack<Integer> stack = new Stack<>();
        while(head != null){
            stack.push(head.val);
            head = head.next;
        }
        while(!stack.isEmpty()){
            dummy.next = new ListNode(stack.pop());
            dummy = dummy.next;
        }
        return dummyHead.next;
    }

    public ListNode reorderList(ListNode head) {
        ListNode dummy = head;
        int n = 0;
        while(dummy.next != null){
            n++;
            dummy = dummy.next;
        }
        int half = n / 2;
        dummy = head;
        for(int i=0;i<half-1;i++){
            dummy = dummy.next;
        }
        ListNode b = dummy.next;
        ListNode a = head;
        dummy.next = null;
        b = reverse(b);
        ListNode res = new ListNode(0);
        ListNode resHead = res;
        for(int i=0;i<half;i++){
            res.next = new ListNode(a.val);
            res = res.next;
            res.next = new ListNode(b.val);
            res = res.next;
            a = a.next;
            b = b.next;
        }
        if(n%2==1){
            res.next = new ListNode(b.val);
        }
        return resHead;
    }
}

