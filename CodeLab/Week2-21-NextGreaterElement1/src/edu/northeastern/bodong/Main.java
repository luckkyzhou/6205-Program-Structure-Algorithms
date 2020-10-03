package edu.northeastern.bodong;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class Main {

    public static void main(String[] args) {
	// write your code here
    }

    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        Map<Integer, Integer> hash = new HashMap<Integer, Integer>();
        Stack<Integer> stack = new Stack<>();
        int[] res = new int[nums1.length];
        for (int i=0;i<nums2.length;i++){
            while (!stack.isEmpty() && nums2[i] > stack.peek()){
                hash.put(stack.pop(), nums2[i]);
            }
            stack.push(nums2[i]);
        }
        while(!stack.isEmpty()){
            hash.put(stack.pop(), -1);
        }
        for (int i=0;i<nums1.length;i++){
            res[i] = hash.get(nums1[i]);
        }
        return res;
    }
}
