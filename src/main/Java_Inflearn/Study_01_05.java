package Java_Inflearn;

import java.util.Scanner;

public class Study_01_05 {
    public String solution(String s){
        String answer="";
        int n = s.length();
        char[] chars = new char[n];
        for(int j=0; j<n; j++){
            chars[j]=s.charAt(j);
        }
        for(int i=0; i<n/2; i++){
            if (!(chars[i] < 'A' || (chars[i] > 'Z' && chars[i] < 'a') || chars[i] > 'z')) {
                if (!(chars[n-1-i] < 'A' || (chars[n-1-i] > 'Z' && chars[n-1-i] < 'a') || chars[n-1-i] > 'z')) {
                    char temp = chars[i];
                    chars[i]=chars[n-1-i];
                    chars[n-1-i] = temp;
                }
            }
        }
        answer =  new String(chars);

        return answer;
    }


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        Study_01_05 kb = new Study_01_05();
        String result = kb.solution(a);
        System.out.print(result);
    }
}
