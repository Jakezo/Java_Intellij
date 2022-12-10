package Java_Inflearn;

import java.util.Scanner;

public class Study_1 {
    public int solution(String str,char t){
        int answer=0;
        str=str.toUpperCase();
        t=Character.toUpperCase(t);
        System.out.println(str+" "+t);
        int cnt=0;
        char [] arr = str.toCharArray();
//        for(int i=0; i<str.length(); i++){
//            if(str.charAt(i) == t)
//                ++answer;
//        }
        for (char x: str.toCharArray()) {
            if(x==t) answer++;
        }
        return answer;
    }
    public static void main(String[] args) {
        Study_1 T = new Study_1();
        Scanner kb = new Scanner(System.in);
        String str = kb.next();
        char c = kb.next().charAt(0);
        System.out.println(T.solution(str,c));


    }
}
