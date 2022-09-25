package Stack_Queue;

import java.util.*;

/**
 * 8. 응급실(Queue)
 * 5 2
 * 60 50 70 80 90
 */
public class Solution8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println(solution(n,m,arr));
    }

    public static int solution(int n, int m, int[] arr){
        int cnt = 0;
        Queue<Person> queue = new LinkedList<>();
        for(int i=0; i<n; i++){
            queue.offer(new Person(i, arr[i]));
        }

        while(!queue.isEmpty()){
            Person tmp = queue.poll();
            for(Person x : queue){
                if(x.priority > tmp.priority){
                    queue.offer(tmp);
                    tmp = null;
                    break;
                }
            }
            if(tmp!=null){
                cnt++;
                if(tmp.id==m) return cnt;
            }
        }

        return cnt;
    }

    static class Person{
        int id;
        int priority;
        Person(int id, int priority){
            this.id = id;
            this.priority = priority;
        }
    }
}
