package Java_Inflearn;

import java.util.Scanner;

public class Study_4_3 {
    public String solution(String str){
        String answer;
        char[] s = str.toCharArray();
        int lt=0, rt=str.length()-1;

        while (lt <rt){
            if(!Character.isAlphabetic(s[lt])) lt++;  // 알파벳이 아닐때
            else if(!Character.isAlphabetic(s[rt])) rt--;
            else{
                char tmp=s[lt];
                s[lt]=s[rt];
                s[rt]=tmp;
                lt++;
                rt--;
            }
        }
        answer = new String(s);

        return answer;
    }

    public static void main(String[] args) {
        Study_4_3 T = new Study_4_3();
        Scanner sc =new Scanner(System.in);
        String str=sc.next();
        System.out.println(T.solution(str));

    }
}
