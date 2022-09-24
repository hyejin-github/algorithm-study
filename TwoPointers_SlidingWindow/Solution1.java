package TwoPointers_SlidingWindow;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * 1. 두 배열 합치기
 */


public class Solution1
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr1 = new int[n];

        for(int i=0; i<n; i++){
            arr1[i] = sc.nextInt();
        }
        int m = sc.nextInt();
        int[] arr2 = new int[m];
        for(int i=0; i<m; i++){
            arr2[i] = sc.nextInt();
        }

        int l1 = 0, l2 = 0;
        List<Integer> ans = new ArrayList<>();
        while(l1<n && l2<m){
            if(arr1[l1] < arr2[l2]) ans.add(arr1[l1++]);
            else ans.add(arr2[l2++]);
        }

        while(l1<n){
            ans.add(arr1[l1++]);
        }
        while(l2<m){
            ans.add(arr2[l2++]);
        }
        for(int a : ans){
            System.out.print(a+" ");
        }
    }
}
