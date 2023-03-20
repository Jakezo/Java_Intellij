package Java_Inflearn;

import java.util.Scanner;

public class Study_8 {

    public String solution(String str){
        String flag="NO";
        str=str.toUpperCase().replaceAll("[^A-Z]", "");  // 눈우슴 표시가 아닌거 
        String tmp=new StringBuilder(str).reverse().toString();
        System.out.println(tmp);

        if(str.equals(tmp)){
            flag="YES";
        }
        

        return flag;

    }

    
    public static void main(String[] args) {
        Study_8 T= new Study_8();

        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();

        System.out.println(T.solution(str));

    }
}
