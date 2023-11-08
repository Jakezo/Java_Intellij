package Java_Inflearn;

import java.util.Scanner;

public class Study_3_3 {

    public static void main(String[] args) {

        Study_3_3 T = new Study_3_3();
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int k = sc.nextInt();

        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
             arr[i] = sc.nextInt();
        }

        System.out.println(solution(n,k,arr));

    }

    private static int solution(int n, int k, int[] arr) {
        int answer, sum = 0;

        for (int i = 0; i < k; i++) {
             sum+=arr[i];
        }
        answer = sum;

        // n-k+1 도는갯수
        for (int i = k; i < n; i++) {
            //int temp =0;
            sum += (arr[i] - arr[i-k]);
          //  System.out.println("temp = " + temp);
            if(sum > answer){
                answer =sum;
            }
        }

        return answer;
    }
}
