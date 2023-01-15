package Java_Inflearn;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public ArrayList<String> solution(int n ,String[] str){
        ArrayList<String> answer = new ArrayList<>();
        for(String x:str){
            char[] s = x.toCharArray();
            int lt=0, rt=x.length()-1;
            for(int i=0; i<x.length(); i++){
                if(i < rt) {
                    char tmp = s[i];
                    s[i] = s[x.length() - i - 1];
                    s[x.length() - 1 - i] = tmp;
                    rt--;
                }
            }
            String tmp=  new String(s);
            answer.add(tmp);
        }

        return answer;
    }

    public static void main(String[] args) {
        Main T = new Main();
        Scanner sc = new Scanner(System.in);
        int cnt = sc.nextInt();
        String[] str = new String[cnt];

        for(int i=0; i<cnt; i++){
            str[i]= sc.next();
        }
        for(String x:T.solution(cnt,str)){
            System.out.println(x);
        }

    }
}
