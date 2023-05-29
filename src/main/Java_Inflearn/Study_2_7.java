package Java_Inflearn;

import java.util.Scanner;

public class Study_2_7{

    public int solution(int[] nums){
        int tmp=0;
        int answer=0;

        for(int i=0; i<nums.length; i++){
            if(nums[i]==1){
                tmp= tmp+nums[i];
                answer+=tmp;
            }else{
                tmp=0;
            }

        }
        return answer;
    }

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        Study_2_7 kb =new Study_2_7();
        int n = sc.nextInt();
        int[] nums =new int[n];

        for(int i=0; i<n; i++){
            nums[i]=sc.nextInt();
        }

        System.out.println(kb.solution(nums));
        
        
    }


}