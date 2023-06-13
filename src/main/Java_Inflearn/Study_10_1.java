package Java_Inflearn;

import java.util.Scanner;

public class Study_10_1 {

    public int[] solution(String s,char t){
        int[] answer=new int[s.length()];
        int p=1000;
        for(int i=0; i<answer.length; i++){
            if(s.charAt(i) == t){
                p=0;
                answer[i]=p;
            }else{
                p++;
                answer[i]=p;
            }
            //System.out.println(answer);
        }

        for(int i=s.length()-1; i>=0; i--){
            if(s.charAt(i) == t){
                p=0;
            }else{
                p++;
                if(answer[i] > p){
                    answer[i]=p;
                }
            }
        }
        return answer;
    }
    
    public static void main(String[] args) {
        Study_10_1 T = new Study_10_1();
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        char c =sc.next().charAt(0);


        for(int x: T.solution(str,c)){
            System.out.print(x+" ");
        }

    }
    
}
