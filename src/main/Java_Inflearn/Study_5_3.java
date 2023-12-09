package Java_Inflearn;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Study_5_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Study_5_3 T = new Study_5_3();
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        for (int i : T.solution(n,k,arr)) {
            System.out.println(i+" ");
        }
        sc.close();
    }

    private ArrayList<Integer> solution(int n, int k, int[] arr) {
        ArrayList<Integer> answer = new ArrayList<>();
        int lt,rt;
        lt=0;
        rt=lt+k-1;

        HashMap<Character,Integer> map = new HashMap<>();
        //k 갯수만큼 돌리고


        return answer;
    }
}
