package edu.northeastern.bodong;

import java.util.HashSet;

public class Main {

    public static void main(String[] args) {
        String str = "apple";
        System.out.println(isUnique(str));
    }

    public static boolean isUnique(String str){
        HashSet<Character> set = new HashSet<>();
        for(int i=0;i<str.length();i++){
            if(set.contains(str.charAt(i))){
                return false;
            }
            set.add(str.charAt(i));
        }
        return true;
    }
}
