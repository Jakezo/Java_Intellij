package Java_Inflearn;

import java.util.Scanner;

public class Study_3_5{

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Study_3_5 T = new Study_3_5();

        int n = sc.nextInt();

        System.out.println(T.solution(n));
    }

    private int solution(int n) {
        int answer=0,sum=0,lt=0;

        int m = n/2 +1;
        int[] arr = new int[m];
        for (int i = 0; i < m; i++) {
            arr[i] = i+1;
        }

        for (int rt = 0; rt < m; rt++) {
           sum += arr[rt];
           if(sum == n){
               answer ++;
           }
           while (sum >= n){
               sum-= arr[lt++];
               if(sum == n){
                   answer++;
               }
           }
        }
        return answer;
    }
}
