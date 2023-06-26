package Java_Inflearn;

import java.util.Scanner;

public class Study_24_1 {
    public void solution(int n){
        int a=1, b=1, c;

        System.out.print(a+" "+b+" ");
        for(int i=2; i<n; i++){
            c=a+b;
            System.out.print(c+" ");
            a=b;
            b=c;
        }
    }
    public static void main(String[] args) {
     
        Scanner sc = new Scanner(System.in);
        Study_24_1 kb = new Study_24_1();

        int n = sc.nextInt();
        kb.solution(n);

    }
}
