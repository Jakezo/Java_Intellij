package Java_Inflearn;

import java.util.Scanner;

public class Study_3 {
    public String solution(String str) {
        String answer = "";
        int m  = Integer.MIN_VALUE,pos; //가장 작은값으로 초기화
//        String[] s=str.split(" ");
//        for(String x : s){
//            int len = x.length();
//            if(len > m){
//                m = len;
//                answer=x;
//            }
//        }
        while((pos = str.indexOf(" "))!= -1){ // str문장에 공백이 없을때가지 돌린다는뜻
            System.out.println("AAAAAAAAAAAAA");

            String tmp=str.substring(0,pos);
            int len = tmp.length();
            if(len > m){
                m = len;
                answer = tmp;
            }
            System.out.println(pos);

            str= str.substring(pos+1);

            System.out.println(str);
        }
        if(str.length() > m){ //제익 마지막바퀴는 못돌리므로 하는거
            System.out.println("stl "+str.length());
            System.out.println("m "+m);
            answer=str;
        }

        return answer;
    }

    public static void main(String[] args) {
        Study_3 T = new Study_3();
        Scanner kb = new Scanner(System.in);
        String str = kb.nextLine();
        System.out.println("정답:"+T.solution(str));
    }

}