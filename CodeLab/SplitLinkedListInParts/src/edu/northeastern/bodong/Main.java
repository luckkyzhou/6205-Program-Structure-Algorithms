package edu.northeastern.bodong;

public class Main {

    public static void main(String[] args) {
	// write your code here
    }

    public static ListNode[] splitListToParts(ListNode root, int k) {
        ListNode[] res = new ListNode[k];
        int n = 0;
        ListNode cur = root;
        while(cur != null){
            n++;
            cur = cur.next;
        }
        int width = n / k;
        int reminder = n % k;
        cur = root;
        for(int i=0;i<k;i++){
            ListNode head = cur;
            for(int j = 0;j < width + (i < reminder ? 1:0); j++){
                if(cur != null){
                    cur = cur.next;
                }
            }
            if(cur != null){
                ListNode temp = cur;
                cur = cur.next;
                temp.next = null;
            }
            res[i] = head;
        }
        return res;
    }
}

