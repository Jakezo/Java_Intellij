package Java_Inflearn;

import java.util.Scanner;

public class Study0201 {
    public String solution(int a,String s){
        String answer="";
        
        String se="0";
        char [] chars =s.toCharArray();

        se +=s.replace(" ","");

        for(int i=0; i<=a; i++){
             String ss = String.valueOf(se.charAt(i));
             String ss2 = String.valueOf(se.charAt(i+1));

             if(Integer.parseInt(ss)<Integer.parseInt(ss2)) answer+=ss2;
        }


        return answer;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Study0201 t = new Study0201();

        int num = sc.nextInt();
        sc.nextLine();
        String str = sc.nextLine();
        
  

        String answer = t.solution(num, str);

        sc.close();

       System.out.println(answer);

    }
    
    
}
