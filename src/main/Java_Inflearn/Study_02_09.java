package Java_Inflearn;

import com.sun.xml.internal.ws.api.pipe.NextAction;

import java.util.ArrayList;
import java.util.Scanner;

public class Study_02_09 {

    public int solution(int n, int[][] arr) {
        int answer = Integer.MIN_VALUE;
        int sumRow;
        int sumCol;
        for (int i = 0; i < n; i++) {

            sumRow = sumCol = 0;
            for (int j = 0; j < n; j++) {
                sumRow += arr[i][j];
                sumCol += arr[j][i];
            }
            if (sumRow > answer) {
                answer = sumRow;
            }

            if (sumCol > answer) {
                answer = sumCol;
            }

        }
        sumRow = sumCol = 0;
        for (int i = 0; i < n; i++) {
            sumRow += arr[i][i];
            sumCol += arr[i][n - 1 - i];
        }
        if (sumRow > answer) {
            answer = sumRow;
        }
        if (sumCol > answer) {
            answer = sumCol;
        }

        return answer;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Study_02_09 kb = new Study_02_09();
        int n = sc.nextInt();
        int[][] arr = new int[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        System.out.print(kb.solution(n, arr));
        sc.close();
    }
}
