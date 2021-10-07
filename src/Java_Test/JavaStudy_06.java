package Java_Test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class JavaStudy_06 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        int count = 0;	// 마지막자리가 1인 개수를 0개로 초기화 선언

        // 1부터 n까지 for문 반복
        for (int i=1; i<=n; i++) {
            int length = (int)String.valueOf(i).length();	// 입력받은 숫자만큼 for문이 돌면서 i의 자리수를 계산한다.
//            int length2 = (int)Integer.toString(i).length();  //위 값이랑 같은 값이 나온다.

            System.out.println("같냐:" + Integer.toString(i).length());
            if (String.valueOf(i).substring(length-1).equals("1")) {	// substring을 이용하여 마지막 자리 숫자를 알아내고 비교한다.
                count++;
            }
        }
        System.out.println(count);
        br.close();
    }

}
