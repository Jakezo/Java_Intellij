package Java_Inflearn;

import java.util.Scanner;

public class Main {

    public int solution(int[] arr){
        int tmp=arr[0];
        int count=1;
        for(int i=1; i<arr.length; i++){
            if(arr[i] > tmp){
                tmp=arr[i];
                count++;
            }
        }        
        
        return count;
    } 

    public static void main(String[] args) {
        
        Main kb = new Main();
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int[] nums=new int[num]; 

        for(int i=0; i<num; i++){
            nums[i]=sc.nextInt();
        }
        int result =kb.solution(nums);
        sc.close();
        System.out.println(result);
        
    }
    
}
