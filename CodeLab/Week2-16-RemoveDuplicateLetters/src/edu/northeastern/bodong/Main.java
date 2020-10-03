package edu.northeastern.bodong;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Stack;

public class Main {

    public static void main(String[] args) {
	// write your code here
    }

    public String removeDuplicateLetters(String s) {
        Stack<Character> stack = new Stack<>();
        HashSet<Character> seen = new HashSet<>();
        HashMap<Character, Integer> hash = new HashMap<>();
        for(int i = 0; i < s.length(); i++) {
            hash.put(s.charAt(i), i);
        }

        for(int i = 0; i < s.length(); i++){
            char c = s.charAt(i);
            if (!seen.contains(c)){
                while(!stack.isEmpty() && c < stack.peek() && hash.get(stack.peek()) > i){
                    seen.remove(stack.pop());
                }
                seen.add(c);
                stack.push(c);
            }
        }
        StringBuilder res = new StringBuilder(stack.size());
        for (Character c : stack) res.append(c.charValue());
        return res.toString();
    }
}