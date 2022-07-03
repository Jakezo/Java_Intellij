package Java_CodeUp;

/*
* 입력 Permalink
1) 세 자연수가 입력된다.
2) 각 값들은 도어락의 내부 보안키값을 의미한다.
3) 각 값은 1,000이하의 자연수이다.

출력 Permalink
가장 가격이 저렴한 만능보안키의 ID값을 출력한다.

예시 Permalink
입력 : 10 20 30

출력 : 10
* */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class test_1673_1 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int num1 = Integer.parseInt(st.nextToken());
        int num2 = Integer.parseInt(st.nextToken());
        int num3 = Integer.parseInt(st.nextToken());


        for(int i=num1; i>0; i--){
            if(num1%i==0 && num2%i==0 && num3%i==0){
                System.out.println(i);
                break;
            }
        }

        br.close();

    }
}
