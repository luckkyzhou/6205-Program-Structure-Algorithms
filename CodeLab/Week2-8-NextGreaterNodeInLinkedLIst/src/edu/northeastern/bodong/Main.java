package edu.northeastern.bodong;

import java.util.Stack;

public class Main {

    public static void main(String[] args) {
	// write your code here
    }

    public static int[] reverse(ListNode head){
        Stack<Integer> stack = new Stack<>();
        int index = 0;
        while(head != null){
            stack.push(head.val);
            head = head.next;
            index++;
        }
        int[] res = new int[index];
        for(int i=0;i<index;i++){
            res[i] = stack.pop();
        }
        return res;
    }

    public int[] nextLargerNodes(ListNode head) {
        int[] list = reverse(head);
        Stack<Integer> stack = new Stack<>();
        for (int j : list) {
            if (stack.isEmpty()) {
                stack.push(j);
            }
            if (j > stack.peek()){
                stack.push(j);
            }
        }
        ListNode dummy = head;
        while (head != null){
            if (stack.peek()>head.val){
                head.val = stack.peek();
            } else if (stack.peek()==head.val) {
                head.val = 0;
                stack.pop();
            }
            head = head.next;
        }
        head = dummy;
        for(int i = 0;i < list.length; i++){
            list[i] = head.val;
            head = head.next;
        }
        return list;
    }

}

