package Java_Inflearn;

import java.util.ArrayList;
import java.util.Scanner;

public class Study_3_1 {

    public static void main(String[] args) {

        Study_3_1 T = new Study_3_1();
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arrA = new int[n];

        for (int i = 0; i < n; i++) {
            arrA[i] = sc.nextInt();
        }

        int m = sc.nextInt();
        int[] arrB = new int[m];

        for (int i = 0; i < m; i++) {
            arrB[i] = sc.nextInt();
        }

        for (int i : T.solution(n, m, arrA, arrB)) {
            System.out.print(i + " ");
        }

    }

    private ArrayList<Integer> solution(int n, int m, int[] arrA, int[] arrB) {

        ArrayList<Integer> answer = new ArrayList<>();
        int p1=0, p2=0;

        while(p1<n && p2<m){
            if(arrA[p1] < arrB[p2]) answer.add(arrA[p1++]);
            else answer.add(arrB[p2++]);
        }

        while(p1 < n) answer.add(arrA[p1++]);
        while(p2 < m) answer.add(arrB[p2++]);

        return answer;

    }
}
