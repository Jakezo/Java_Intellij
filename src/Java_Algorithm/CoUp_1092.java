package Java_Algorithm;

import java.util.Scanner;

public class CoUp_1092 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a  = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        // 일반적인 수학공식인 공배슐룰 이용한 방법

        int common = 1;

        while (common%a!=0 || common%b!=0 || common%c!=0){
            common++; // 같이 다시 만날 날이 a,b,c, 와 나누어 떨어지지않으면 1씩 증가시켜라
        }
        System.out.println(common);
    }
}
