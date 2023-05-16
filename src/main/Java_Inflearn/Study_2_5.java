package Java_Inflearn;

import java.util.Scanner;

public class Study_2_5 {

    public int solution(int n){
        int cnt2 =0;
        for(int i=2; i<=n; i++){
            for(int j=2; j<=n; j++){
                if((i%j == 0) && (i != j)){
                    break;
                }else if((i%j == 0) &&  (i == j)){
                    cnt2++;
                } 
            }
        }
        return cnt2;
    }
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        Study_2_5 kb = new Study_2_5();

        int n = sc.nextInt();

        System.out.println(kb.solution(n));
    }
    
}
