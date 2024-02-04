package Java_Inflearn;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Study_4_3_1 {

    public static void main(String[] args) {

        Study_4_3_1 T = new Study_4_3_1();
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int k = sc.nextInt();

        int[] arr = new int[n];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        for (int sol : T.solution(n, k, arr)) {
            System.out.print(sol+" ");
        }
    }

    private ArrayList<Integer> solution(int n, int k, int[] arr) {

        ArrayList<Integer> answer = new ArrayList<>();

        HashMap<Integer, Integer> hash = new HashMap<>();

        for (int i = 0; i < k-1; i++) {
            hash.put(arr[i], hash.getOrDefault(arr[i], 0) + 1);
        }

        int lt=0;
        for (int rt = k-1; rt < n; rt++) {
            hash.put(arr[rt], hash.getOrDefault(arr[rt], 0)+1);
            answer.add(hash.size());
            hash.put(arr[lt], hash.get(arr[lt]) - 1);
            if (hash.get(arr[lt]) == 0) {
                hash.remove(arr[lt]);
            }
            lt++;
        }

        return answer;
    }
}
