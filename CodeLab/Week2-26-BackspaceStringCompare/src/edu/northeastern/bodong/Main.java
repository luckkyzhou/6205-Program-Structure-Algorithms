package edu.northeastern.bodong;

import java.util.Stack;

public class Main {

    public static void main(String[] args) {
	// write your code here
    }
    public static boolean backspaceCompare(String S, String T) {
        Stack<Character> stack1 = new Stack<>();
        Stack<Character> stack2 = new Stack<>();
        for(int i=0;i<S.length();i++){
            char ch = S.charAt(i);
            if(!stack1.isEmpty() && ch=='#'){
                stack1.pop();
            } else {
                stack1.push(ch);
            }
        }
        for(int i=0;i<S.length();i++){
            char ch = S.charAt(i);
            if(!stack2.isEmpty() && ch=='#'){
                stack2.pop();
            } else if(ch != '#') {
                stack2.push(ch);
            }
        }
        if(stack1.size()!=stack2.size()){
            return false;
        }
        while(!stack1.isEmpty()){
            if(stack1.pop()!=stack2.pop()){
                return false;
            }
        }
        return true;
    }
}
