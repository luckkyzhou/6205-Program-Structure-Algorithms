package edu.northeastern.bodong;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void combinations(List<Integer> result, List<Integer> list, int n){
        if (n==0){
            for (int i : result) {
                System.out.print(i);
                System.out.print(' ');
            }
            System.out.println('\n');
            return;
        }
        if (list.isEmpty()) return;
        result.add(list.get(0));
        combinations(result, list.subList(1, list.size()), n-1);
        result.remove(result.size()-1);
        combinations(result, list.subList(1, list.size()), n);
    }

    public static void main(String[] args) {
	    combinations(new ArrayList<Integer>(), Arrays.asList(5,5,5,5,5,10,10,10,10,10,25,25,25,25,25), 5);
    }
}
