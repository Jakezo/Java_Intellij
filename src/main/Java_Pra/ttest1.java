package Java_Pra;

import java.util.Scanner;

public class ttest1 {
    public static void main(String[] args) {
     // 구구단 곱하는 뒤의 수가 앞의 수보다 작으면 출력하지 않는다 홀수단은 거꾸로 출력한다.

        for(int a=1; a<10; a++){
            for(int b=1; b<10; b++){
                if(a<=b) {
                    if(a%2==1){
                        System.out.println(a + "*" + (10-b) + "=" + a * (10-b));
                    }else {
                        System.out.println(a + "*" + b + "=" + a * b);
                    }
                }
            }
            System.out.println();
        }


    }
}
