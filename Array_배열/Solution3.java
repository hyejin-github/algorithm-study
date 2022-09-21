package Array_배열;

import java.util.Scanner;

/**
 * 3. 가위바위보
 */
public class Solution3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] A = new int[n];
        int[] B = new int[n];
        for(int i=0; i<n; i++){
            A[i] = sc.nextInt();
        }
        for(int i=0; i<n; i++){
            B[i] = sc.nextInt();
        }

        for(int i=0; i<n; i++){
            if(A[i]==B[i]) System.out.println("D");
            else if(A[i]==1 && B[i]==3) System.out.println("A");
            else if(A[i]==2 && B[i]==1) System.out.println("A");
            else if(A[i]==3 && B[i]==2) System.out.println("A");
            else System.out.println("B");
        }
    }
}
