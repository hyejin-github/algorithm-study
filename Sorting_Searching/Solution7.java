package Sorting_Searching;

import java.util.*;

/**
 * 7. 좌표정렬(CompareTo)
 * 5
 * 2 7
 * 1 3
 * 1 2
 * 2 5
 * 3 6
 */
public class Solution7 {
    static class Point implements Comparable<Point>{
        int x,y;
        Point(int x, int y){
            this.x = x;
            this.y = y;
        }

        @Override
        public int compareTo(Point o){
            if(this.x==o.x) return this.y-o.y;
            else return this.x-o.x;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<Point> arr = new ArrayList<>();
        for(int i=0; i<n; i++){
            int x = sc.nextInt();
            int y = sc.nextInt();
            arr.add(new Point(x,y));
        }
        
        Collections.sort(arr); // compareTo에 의해서 정렬
        for(Point p : arr){
            System.out.println(p.x +" "+p.y);
        }
    }
}
