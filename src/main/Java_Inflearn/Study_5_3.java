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
            System.out.print(i+" ");
        }
        sc.close();
    }

    private ArrayList<Integer> solution(int n, int k, int[] arr) {
        ArrayList<Integer> answer = new ArrayList<>();

        HashMap<Integer,Integer> map = new HashMap<>();
        //k 갯수만큼 돌리고

        for (int i = 0; i < k-1; i++) {
            map.put(arr[i], map.getOrDefault(arr[i],0)+1);
        }
        int lt=0;
        for(int rt=k-1; rt<n; rt++){
            map.put(arr[rt], map.getOrDefault(arr[rt],0)+1);
            answer.add(map.size());
            map.put(arr[lt] ,map.get(arr[lt])-1);
            if(arr[lt] == 0) map.remove(arr[lt]);
            lt++;
        }
        return answer;
    }
}
