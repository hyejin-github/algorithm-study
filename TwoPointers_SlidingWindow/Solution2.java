package TwoPointers_SlidingWindow;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

/**
 * 2. 공통 원소 추출
 * 5
 * 1 3 9 5 2
 * 5
 * 3 2 5 7 8
 */
public class Solution2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for(int i=0; i<n; i++){
            a[i] = sc.nextInt();
        }
        int m = sc.nextInt();
        int[] b = new int[m];
        for(int i=0; i<m; i++){
            b[i] = sc.nextInt();
        }

        // 정렬
        Arrays.sort(a);
        Arrays.sort(b);

        int p1=0, p2=0;
        List<Integer> ans = new ArrayList<>();
        while(p1<n && p2<m){
            if(a[p1]<b[p2]) p1++;
            else if(a[p1]==b[p2]){
                ans.add(a[p1]);
                p1++;
                p2++;
            }else p2++;
        }

        for(int x : ans){
            System.out.print(x + " ");
        }
    }
}
