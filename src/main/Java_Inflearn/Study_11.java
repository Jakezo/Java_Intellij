package Java_Inflearn;

import java.util.Scanner;

public class Study_11 {
        public String solution(String str){
            String answer ="";
            char[] chars = str.toCharArray();
            StringBuffer sb = new StringBuffer();
            int p=1;
            sb.append(chars[0]);
            for(int i=1; i<chars.length; i++){
                if((chars[i-1] == chars[i])){
                    p++;
                    if(i==chars.length-1){
                        sb.append(p);
                    }
                }else{
                    if(p >1){
                        sb.append(p);
                    }
                    sb.append(chars[i]);
                    p=1;
                }
            }
  
             answer =sb.toString();
            return answer;
        }

    public static void main(String[] args) {
        Study_11 T = new Study_11();
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String answer = T.solution(str);

        System.out.println(answer);
    }
}
