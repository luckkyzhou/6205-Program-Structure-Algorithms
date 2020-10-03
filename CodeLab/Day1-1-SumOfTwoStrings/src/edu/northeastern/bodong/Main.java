package edu.northeastern.bodong;

import java.lang.reflect.Array;
import java.util.Stack;

public class Main {

    public static void main(String[] args) {
        System.out.println(sumOfTwoStrings("123", "456"));
    }

    public static String sumOfTwoStrings(String str1, String str2) {
        // Get the length of str1 and str2
        int len1 = str1.length() - 1;
        int len2 = str2.length() - 1;
        // The sum of two str
        Stack<Integer> stack = new Stack<Integer>();
        StringBuilder res = new StringBuilder();
        // The carry during the process
        int carry = 0;

        while (len1 >= 0 && len2 >= 0) {
            // Convert str into int
            int num1 = (int)str1.charAt(len1) - (int)('0');
            int num2 = (int)str2.charAt(len2) - (int)('0');
            int sum = num1 + num2 + carry;
            carry = sum/10;
            sum %= 10;
            stack.push(sum);
            len1--;
            len2--;
        }

        while (len1>=0){
            int num1 = (int)str1.charAt(len1) - (int)('0');
            int sum = num1 + carry;
            carry = sum/10;
            sum %= 10;
            stack.push(sum);
            len1 --;
        }

        while (len2>=0){
            int num2 = (int)str2.charAt(len2) - (int)('0');
            int sum = num2 + carry;
            carry = sum/10;
            sum %= 10;
            stack.push(sum);
            len2 --;
        }

        while (!stack.isEmpty()){
            res.append(stack.pop());
        }

        return res.toString();
    }
}
