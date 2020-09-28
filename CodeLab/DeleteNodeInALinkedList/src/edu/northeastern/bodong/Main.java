package edu.northeastern.bodong;

public class Main {

    public static void main(String[] args) {
	// write your code here
    }

    public static void deleteNode(ListNode node){
        node.val = node.next.val;
        node.next = node.next.next;
    }
}

