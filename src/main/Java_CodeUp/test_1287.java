package Java_CodeUp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class test_1287 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int dan = Integer.parseInt(br.readLine());

        // 구구단은 1~9까지 9번의 for 문을 반복
        for(int i=1; i<10; i++){
            //단 * 1~9 만큼 반복
            for(int j=0; j<dan*i; j++){
                sb.append("*");
            }
            sb.append("\n");
        }
        System.out.println(sb);
        br.close();

    }
}
