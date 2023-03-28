package Java_Inflearn;

import java.util.Scanner;

public class Study_9_1 {

    public int solution(String s){
        //int answer=0;
        String answer =""; 
        for(char x : s.toCharArray()){
            //if(x>48 && x<=57) answer=answer*10+(x-48); // 문자 0 은 아스키 48  문자 9 는 아스키 57 문자 48~ 57 아스키번호임
            if(Character.isDigit(x)) answer+=x;  
        }
        return Integer.parseInt(answer);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        Study_9_1 kb=new Study_9_1();
        int solution = kb.solution(str);
        System.out.println(solution);
    }
}
