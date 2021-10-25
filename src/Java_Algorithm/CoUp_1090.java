package Java_Algorithm;

import java.util.Scanner;

public class CoUp_1090 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int r = sc.nextInt();
        int n = sc.nextInt();

//        while(n-- >1){
//            a*= r;
//        }
        for(int i =1; i<n; i++){
            a*=r;
        }
        System.out.println(a);
        sc.close();
    }
}
