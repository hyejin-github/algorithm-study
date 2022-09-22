package Array_배열;

import java.util.Scanner;

/**
 * 6. 뒤집은 소수
 * N개의 자연수 -> 각 자연수를 뒤집은 후 뒤집은 수가 소수면 소수 출력
 */
public class Solution6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        int n = sc.nextInt();
        String[] arr = new String[n];
//        int[] num = new int[n];

        for(int i=0; i<n; i++){
            arr[i] = sc.next();
        }

        for(int i=0; i<n; i++){
            String tmp = new StringBuilder(arr[i]).reverse().toString();
            int num = Integer.parseInt(tmp);
            if(isPrime(num)) System.out.print(num+" ");
        }
    }

    public static boolean isPrime(int num){
        if(num < 2) return false;
        if(num==2) return true;


        for(int i=2; i<num; i++){
            if(num%i==0) return false;
        }

        return true;
    }

}
