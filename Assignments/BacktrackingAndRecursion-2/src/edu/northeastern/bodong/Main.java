package edu.northeastern.bodong;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

    public static void combinations(List<Integer> cur, List<Integer> list, int idx){
        int sum = 0;
        for (int i: cur){
            sum += i;
        }
        if (sum == 73){
            System.out.println(cur);
        }
        if (idx==list.size()){
            return;
        }
        List<Integer> tmp = new ArrayList<>(cur);
        cur.add(list.get(idx));
        combinations(cur, list, idx + 1);
        combinations(tmp, list, idx + 1);
    }

    public static void main(String[] args) {
        combinations(new ArrayList<Integer>(), Arrays.asList(1,1,1,1,1,5,5,5,10,10,10,10,25,25), 0);
    }
}
