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
                        // arr[nx][ny]상하좌우좌표 >= 현재지점좌표 arr[i][j]
                        // nx>=0 && nx<n && ny>=0 && ny<n는
                        // 내 상하좌우가 네방향으로 존재하지 않는 경우도 있으니 그 경우는 제외하는 조건
                        // 현재지점 좌표보다 큰게 있으면 봉우리가 아니다. 이걸 확인하기 위해서 flag변수 작성해준 것
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
