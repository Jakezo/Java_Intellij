package Java_Pra;

//콜라츠의 추측 우박수 문제
// 어떤 자연수 n 이 입력되면, n이 홀수이면 3n+1 을 하고 n 이 짝수이면 n/2 를 한다. 이 n이 1이 될때까지 반복한다.
// 시작수와 마지막수가 입력되면 그 두 사이의 길이가 가장 긴 우박수와 그 길이를 출력하라
// ex) 1 10   => 9 20

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class test_collits {
    static int count =1;
    public static void cal(int x){
        count++;
        System.out.println(x);
        if(x ==1){
            System.out.println(count);
            return;
        }else if(x%2 == 1){
            count++;
            cal(3*x+1);
        }else{
            count++;
            cal(x/2);
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(),",");
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());

        cal(b);

    }
}
