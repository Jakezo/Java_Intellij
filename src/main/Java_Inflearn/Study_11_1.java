package Java_Inflearn;

import java.util.Scanner;

public class Study_11_1 {

    public String solution(String s){
        String answer ="";
        s=s+" "; // 일부러 공백값을 하나 늘린다. 
        
        int cnt=1;
        for(int i=0; i<s.length()-1; i++){
            if(s.charAt(i) == s.charAt(i+1)) cnt++;
            else{
                answer+=s.charAt(i);
                if(cnt>1) answer+=String.valueOf(cnt);
                cnt=1;
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        Study_11_1 T = new Study_11_1();
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String answer = T.solution(str);

        System.out.println(answer);
    }
    
}
