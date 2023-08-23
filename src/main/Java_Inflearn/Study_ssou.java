package Java_Inflearn;

import java.util.Scanner;

public class Study_ssou {

    public int solution(int n){

        /*
        자연수 N이 입력되면 1부터 N까지의 소수의 개수를 출력하는 프로그램을 작성하세요.
        만약 20이 입력되면 1부터 20까지의 소수는 2, 3, 5, 7, 11, 13, 17, 19로 총 8개입니다.

        * */
        int[] nums = new int[n+1];
        int cnt =0;
        for(int i=2; i<=n; i++){
            if(nums[i] == 0) cnt++;
            for(int j=i; j<=n; j=j+i){
                nums[j]=1;
            }
        }

        return cnt;
    }


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();

        Study_ssou kb = new Study_ssou();

        int answer = kb.solution(x);

        System.out.println("answer = " + answer);
    }
}
