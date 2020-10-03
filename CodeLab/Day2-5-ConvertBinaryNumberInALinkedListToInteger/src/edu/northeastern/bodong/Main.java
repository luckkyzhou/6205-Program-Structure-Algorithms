package edu.northeastern.bodong;

import java.util.Stack;

public class Main {

    public static void main(String[] args) {
	// write your code here
    }

    public static int convertBinaryToInteger(ListNode head){
        if(head == null){
            return 0;
        }
        Stack<Integer> stack = new Stack<>();
        int sum = 0;
        int carry = 0;
        while(head != null){
            stack.push(head.val);
            head = head.next;
        }
        while(!stack.isEmpty()){
            int b = stack.pop();
            sum += b * Math.pow(10, carry);
            carry += 1;
        }
        return sum;
    }
}

