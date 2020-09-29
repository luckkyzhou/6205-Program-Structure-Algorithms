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

    public static ListNode reverseKGroup(ListNode head, int k) {
        ListNode res = new ListNode(0);
        ListNode resHead = res;
        ListNode slow = head;
        ListNode quick = head;
        while(quick != null){
            int index = 1;
            for(int i=0;i<k-1;i++){
                if(quick.next != null){
                    quick = quick.next;
                    index ++;
                }
            }
            if(index==k) {
                ListNode dummy = quick.next;
                quick.next = null;
                ListNode temp = reverse(slow);
                res.next = temp;
                res = res.next;
                slow = dummy;
                quick = dummy;
            }else{
                res.next = slow;
                res = res.next;
            }
        }
        return resHead;
    }
}

