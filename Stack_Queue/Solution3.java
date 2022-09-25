package Stack_Queue;

import java.util.*;

/**
 * 3. 크레인 인형뽑기(카카오기출) - stack
 * 5
 * 0 0 0 0 0
 * 0 0 1 0 3
 * 0 2 5 0 1
 * 4 2 4 4 2
 * 3 5 1 3 1
 * 8
 * 1 5 3 5 1 2 1 4
 */
public class Solution3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] board = new int[n][n];
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                board[i][j] = sc.nextInt();
            }
        }

        int m = sc.nextInt();
        int[] moves = new int[m];
        for(int i=0; i<m; i++){
            moves[i] = sc.nextInt();
        }
        System.out.println(solution(board, moves));
    }

    public static int solution(int[][] board, int[] moves){
        int answer = 0;
        Stack<Integer> st = new Stack<>();

        for(int pos : moves){
            for(int i=0; i<board.length; i++){
                if(board[i][pos-1] != 0){
                    int tmp = board[i][pos-1];
                    board[i][pos-1] = 0; // 인형 뽑음
                    // 바구니에 인형이 있으면 상단 인형과 비교
                    if(!st.isEmpty() && st.peek()==tmp){
                        answer+=2;
                        st.pop();
                    }else st.push(tmp);
                    break;
                }
            }
        }
        return answer;
    }
}
