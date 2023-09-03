package Java_Inflearn;
import java.util.Scanner;

public class Study_02_11 {

    public int solution(int n, int[][] arr) {
        int answer = 0, max = 0;

        for (int i = 0; i < n; i++) {
         int cnt=0;
             for (int j = 0; j < n; j++) {
                for (int k = 0; k < 5; k++) {
                    if (arr[i][k] == arr[j][k]){
                        cnt++;
                        break;
                    }
                }
                if(cnt > max){
                    max = cnt;
                    answer = i+1;
                }
            }
        }
        return answer;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Study_02_11 kb = new Study_02_11();
        int n = sc.nextInt();
        int[][] arr = new int[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        int answer =kb.solution(n, arr);
        System.out.println(answer);
        sc.close();
    }

}
