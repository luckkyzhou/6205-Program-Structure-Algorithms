package edu.northeastern.bodong;

import java.util.Stack;

public class Main {

    public static void main(String[] args) {
	// write your code here
    }
    public static int[] dailyTemperatures(int[] T) {
        Stack<Integer> stack = new Stack<>();
        int[] res = new int[T.length];
        for(int i=0;i<T.length;i++){
            int t = T[i];
            while(!stack.isEmpty() && t > T[stack.peek()]){
                int prev = stack.pop();
                res[prev] = i - prev;
            }
            stack.push(i);
        }
    }
}
