package Sorting_Searching;

import java.util.*;

/**
 * 6. 장난꾸러기
 * 9
 * 120 125 152 130 135 135 143 127 160
 */
public class Solution6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }

        int[] copy = arr.clone();
        Arrays.sort(copy);
        for(int i=0; i<n; i++){
            if(arr[i]!=copy[i]){
                System.out.print((i+1)+" ");
            }
        }
    }
}
