package Sorting_Searching;

import java.util.Scanner;

/**
 * 3. 삽입정렬
 * 6
 * 11 7 5 6 10 9
 */
public class Solution3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }

        for(int x : solution(n, arr)) System.out.print(x+" ");
    }

    public static int[] solution(int n, int[] arr){

        for(int i=1; i<n; i++){
            int tmp = arr[i];
            int j;
            for(j=i-1; j>=0; j--){
                if(arr[j] > tmp) arr[j+1] = arr[j];
                else break;
            }

            arr[j+1] = tmp;
        }

        return arr;
    }
}
