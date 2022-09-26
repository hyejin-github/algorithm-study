package Sorting_Searching;

import java.util.*;

/*
8
20 25 52 30 39 33 43 33
 */
public class Solution5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }

        System.out.println(solution(n, arr));
    }

    public static String solution(int n, int[] arr){
        String answer = "U";
        Arrays.sort(arr);
        for(int i=0; i<n-1; i++){
            if(arr[i] == arr[i+1]) return "D";
        }

        return answer;
    }
}
