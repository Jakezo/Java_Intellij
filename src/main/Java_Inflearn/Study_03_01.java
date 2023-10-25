package Java_Inflearn;

import java.util.ArrayList;
import java.util.Scanner;

public class Study_03_01 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Study_03_01 T = new Study_03_01();
        int n = sc.nextInt();
        int[] ns = new int[n];
        for (int i = 0; i < n; i++) {
             ns[i] = sc.nextInt();
        }

        int m = sc.nextInt();
        int[] ms = new int[m];
        for (int i = 0; i < m; i++) {
            ms[i] = sc.nextInt();
        }
        for (int x : T.solution(n, m, ns, ms)) {
            System.out.println(x+" ");
        }
    }

    private ArrayList<Integer> solution(int n, int m, int[] ns, int[] ms) {
        ArrayList<Integer> answer = new ArrayList<>();
        int p1=0, p2=0;
        while (p1<n && p2<m){
            if(ns[p1]<ms[p2]) answer.add(ns[p1++]);
            else answer.add(ms[p2++]);
        }
        while(p1<n) answer.add(ns[p1++]);
        while (p2<m) answer.add(ms[p2++]);
        return answer;
    }
}
