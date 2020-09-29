package edu.northeastern.bodong;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class Main {

    public static void main(String[] args) {
	// write your code here
    }

    public boolean isValid(String s) {
        if (s.length() % 2 == 1){
            return false;
        }
        Map<Character, Character> hash = new HashMap<Character, Character>();
        hash.put(')','(');
        hash.put(']','[');
        hash.put('}','{');
        Stack<Character> stack = new Stack<>();
        for (int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            if (hash.containsKey(ch)){
                if (stack.isEmpty() || stack.peek() != hash.get(ch)){
                    return false;
                }
                stack.pop();
            } else {
                stack.push(ch);
            }
        }
        return stack.isEmpty();
    }
}
