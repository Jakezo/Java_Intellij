package Java_Inflearn;

import java.util.Scanner;

public class Study_5 {
    public String solution(String str){
        String answer="";
        for(int i=0; i<str.length(); i++){
//            System.out.println(str.charAt(i)+ " " +i+" "+str.indexOf(str.charAt(i)));
            if(str.indexOf(str.charAt(i)) == i){
                answer+=str.charAt(i);
            }
        }


        return answer;
    }

    public static void main(String[] args) {
        Study_5 T = new Study_5();
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        System.out.println(T.solution(str));

    }
}
