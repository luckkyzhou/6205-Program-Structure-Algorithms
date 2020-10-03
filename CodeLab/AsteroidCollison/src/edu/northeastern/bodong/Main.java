package edu.northeastern.bodong;

import java.util.Stack;

public class Main {

    public static void main(String[] args) {
	// write your code here
    }

    public static int[] asteroidCollision(int[] asteroids){
        Stack<Integer> stack = new Stack<>();
        for (int ast: asteroids) {
            collision: {
                while (!stack.isEmpty() && ast < 0 && 0 < stack.peek()) {
                    if (stack.peek() < -ast) {
                        stack.pop();
                        continue;
                    } else if (stack.peek() == -ast) {
                        stack.pop();
                    }
                    break collision;
                }
                stack.push(ast);
            }
        }

        int[] res = new int[stack.size()];
        for(int i=res.length-1;i>0;i--){
            res[i] = stack.pop();
        }
        return res;
    }
}
