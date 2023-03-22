package Java_Inflearn;

import java.util.Scanner;

public class Study_9 {

    public int solution(String str){
        String tmp = str.replaceAll("[^0-9]","");
        int answer=Integer.parseInt(tmp);
        return answer;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        Study_9 kb=new Study_9();
        int solution = kb.solution(str);
        System.out.println(solution);
    }
}
