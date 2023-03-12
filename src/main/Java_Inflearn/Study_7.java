package Java_Inflearn;
import java.util.Scanner;

public class Study_7 {
    public String solution(String s){
        String answer="NO";
        s=s.toUpperCase().replaceAll("[^A-Z]",""); // 대문자 A~Z까지 아니면 빈문자
        String tmp = new StringBuilder(s).reverse().toString();
        if(s.equals(tmp)){
            answer="YES";
        }

        return answer;
    }

    public static void main(String[] args) {
        Study_7 T = new Study_7();
        Scanner kb = new Scanner(System.in);
        String str = kb.nextLine();
        System.out.println(T.solution(str));

    }
}
