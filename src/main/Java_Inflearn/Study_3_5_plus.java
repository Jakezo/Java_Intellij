package Java_Inflearn;

import java.util.Scanner;

public class Study_3_5_plus {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Study_3_5_plus T = new Study_3_5_plus();

        int n = sc.nextInt();

        System.out.println(T.solution(n));
    }

    private int solution(int n) {
        int answer=0,cnt=1;
        n--;
        while (n>0){
            cnt++;
            n-=cnt;
            if(n%cnt ==0){
                answer++;
            }
        }
        return answer;
    }
}
