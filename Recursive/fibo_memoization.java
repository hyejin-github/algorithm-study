package Recursive;

import java.util.*;

public class fibo_memoization {
    static int[] fibo; // 걸리는 시간을 줄이기 위해서 반복작업은 하지 않고 배열에 값 저장
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        fibo = new int[n+1]; // 각 결과 저장할 배열
        DFS(n);
        for(int i=1; i<=n; i++){
            System.out.print(fibo[i]+" ");
        }
    }

    public static int DFS(int n){
        if(fibo[n]>0) return fibo[n];

        if(n==1) return fibo[n] = 1;
        else if(n==2) return fibo[n] = 1;
        else return  fibo[n] = DFS(n-2) + DFS(n-1);
    }
}
