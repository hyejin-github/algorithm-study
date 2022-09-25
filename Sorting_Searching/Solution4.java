package Sorting_Searching;

import java.util.*;

/**
 * 4. LRU(Least Recently Used) - 삽입정렬
 * 5 9
 * 1 2 3 2 6 2 3 5 7
 */
public class Solution4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int s = sc.nextInt();
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        for(int x : solution(s,n,arr)){
            System.out.print(x + " ");
        }
    }

    public static int[] solution(int s, int n, int[] arr){
        int[] cache = new int[s];

        for(int x : arr){
            int idx = -1;
            for(int i=0; i<s; i++) if(x==cache[i]) idx=i;
            if(idx == -1){
                for(int i=s-1; i>=1; i--){
                    cache[i] = cache[i-1];
                }
            }else{
                for(int i=idx; i>=1; i--){
                    cache[i] = cache[i-1];
                }
            }
            cache[0] = x;
        }

        return cache;
    }
}
