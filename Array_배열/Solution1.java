package Array_배열;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * 1. 큰 수 출력하기
 * N개의 정수를 입력받아, 자신의 바로 앞 수보다 큰 수만 출력
 */
public class Solution1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        for(int x : solution(n, arr)){
            System.out.println(x + " ");
        }
    }
    public static ArrayList<Integer> solution(int n, int[] arr){
        ArrayList<Integer> answer = new ArrayList<>();
        answer.add(arr[0]);
        for(int i=1; i<n; i++){
            if(arr[i] > arr[i-1]) answer.add(i);
        }
        return answer;
    }

    public static void main1(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }

        System.out.print(arr[0] + " ");
        for(int i=1; i<n; i++){
            if(arr[i] > arr[i-1]) System.out.print(arr[i]+ " ");
        }
    }
}
