package Java_Pra;

import java.util.Scanner;

public class ttest3 {
    public static void mod(int x){
        System.out.println(x);
        int count = 1;
        if(x==1){
            System.out.println("count");
            System.out.println(count);
            return;
        }else if(x%2 == 0){
            // 짝수
            mod(x/2);
            count++;
        }else{
            // 홀수
            mod((3*x) + 1);
            count++;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int target = sc.nextInt();

        mod(target);
    }
}
