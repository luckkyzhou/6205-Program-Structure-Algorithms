package edu.northeastern.bodong;

import java.util.Stack;

public class Main {

    public static void main(String[] args) {
	// write your code here
    }
    public static String removeOuterParentheses(String S){
        StringBuilder res = new StringBuilder();
        Stack<Character> stack = new Stack<>();
        for(int i=0;i<S.length();i++){
            char ch = S.charAt(i);
            if (ch=='('){
                if (!stack.isEmpty()){
                    res.append(ch);
                }
                stack.push('(');
            } else if (ch == ')'){
                stack.pop();
                if (!stack.isEmpty()){
                    res.append(ch);
                }
            }
        }
        return res.toString();
    }
}
