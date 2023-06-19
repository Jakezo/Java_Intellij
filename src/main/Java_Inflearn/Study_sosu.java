package Java_Inflearn;

import java.util.Scanner;

public class Study_sosu {

    public int solution(int n){
       int [] nums = new int[n+1];
        int cnt = 0;
       for(int i=2; i<=n; i++){
        if(nums[i]==0) cnt++;
            for(int j=i; j<=n; j=j+i){
                nums[j]=1;
            }
       }
        return cnt;
    }
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        Study_sosu kb = new Study_sosu();

        int n = sc.nextInt();

        System.out.println(kb.solution(n));
    }
    
}
