package Java_CodeUp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// 구구단, a 단의 b 번째 까지 출력 ( * ) 을 사용해서

public class test_1287_2 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        StringTokenizer st = new StringTokenizer(br.readLine(),",");

        int  st1 = Integer.parseInt(st.nextToken());
        int  st2 = Integer.parseInt(st.nextToken());

        for(int i=1; i<=st2; i++){
            sb.append(st1+"X"+i+"="+(st1*i)+"->");
            for(int j=1; j<=st1*i; j++){
                sb.append("*");
            }
            sb.append("\n");
        }


        System.out.println(sb);
    }
}
