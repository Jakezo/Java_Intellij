package Java_Algorithm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

public class CoUp_1090 {
    public static void main(String[] args) throws IOException {
//        Scanner sc = new Scanner(System.in);
//
//        int a = sc.nextInt();
//        int r = sc.nextInt();
//        int n = sc.nextInt();
//
////        while(n-- >1){
////            a*= r;
////        }
//        for(int i =1; i<n; i++){
//            a*=r;
//        }
//        System.out.println(a);
//        sc.close();
//        Scanner sc = new Scanner(System.in);
//
//        int a = sc.nextInt();
//        int b = sc.nextInt();
//        int c = sc.nextInt();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        int c = Integer.parseInt(st.nextToken());

        for(int day=1; day <= 100; day++){
            if(day%a==0 &&day%b==0 && day%c==0){
                System.out.println("그 날은 >>" +day+"일 입니다.");
                break;
            }
        }
   //     sc.close();
        br.close();
    }
}
