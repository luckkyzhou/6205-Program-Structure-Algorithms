package edu.northeastern.bodong;

import java.util.HashMap;

public class Main {

    public static void main(String[] args) {
	    String str1 = "abc";
	    String str2 = "bca";
        System.out.println(checkPermutation(str1, str2));
    }

    public static boolean checkPermutation(String str1, String str2){
        HashMap<Character, Integer> map1 = new HashMap<>();
        HashMap<Character, Integer> map2 = new HashMap<>();

        if(str1.isEmpty() || str2.isEmpty() || str1.length() != str2.length()){
            return false;
        }

        for(int i=0;i<str1.length();i++){
            if(map1.containsKey(str1.charAt(i))){
                map1.put(str1.charAt(i), map1.get(str1.charAt(i)) + 1);
            } else {
                map1.put(str1.charAt(i), 1);
            }

            if(map2.containsKey(str2.charAt(i))){
                map2.put(str2.charAt(i), map2.get(str2.charAt(i)) + 1);
            } else {
                map2.put(str2.charAt(i), 1);
            }
        }

        for (int i=0;i<str1.length();i++){
            Character chr = str1.charAt(i);
            if(!map2.containsKey(chr) || map1.get(chr) != map2.get(chr)){
                return false;
            }
        }
        return true;
    }
}
