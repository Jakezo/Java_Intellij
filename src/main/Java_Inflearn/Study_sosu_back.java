package Java_Inflearn;

import java.util.ArrayList;
import java.util.Scanner;

public class Study_sosu_back {

    public boolean isPrime(int s){
      //  System.out.println(s);
        if(s==1) return false;
        
        for(int i=2; i<s; i++){
            if(s%i ==0) return false;
        }
        return true;
    }

    public ArrayList<Integer> solution(int n, int[] arr){
        ArrayList<Integer> answer = new ArrayList<>();

        for(int i=0; i<n; i++){
            int tmp = arr[i];
            int res =0;
            while(tmp>0){
                int t=tmp%10;
                res = res*10+t;
                tmp=tmp/10;
            }
        //    System.out.println(res);
            if(isPrime(res)){
                answer.add(res);
            }
            
           // 
        }
        return answer;
    }

    public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
    
     Study_sosu_back sb = new Study_sosu_back();
     
    int n = sc.nextInt();
    int[] arr = new int[n];
    for(int i=0; i<n; i++){
        arr[i]=sc.nextInt();
    }
    
    for(int x: sb.solution(n, arr)){
        System.out.print(x+" ");
    }
        
    }
}
