package Java_CodeUp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class test_1287_1 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int dan = Integer.parseInt(br.readLine());

        //구구단은 1부터 9까지의 for 문을 반복
        for(int i=1; i<10; i++){
            for(int j=1; j<=dan*i; j++){
               // System.out.print("*");
                sb.append("#");
            }
           // System.out.println();
            sb.append("\n");
        }
        System.out.println(sb);
        br.close();

    }
}
