package Java_Inflearn;

import java.util.ArrayList;
import java.util.Scanner;

public class Study_2_8 {

    public ArrayList<Integer> solution(int[] nums){
        ArrayList<Integer> as = new ArrayList<>();

        for(int i=0; i<nums.length; i++){
            int rank =1;
            for(int j=0; j<nums.length; j++){
                if(nums[j]>nums[i]){
                    rank++;
                }
            }
            as.add(rank);
        }
        
        return as;
    }

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        Study_2_8 kb = new Study_2_8();

        int n = sc.nextInt();
        int[] nums = new int[n];
        for(int i=0; i<n; i++){
            nums[i]=sc.nextInt();
        }
       for (int i : kb.solution(nums)) {
            System.out.print(i+" ");
       }
    }
    
}
