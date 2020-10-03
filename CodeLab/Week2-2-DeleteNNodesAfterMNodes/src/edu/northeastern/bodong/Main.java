package edu.northeastern.bodong;

import java.util.List;

public class Main {

    public static void main(String[] args) {
	// write your code here
    }

    public static ListNode deleteNNodes(ListNode head, int m, int n){
        ListNode temp = new ListNode(0);
        ListNode tempHead = temp;

        while(head != null){
            int p = m;
            int q = n;
            while(p>0 && head != null){
                temp.next = head;
                temp = temp.next;
                head = head.next;
                p--;
            }
            while(q>0 && head != null){
                head = head.next;
                q--;
            }
        }
        return tempHead.next;
    }


}

