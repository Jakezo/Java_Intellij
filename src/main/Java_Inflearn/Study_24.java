package Java_Inflearn;

import java.util.Scanner;

public class Study_24 {
    public int[] solution(int n){
        String answer="";

        int[] pib= new int[n];
        
        pib[0]=1;
        pib[1]=1;
    
        
        for(int i=2; i<n; i++){
            pib[i]=pib[i-1]+pib[i-2];
        }

        return pib;
    }


    public static void Study_24(String[] args) {
     
        Scanner sc = new Scanner(System.in);
        Study_24 kb = new Study_24();

        int n = sc.nextInt();
        for (int i : kb.solution(n)) {
            System.out.print(i+" ");
        }

    }
}
