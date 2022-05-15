package Java_Pra;

import java.util.Scanner;

public class testNew1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

            System.out.println("a:"+a+" b"+b);

            int s = 0;
            while(a<=b){
                a++;
                System.out.println("  s>>>" + s);
                int count = 1;
                while(s == 1) {
                    if (a % 2 == 1) {
                        s = 3 * a + 1;
                        count++;
                        System.out.println("홀수 s>> " + s);
                        System.out.println(count);
                    } else {
                        s = a / 2;
                        count++;
                        System.out.println("짝수 s>> " + s);
                        System.out.println(count);
                    }
                }
                System.out.println("a가 " + a + "일때 Count>" + count);
            }
    }
}
