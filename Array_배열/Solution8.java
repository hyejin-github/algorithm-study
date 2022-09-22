package Array_배열;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Solution8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];

        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }

        int cnt;
        for(int i=0; i<n; i++){
            cnt = 1;
            for(int j=0; j<n; j++){
                if(arr[j] > arr[i]) cnt++;
            }
            System.out.print(cnt+" ");
        }
    }

}
