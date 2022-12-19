package Java_Inflearn;

import java.util.ArrayList;
import java.util.Scanner;

public class Study_4 {

    public ArrayList<String> solution(int n, String[] str){
        ArrayList<String> answer = new ArrayList<>();
        for (String x : str){
//            String tmp = new StringBuilder(x).reverse().toString();
//            answer.add(x);
            char[] s = x.toCharArray();
            int lt=0, rt=x.length()-1;
            while (lt < rt){
                char tmp =s[lt];
                s[lt]= s[rt];
                s[rt]=tmp;
                lt++;
                rt--;
            }
            String tmp =String.valueOf(s);
            answer.add(tmp);
        }

        return answer;
    }


    public static void main(String[] args) {
        Study_4 T = new Study_4();
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        String[] str = new String[n];
        for(int i=0; i<n; i++){
            str[i]=kb.next();
        }
//        String[] rstr = new String[n];
//        for(int i=n-1; i>=0; i--){
//            rstr[n-i-1] = str[i];
//        }

        for (String x:T.solution(n,str)) {
            System.out.println(x);
        }
    }
}
