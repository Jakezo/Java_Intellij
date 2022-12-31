package Java_Inflearn;

import java.util.Scanner;

public class Study_2_1 {

    public String solution(String str){
        String answer ="";
        int m = Integer.MIN_VALUE;
        String[] s = str.split(" ");
        for(String x: s){
            int len = x.length();
            if(len > m){
                m = len;
                answer = x;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        Study_2_1 T = new Study_2_1();
        Scanner kb = new Scanner(System.in);
        String str = kb.nextLine();
        String returnValue =T.solution(str);

        System.out.println(returnValue);

    }
}
