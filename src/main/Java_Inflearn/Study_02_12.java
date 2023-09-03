package Java_Inflearn;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;

public class Study_02_12 {

    public int solution(int n, int m, int[][] arr){
        int answer = 0;

        HashSet<int[]> set = new HashSet<>();
        int[] group = new int[2];

        for (int i = 0; i < m; i++) {
            for (int j = 1; j < n;   j++) {
                int [] aij = {arr[i][j-1],arr[i][j]};
                set.add(aij);
            }
        }


        return answer;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Study_02_12 kb = new Study_02_12();
        int m = sc.nextInt();
        int n = sc.nextInt();

        int[][] arr = new int[m][n];

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        int answer =kb.solution(n,m, arr);
        System.out.println(answer);
        sc.close();
    }
}
