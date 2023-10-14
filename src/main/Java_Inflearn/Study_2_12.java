package Java_Inflearn;

import java.util.Scanner;

public class Study_2_12 {


    public static void main(String[] args) {

        Study_2_12 T = new Study_2_12();
        Scanner sc = new Scanner(System.in);

        int n= sc.nextInt();
        int[][] arr = new int[n+1][6];

        for(int i=1; i<=n; i++){
            for(int j=1; j<=5; j++){
                arr[i][j]=sc.nextInt();
            }
        }
        int answer = T.solution(n,arr);
        System.out.println(answer);

    }

    private int solution(int n, int[][] arr) {
        int answer=0, max = Integer.MIN_VALUE;

        for(int i=1; i<=n; i++){
            int count =0;
            for(int j=1; j<=n; j++){
                for(int k=1; k<=5; k++){
                    if(arr[i][k] == arr[j][k]){
                        count++;
                        break;
                    }
                }
            }
            if(count > max){
                max = count;
                answer=i;
            }
        }
        return answer;
    }
}
