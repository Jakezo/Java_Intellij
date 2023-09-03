package Java_Inflearn;

import java.security.Key;
import java.util.Scanner;

public class Study_02_10_plus {

    public int solution(int n, int[][] arr) {
        int answer=0;

        int[] dx={-1,0,1,0};
        int[] dy={0,1,0,-1};

        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                boolean flag = true;
                for(int k=0; k<4; k++){
                    int nx= i + dx[k];
                    int ny = j + dy[k];
                    if(nx >=0 && nx <n && ny >=0 && ny <n && arr[i][j] < arr[nx][ny]){
                        flag = false;
                        break;
                    }
                }
                if(flag){
                    answer++;
                }
            }
        }
        return answer;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Study_02_10_plus kb = new Study_02_10_plus();
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
