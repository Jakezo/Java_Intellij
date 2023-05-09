package Java_Inflearn;

import java.util.Scanner;

public class Study_2_3 {
    
    public String[] solution(int n,int[] a,int[] b){
       // String re="";
        String[] result=new String[n];
        // 차이가 1 나면 큰게 이긴거고 차이가 2 나면 작은게 이긴거임
        for(int i=0; i<n; i++){
            if(Math.abs(a[i]-b[i]) == 1){
                if(a[i] > b[i]){
                    result[i]="A";
                }else{
                    result[i]="B";
                }
            }else if(a[i] == b[i]){
                result[i] ="D";
            }else{
                if(a[i] > b[i]){
                    result[i]="B";
                }else{
                    result[i]="A";
                }
            }

        }

        return result;
    }

    public static void main(String[] args) {        
        Scanner sc = new Scanner(System.in);
        Study_2_3 kb = new Study_2_3();

        int n = sc.nextInt();

        int[] a = new int[n];
        int[] b = new int[n];

        for(int i=0; i<n; i++){
            a[i]=sc.nextInt();
        }
        for(int i=0; i<n; i++){
            b[i]=sc.nextInt();
        }
        String [] result = kb.solution(n,a,b);
       
        for (String string : result) {
            System.out.println(string);
        }

        // 배열로 받아서 String 일일이 더한다음에 나중에 kb.solution(n,a,b).toCharArray() 해서 foreach 돌려서도 가능 
     }
    
}
