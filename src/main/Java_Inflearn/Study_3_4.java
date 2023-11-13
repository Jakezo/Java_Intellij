package Java_Inflearn;

import java.util.Scanner;

public class Study_3_4 {


    public static void main(String[] args) {

        Study_3_4 T = new Study_3_4();
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();

        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println(solution(n,m,arr));

        sc.close();
    }

    private static int solution(int n, int m, int[] arr) {
        int answer=0, lt=0, rt = 0;

        while (rt < n){
            int sum=0;
            for (int i = lt; i <= rt; i++) {
                sum += arr[i];
            }

            if(sum == m){
                answer ++;
                lt++;
                rt++;
            }else if(sum > m){
                lt++;
            }else{
                rt++;
            }
        }

        return answer;
    }
}
