package Java_Inflearn;

import java.util.Scanner;

public class Study_02_10 {

        public int solution(int n, int[][] arrBefore) {

            int[][] arr = new int[n+2][n+2];

            for (int i = 1; i < n+1; i++) {
                for (int j = 1; j < n+1; j++) {
                        arr[i][j]=arrBefore[i-1][j-1];
                }
            }
            int answer=0;

//            for (int i = 0; i < arr.length; i++) {
//                int[] inArr = arr[i];
//                for (int j = 0; j < inArr.length; j++) {
//                    System.out.print(inArr[j] + " ");
//                }
//                System.out.println();
//            } // 2차원 배열 뽑는거
            int[] dx = {0, 0, -1, +1};
            int[] dy = {-1, +1, 0, 0};

            for (int i = 0; i < n+2; i++) {
                for (int j = 0; j < n+2; j++) {
                        if(arr[i][j]!=0){
                            if((arr[i][j]>arr[i][j-1]) && (arr[i][j]>arr[i][j+1]) && (arr[i][j]>arr[i-1][j]) && (arr[i][j]>arr[i+1][j])){
                                answer++;
                            }
                        }
                }
            }

            return answer;
        }

        public static void main(String[] args) {

            Scanner sc = new Scanner(System.in);
            Study_02_10 kb = new Study_02_10();
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
