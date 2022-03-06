package Java_Pra;

 //콜라츠의 추측 우박수 문제
// 어떤 자연수 n 이 입력되면, n이 홀수이면 3n+1 을 하고 n 이 짝수이면 n/2 를 한다. 이 n이 1이 될때까지 반복한다.
// 시작수와 마지막수가 입력되면 그 두 사이의 길이가 가장 긴 우박수와 그 길이를 출력하라
// ex) 1 10   => 9 20

import java.util.Scanner;

public class ttest2 {

    public static void mod(int x){
        System.out.println(x);
        if(x==1){
            return;
        }else if(x%2 == 0){
            // 짝수
            mod(x/2);
        }else{
            // 홀수
            mod((3*x) + 1);
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int[] hailLengths = new int[100000000]; //우박수으 길이 관련 배열

        System.out.println("a>>"+a);

        int count = 1;
        int temp;
        while (a <= b) {
            while (a != 1) {
                temp = a;
                if (temp % 2 == 1) {
                    int result = (3 * a) + 1;
                    System.out.println(result);
                    a = result;
                    count++;
                } else {
                    int result = a / 2;
                    System.out.println(result);
                    a = result;
                    count++;
                }
            }
            System.out.println("count" + count);
            if(count == 1 ) {
                a++;
                System.out.println("a!!!!" + a);

            }
            if(count > 19) {
                break;
            }
        }
    }
}
