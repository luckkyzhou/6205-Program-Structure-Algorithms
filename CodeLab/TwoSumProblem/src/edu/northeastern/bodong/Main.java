package edu.northeastern.bodong;

import java.util.Arrays;
import java.util.HashMap;

public class Main {

    public static void main(String[] args) {
        int[] arr = {1,2,3,7};
        int target = 5;
        int[] res = (int[]) twoSumProblem(arr, target);
        System.out.println(Arrays.toString(res));
    }

    public static Object twoSumProblem(int[] arr, int target){
        if (arr == null || arr.length <= 1) {
            return false;
        }

        HashMap<Integer, Integer> kvmap = new HashMap<Integer, Integer>();
        for (int i=0; i<arr.length;i++){
            int temp = target - arr[i];
            if(kvmap.containsKey(temp)){
                return new int[] {kvmap.get(temp), i};
            }
            kvmap.put(arr[i], i);
        }
        return false;
    }
}
