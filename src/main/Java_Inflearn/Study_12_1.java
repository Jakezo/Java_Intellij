package Java_Inflearn;

import java.util.Scanner;

public class Study_12_1 {

    public String solution(int n, String s){
        String answer="";
        for(int i=0; i<n; i++){
            String tmp=s.substring(0,7).replace('#', '1').replace('*', '0');
            int num = Integer.parseInt(tmp,2); // 2진수를 10진수 숫자로 변경시켜줌
           answer+=(char)num;
           s.substring(7);
        }
        return answer;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Study_12 t = new Study_12();

        int num = sc.nextInt();
        String str = sc.next();

        String answer = t.solution(num, str);

        sc.close();

        System.out.println(answer);

    }
    
}
