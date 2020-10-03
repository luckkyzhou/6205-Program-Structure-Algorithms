package edu.northeastern.bodong;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class Main {

    public static void main(String[] args) {
        int[] arr = new int[]{1,2,3,4,5,6,7};
        int k = 3;
        System.out.println(Arrays.toString(rotateAnArray(arr, k)));
    }

    public static Object[] rotateAnArray(int[] arr, int k){
        int idx = arr.length - k;
        Queue<Integer> queue = new LinkedList<Integer>();

        for(int i=idx;i<arr.length;i++){
            queue.offer(arr[i]);
        }

        for (int j=0;j<idx;j++){
            queue.offer(arr[j]);
        }

        return queue.toArray();
    }
}
