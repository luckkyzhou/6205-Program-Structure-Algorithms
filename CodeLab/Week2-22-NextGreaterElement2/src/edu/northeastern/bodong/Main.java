package edu.northeastern.bodong;

import java.util.Stack;

public class Main {

    public static void main(String[] args) {
	// write your code here
    }

    public static int[] nextGreaterElements(int[] nums){
        int[] res = new int[nums.length];
        Stack<Integer> stack = new Stack<>();
        for(int i=0;i<nums.length;i++){
            while(!stack.isEmpty() && nums[i]>nums[stack.peek()]){
                res[stack.pop()] = nums[i];
            }
            stack.push(i);
        }

        for(int i=0;i<nums.length;i++){
            while(!stack.isEmpty() && nums[i]>nums[stack.peek()]) {
                res[stack.pop()] = nums[i];
            }
        }
        while(!stack.isEmpty()){
            res[stack.pop()] = -1;
        }
        return res;
    }
}
