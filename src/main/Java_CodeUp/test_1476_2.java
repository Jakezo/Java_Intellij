package Java_CodeUp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/*입력 Permalink
정수와 컴마로 이루어진 문자열이 공백없이 입력된다.(최대길이 100글자)

출력 Permalink
컴마(,)를 분리한 결과를 출력한다.

예시 Permalink
입력 : 4,52,600,-5,0

출력 : 4 52 600 -5 0*/

public class test_1476_2 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        String line =br.readLine();

        // 컴마를 기준으로 나누어 배열에 저장
        String[] words = line.split(",");

        for (String a : words){
            sb.append(a).append(" ");
        }

        System.out.println(sb);
        br.close();




        System.out.println();
    }
}
